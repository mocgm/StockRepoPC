import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.*;

public class Tab5Fornecedores
{
    JPanel panel;

    //(nome, endereco, cep, bairro, cidade, cnpj, telefone, email)

    static JLabel statusConexao;

    static JLabel entryFornecedor;
    static JLabel nomeFornecedor;
    static JLabel endFornecedor;
    static JLabel cepFornecedor;
    static JLabel bairroFornecedor;
    static JLabel cidadeFornecedor;
    static JLabel cnpjFornecedor;
    static JLabel telFornecedor;
    static JLabel emailFornecedor;
    

    static JTextField entryFornecedorTextField;
    static JTextField nomeFornecedorTextField;
    static JTextField endFornecedorTextField;
    static JTextField cepFornecedorTextField;
    static JTextField bairroFornecedorTextField;
    static JTextField cidadeFornecedorTextField;
    static JTextField cnpjFornecedorTextField;
    static JTextField telFornecedorTextField;
    static JTextField emailFornecedorTextField;
    

    static JButton insert5;

    public Tab5Fornecedores()
    {
        panel = new JPanel(false);
        panel.setLayout(null);


        MainPanel.statusConexao = new JLabel("Conectando ao banco de dados...");
        MainPanel.statusConexao.setBounds(10, 5, 200, 30);
        MainPanel.statusConexao.setOpaque(true);

        entryFornecedor = new JLabel("Cógido do fornecedor:");
        entryFornecedor.setBounds(10, 70, 200, 30);

        nomeFornecedor = new JLabel("Nome do fornecedor:");
        nomeFornecedor.setBounds(10, 110, 200, 30);

        endFornecedor = new JLabel("Endereço do fornecedor:");
        endFornecedor.setBounds(10, 150, 200, 30);

        cepFornecedor = new JLabel("CEP:");
        cepFornecedor.setBounds(10, 190, 200, 30);

	bairroFornecedor = new JLabel("Bairro:");
        bairroFornecedor.setBounds(10, 230, 200, 30);

	cidadeFornecedor = new JLabel("Cidade:");
        cidadeFornecedor.setBounds(10, 270, 200, 30);

        cnpjFornecedor = new JLabel("CNPJ:");
        cnpjFornecedor.setBounds(10, 310, 200, 30);

        telFornecedor = new JLabel("Telefone:");
        telFornecedor.setBounds(10, 350, 200, 30);

        emailFornecedor = new JLabel("Email:");
        emailFornecedor.setBounds(10, 390, 200, 30);

        //text fields

        entryFornecedorTextField = new JTextField();
        entryFornecedorTextField.setBounds(220, 70, 200, 30);

        nomeFornecedorTextField = new JTextField();
        nomeFornecedorTextField.setBounds(220, 110, 200, 30);

        endFornecedorTextField = new JTextField();
        endFornecedorTextField.setBounds(220, 150, 200, 30);

        cepFornecedorTextField = new JTextField();
        cepFornecedorTextField.setBounds(220, 190, 200, 30);

	bairroFornecedorTextField = new JTextField();
        bairroFornecedorTextField.setBounds(220, 230, 200, 30);

	cidadeFornecedorTextField = new JTextField();
        cidadeFornecedorTextField.setBounds(220, 270, 200, 30);

        cnpjFornecedorTextField = new JTextField();
        cnpjFornecedorTextField.setBounds(220, 310, 200, 30);

        telFornecedorTextField = new JTextField();
        telFornecedorTextField.setBounds(220, 350, 200, 30);

        emailFornecedorTextField = new JTextField();
        emailFornecedorTextField.setBounds(220, 390, 200, 30);

        
        insert5 = new JButton("Inserir dados");
        insert5.setBounds(600, 150, 150, 60);
        /*insert3.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        if (entryTextField.getText().isEmpty() || idComponenteTextField.getText().isEmpty())
                        {
                            JOptionPane.showMessageDialog(null,
                              "Dados não podem ser nulos.");

                        }
                        else
                        {
                            try
                            {
                                MySQL.insereComponente(
                                        stringToInt(entryTextField.getText()),
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

                });*/


        panel.add(MainPanel.statusConexao);
        panel.add(entryFornecedor);
        panel.add(nomeFornecedor);
        panel.add(endFornecedor);
        panel.add(cepFornecedor);
        panel.add(bairroFornecedor);
        panel.add(cidadeFornecedor);
        panel.add(cnpjFornecedor);
        panel.add(telFornecedor);
        panel.add(emailFornecedor);
        
        panel.add(entryFornecedorTextField);
        panel.add(nomeFornecedorTextField);
        panel.add(endFornecedorTextField);
        panel.add(cepFornecedorTextField);
        panel.add(bairroFornecedorTextField);
        panel.add(cidadeFornecedorTextField);
        panel.add(cnpjFornecedorTextField);
        panel.add(telFornecedorTextField);
        panel.add(emailFornecedorTextField);
        
        panel.add(insert5);






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
