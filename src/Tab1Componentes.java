
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.*;


//teste
class Tab1Componentes extends JComponent
{

    JPanel panel;
	//declaracao de labels e textfields da tab1
    //static JLabel statusConexao;
    //static JLabel entry;
    static JLabel info;
    static JLabel idComponente;
    static JLabel nomeComponente;
    static JLabel qtdComponente;
    static JLabel precoComponenteCliente;
    static JLabel precoComponenteRevendedor;
    static JLabel fabricanteComponente;
    static JLabel descricaoComponente;
    
    
    //static JTextField entryTextField;
    static JTextField idComponenteTextField;
    static JTextField nomeComponenteTextField;
    static JTextField qtdComponenteTextField;
    static JTextField precoComponenteClienteTextField;
    static JTextField precoComponenteRevendedorTextField;
    static JTextField fabricanteComponenteTextField;
    static JTextField descricaoComponenteTextField;
        
    static JButton insert;
	
	public Tab1Componentes()
	{
        panel = new JPanel(false);
        panel.setLayout(null);                        
        
        info = new JLabel("Cadastro de algum componente no banco de dados.");
        info.setBounds(10, 5, 300, 30);
        info.setOpaque(true);
        
        //entry = new JLabel("C�gido do componente:");
        //ntry.setBounds(10, 100, 200, 30);
        
        idComponente = new JLabel("Id do componente:");
        idComponente.setBounds(10, 140, 200, 30);
        
        nomeComponente = new JLabel("Nome do componente:");
        nomeComponente.setBounds(10, 180, 200, 30);
        
        qtdComponente = new JLabel("Quantidade do componente:");
        qtdComponente.setBounds(10, 220, 200, 30);
        
        precoComponenteCliente = new JLabel("Preço do componente (cliente):");
        precoComponenteCliente.setBounds(10, 260, 200, 30);
        
        precoComponenteRevendedor = new JLabel("Preço do componente (revendedor):");
        precoComponenteRevendedor.setBounds(10, 300, 200, 30);
        
        fabricanteComponente = new JLabel("Fabricante do componente:");
        fabricanteComponente.setBounds(10, 340, 200, 30);
        
        descricaoComponente = new JLabel("Descrição do componente:");
        descricaoComponente.setBounds(10, 380, 200, 30);
        
        //text fields
        
        //entryTextField = new JTextField();
        //entryTextField.setBounds(220, 100, 200, 30);
        
        idComponenteTextField = new JTextField();
        idComponenteTextField.setBounds(220, 140, 200, 30);
        
        nomeComponenteTextField = new JTextField();
        nomeComponenteTextField.setBounds(220, 180, 200, 30);
        
        qtdComponenteTextField = new JTextField();
        qtdComponenteTextField.setBounds(220, 220, 200, 30);
        
        precoComponenteClienteTextField = new JTextField();
        precoComponenteClienteTextField.setBounds(220, 260, 200, 30);
        
        precoComponenteRevendedorTextField = new JTextField();
        precoComponenteRevendedorTextField.setBounds(220, 300, 200, 30);
        
        fabricanteComponenteTextField = new JTextField();
        fabricanteComponenteTextField.setBounds(220, 340, 200, 30);
        
        descricaoComponenteTextField = new JTextField();
        descricaoComponenteTextField.setBounds(220, 380, 200, 30);
        
        
        
        insert = new JButton("Inserir dados");
        insert.setBounds(600, 150, 150, 60);
        insert.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        if (nomeComponenteTextField.getText().isEmpty() || fabricanteComponenteTextField.getText().isEmpty())
                        {
                            JOptionPane.showMessageDialog(null, 
                              "Os campos `Nome` e `Fabricante` não podem ser nulos.");
                            
                        }
                        else
                        {
                            try
                            {
                                PostgreSQL.insereComponente(                                        
                                        stringToInt(idComponenteTextField.getText()),
                                        nomeComponenteTextField.getText(),
                                        stringToInt(qtdComponenteTextField.getText()),
                                        stringToInt(precoComponenteClienteTextField.getText()),
                                        stringToInt(precoComponenteRevendedorTextField.getText()),
                                        fabricanteComponenteTextField.getText(),
                                        descricaoComponenteTextField.getText());                            

                                JOptionPane.showMessageDialog(null, 
                                  "Dados inseridos com sucesso!");
                                

                            }
                            catch (SQLException s){}
                            
                        }
                        
                        
                    }

                });
        
        
        
        panel.add(info);
        //panel.add(entry);
        panel.add(idComponente);
        panel.add(nomeComponente);
        panel.add(qtdComponente);
        panel.add(precoComponenteCliente);
        panel.add(precoComponenteRevendedor);
        panel.add(fabricanteComponente);
        panel.add(descricaoComponente);
        
        //panel.add(entryTextField);
        panel.add(idComponenteTextField);
        panel.add(nomeComponenteTextField);
        panel.add(qtdComponenteTextField);
        panel.add(precoComponenteClienteTextField);
        panel.add(precoComponenteRevendedorTextField);
        panel.add(fabricanteComponenteTextField);
        panel.add(descricaoComponenteTextField);
        
        panel.add(insert);
        
        
        
        
	
	
	
	
	
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