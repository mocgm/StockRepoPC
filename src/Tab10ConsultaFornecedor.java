import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Tab10ConsultaFornecedor
{
    JPanel panel;
    TableModel modelo;
    JTable tabela;
    JLabel info;
    JButton consulta;

    //(nome, endereco, cep, bairro, cidade, cnpj, telefone, email)

        

    
    public Tab10ConsultaFornecedor()
    {
        panel = new JPanel(false);
        panel.setLayout(null);


        info = new JLabel("Realize aqui uma consulta rápida aos fornecedores cadastrados no sistema.");
        info.setBounds(10, 5, 500, 30);
        
        
        modelo = new TableModel();
    
        // constrói a tabela
        tabela = new JTable(modelo);
        
        
        //colunas
        modelo.addColumn("entry");        
        modelo.addColumn("nome");
        modelo.addColumn("endereco");
        modelo.addColumn("bairro");
        modelo.addColumn("cidade");
        modelo.addColumn("cep");
        modelo.addColumn("cnpj");        ;        
        modelo.addColumn("telefone");
        modelo.addColumn("email");
        
        consulta = new JButton("Consultar");
        consulta.setBounds(510, 5, 100, 30);
        consulta.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        //remove linhas, se ja existirem algumas
                        //e insere as novas linhas provenientes da consulta
                        modelo.setRowCount(0);
                        try
                        {
                            Statement stmt = PostgreSQL.conn.createStatement();
                              String query = "SELECT * FROM stock.fornecedor";
                              ResultSet rs = stmt.executeQuery(query);

                              while(rs.next()){ 
                               int entry = rs.getInt("entry");                               
                                String nome = rs.getString("nome");
                                String end = rs.getString("endereco");
                                String bairro = rs.getString("bairro");
                                String cidade = rs.getString("cidade");                                
                                String cep = rs.getString("cep");
                                String cnpj = rs.getString("cnpj");                                
                                String tel = rs.getString("telefone");
                                String email = rs.getString("email");
                                modelo.addRow(  new Object[]{new Integer(entry),                                                  
                                                nome, 
                                                end, 
                                                bairro, 
                                                cidade, 
                                                cep, 
                                                cnpj,                                                                                               
                                                tel,
                                                email});
                            
                        }
                        }
                        catch (SQLException S)
                        {
                            
                        }
                        catch (Exception ex)
                        {
                            
                        }
                    }
                    
                    
                });

        
        
        //modelo.addRow("1", "2", "3", "");
        
        tabela.setPreferredScrollableViewportSize(new Dimension(350, 50));
        
        JScrollPane scrollPane = new JScrollPane(tabela);
        scrollPane.setBounds(50, 50, 650, 450);
        
        panel.add(scrollPane);
        panel.add(consulta);
        panel.add(info);



    }

    public int stringToInt(String s)
    {
        return Integer.parseInt(s);
    }

     public JComponent getPanel()
    {
            return panel;
    }


}
