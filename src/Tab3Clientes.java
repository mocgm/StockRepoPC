import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.*;

public class Tab3Clientes
{
    JPanel panel;

    static JLabel statusConexao;
    static JLabel entryCliente;
    static JLabel idCliente;
    static JLabel nomeCliente;
    static JLabel endCliente;
    static JLabel bairroCliente;
    static JLabel cidadeCliente;
    static JLabel cepCliente;
    static JLabel cpfCliente;
    static JLabel rgCliente;
    static JLabel cnpjCliente;
    static JLabel telCliente;
    static JLabel emailCliente;

    static JTextField entryClienteTextField;
    static JTextField idClienteTextField;
    static JTextField nomeClienteTextField;
    static JTextField endClienteTextField;
    static JTextField bairroClienteTextField;
    static JTextField cidadeClienteTextField;
    static JTextField cepClienteTextField;
    static JTextField cpfClienteTextField;
    static JTextField rgClienteTextField;
    static JTextField cnpjClienteTextField;
    static JTextField telClienteTextField;
    static JTextField emailClienteTextField;

    static JButton insert3;

    public Tab3Clientes()
    {
        panel = new JPanel(false);
        panel.setLayout(null);


        MainPanel.statusConexao = new JLabel("Conectando ao banco de dados...");
        MainPanel.statusConexao.setBounds(10, 5, 200, 30);
        MainPanel.statusConexao.setOpaque(true);

        entryCliente = new JLabel("Cógido do cliente:");
        entryCliente.setBounds(10, 70, 200, 30);

        idCliente = new JLabel("Id do cliente:");
        idCliente.setBounds(10, 110, 200, 30);

        nomeCliente = new JLabel("Nome do cliente:");
        nomeCliente.setBounds(10, 150, 200, 30);

        endCliente = new JLabel("Endereço do cliente:");
        endCliente.setBounds(10, 190, 200, 30);

	bairroCliente = new JLabel("Bairro:");
        bairroCliente.setBounds(10, 230, 200, 30);

	cidadeCliente = new JLabel("Cidade:");
        cidadeCliente.setBounds(10, 270, 200, 30);

        cepCliente = new JLabel("Cep:");
        cepCliente.setBounds(10, 310, 200, 30);

        cpfCliente = new JLabel("CPF:");
        cpfCliente.setBounds(10, 350, 200, 30);

        rgCliente = new JLabel("RG:");
        rgCliente.setBounds(10, 390, 200, 30);

        cnpjCliente = new JLabel("CNPJ (se for uma empresa):");
        cnpjCliente.setBounds(10, 430, 200, 30);

	telCliente = new JLabel("Telefone:");
	telCliente.setBounds(10, 470, 200, 30);

	emailCliente = new JLabel("Email:");
	emailCliente.setBounds(10, 510, 200, 30);

        //text fields

        entryClienteTextField = new JTextField();
        entryClienteTextField.setBounds(220, 70, 200, 30);

        idClienteTextField = new JTextField();
        idClienteTextField.setBounds(220, 110, 200, 30);

        nomeClienteTextField = new JTextField();
        nomeClienteTextField.setBounds(220, 150, 200, 30);

        endClienteTextField = new JTextField();
        endClienteTextField.setBounds(220, 190, 200, 30);

	bairroClienteTextField = new JTextField();
        bairroClienteTextField.setBounds(220, 230, 200, 30);

	cidadeClienteTextField = new JTextField();
        cidadeClienteTextField.setBounds(220, 270, 200, 30);

        cepClienteTextField = new JTextField();
        cepClienteTextField.setBounds(220, 310, 200, 30);

        cpfClienteTextField = new JTextField();
        cpfClienteTextField.setBounds(220, 350, 200, 30);

        rgClienteTextField = new JTextField();
        rgClienteTextField.setBounds(220, 390, 200, 30);

        cnpjClienteTextField = new JTextField();
        cnpjClienteTextField.setBounds(220, 430, 200, 30);

	telClienteTextField = new JTextField();
	telClienteTextField.setBounds(220, 470, 200, 30);

	emailClienteTextField = new JTextField();
	emailClienteTextField.setBounds(220, 510, 200, 30);



        insert3 = new JButton("Inserir dados");
        insert3.setBounds(600, 150, 150, 60);
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
        panel.add(entryCliente);
        panel.add(idCliente);
        panel.add(nomeCliente);
        panel.add(endCliente);
        panel.add(bairroCliente);
        panel.add(cidadeCliente);
        panel.add(cepCliente);
        panel.add(cpfCliente);
        panel.add(rgCliente);
        panel.add(cnpjCliente);
        panel.add(telCliente);
        panel.add(emailCliente);

        panel.add(entryClienteTextField);
        panel.add(idClienteTextField);
        panel.add(nomeClienteTextField);
        panel.add(endClienteTextField);
        panel.add(bairroClienteTextField);
        panel.add(cidadeClienteTextField);
        panel.add(cepClienteTextField);
        panel.add(cpfClienteTextField);
        panel.add(rgClienteTextField);
        panel.add(cnpjClienteTextField);
        panel.add(telClienteTextField);
        panel.add(emailClienteTextField);

        panel.add(insert3);






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
