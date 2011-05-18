import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.*;

public class Tab2Produtos
{
    

    JPanel panel;

	//declaracao de labels e textfields da tab2
    static JLabel info;
    static JLabel entryProduto;
    static JLabel nomeProduto;
    static JLabel qtdProduto;
    static JLabel descricaoProduto;

    static JTextField entryProdutoTextField;
    static JTextField nomeProdutoTextField;
    static JTextField qtdProdutoTextField;
    static JTextField descricaoProdutoTextField;

    static JButton insert2;


    public Tab2Produtos()
    {
        
        
        panel = new JPanel(false);
        panel.setLayout(null);
        
        


        info = new JLabel("Cadastro de algum produto no banco de dados.");
        info.setBounds(10, 5, 300, 30);
        info.setOpaque(true);

        entryProduto = new JLabel("Cógido do produto:");
        entryProduto.setBounds(10, 100, 200, 30);

        nomeProduto = new JLabel("Nome do produto:");
        nomeProduto.setBounds(10, 140, 200, 30);

        qtdProduto = new JLabel("Quantidade do produto:");
        qtdProduto.setBounds(10, 180, 200, 30);

        descricaoProduto = new JLabel("Descrição do produto:");
        descricaoProduto.setBounds(10, 220, 200, 30);


        //text fields

        entryProdutoTextField = new JTextField();
        entryProdutoTextField.setBounds(220, 100, 200, 30);

        nomeProdutoTextField = new JTextField();
        nomeProdutoTextField.setBounds(220, 140, 200, 30);

        qtdProdutoTextField = new JTextField();
        qtdProdutoTextField.setBounds(220, 180, 200, 30);

        descricaoProdutoTextField = new JTextField();
        descricaoProdutoTextField.setBounds(220, 220, 200, 30);



        insert2 = new JButton("Inserir dados");
        insert2.setBounds(600, 150, 150, 60);
        insert2.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        if (nomeProdutoTextField.getText().isEmpty())
                        {
                            JOptionPane.showMessageDialog(null,
                              "Dados não podem ser nulos.");

                        }
                        else
                        {
                            try
                            {
                                PostgreSQL.insereProduto(
                                        //stringToInt(entryProdutoTextField.getText()),
                                        nomeProdutoTextField.getText(),
                                        stringToInt(qtdProdutoTextField.getText()),
                                        descricaoProdutoTextField.getText());
                                JOptionPane.showMessageDialog(null,
                                  "Dados inseridos com sucesso!");


                            }
                            catch (SQLException s){}

                        }


                    }

                });


        
        panel.add(info);
        //panel.add(entryProduto);
        
        panel.add(nomeProduto);
        panel.add(qtdProduto);
        panel.add(descricaoProduto);

        //panel.add(entryProdutoTextField);
        panel.add(nomeProdutoTextField);
        panel.add(qtdProdutoTextField);
        panel.add(descricaoProdutoTextField);

        panel.add(insert2);
        





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
