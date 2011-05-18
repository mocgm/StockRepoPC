import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.*;

public class Tab3Clientes
{
    JPanel panel;
    
    static JLabel info;
    
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


        info = new JLabel("Cadastro de clientes no banco de dados.");
        info.setBounds(10, 5, 300, 30);
        info.setOpaque(true);

        idCliente = new JLabel("Id do cliente:");
        idCliente.setBounds(10, 80, 200, 30);

        nomeCliente = new JLabel("Nome do cliente:");
        nomeCliente.setBounds(10, 120, 200, 30);

        endCliente = new JLabel("Endereço do cliente:");
        endCliente.setBounds(10, 160, 200, 30);

	bairroCliente = new JLabel("Bairro:");
        bairroCliente.setBounds(10, 200, 200, 30);

	cidadeCliente = new JLabel("Cidade:");
        cidadeCliente.setBounds(10, 240, 200, 30);

        cepCliente = new JLabel("Cep:");
        cepCliente.setBounds(10, 280, 200, 30);

        cpfCliente = new JLabel("CPF:");
        cpfCliente.setBounds(10, 320, 200, 30);

        rgCliente = new JLabel("RG:");
        rgCliente.setBounds(10, 360, 200, 30);

        cnpjCliente = new JLabel("CNPJ (se for uma empresa):");
        cnpjCliente.setBounds(10, 400, 200, 30);

	telCliente = new JLabel("Telefone:");
	telCliente.setBounds(10, 440, 200, 30);

	emailCliente = new JLabel("Email:");
	emailCliente.setBounds(10, 480, 200, 30);

        //text fields

        
        idClienteTextField = new JTextField();
        idClienteTextField.setBounds(220, 80, 200, 30);

        nomeClienteTextField = new JTextField();
        nomeClienteTextField.setBounds(220, 120, 200, 30);

        endClienteTextField = new JTextField();
        endClienteTextField.setBounds(220, 160, 200, 30);

	bairroClienteTextField = new JTextField();
        bairroClienteTextField.setBounds(220, 200, 200, 30);

	cidadeClienteTextField = new JTextField();
        cidadeClienteTextField.setBounds(220, 240, 200, 30);

        cepClienteTextField = new JTextField();
        cepClienteTextField.setBounds(220, 280, 200, 30);

        cpfClienteTextField = new JTextField();
        cpfClienteTextField.setBounds(220, 320, 200, 30);

        rgClienteTextField = new JTextField();
        rgClienteTextField.setBounds(220, 360, 200, 30);

        cnpjClienteTextField = new JTextField();
        cnpjClienteTextField.setBounds(220, 400, 200, 30);

	telClienteTextField = new JTextField();
	telClienteTextField.setBounds(220, 440, 200, 30);

	emailClienteTextField = new JTextField();
	emailClienteTextField.setBounds(220, 480, 200, 30);



        insert3 = new JButton("Inserir dados");
        insert3.setBounds(600, 150, 150, 60);
        insert3.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        if (    nomeClienteTextField.getText().isEmpty() || 
                                endClienteTextField.getText().isEmpty() ||
                                bairroClienteTextField.getText().isEmpty() ||
                                cidadeClienteTextField.getText().isEmpty() ||
                                cepClienteTextField.getText().isEmpty() ||
                                telClienteTextField.getText().isEmpty())
                        {
                            JOptionPane.showMessageDialog(null,
                              "Dados não podem ser nulos.");

                        }
                        else
                        {
                            try
                            {
                                
                                PostgreSQL.insereCliente(
                                        stringToInt(idClienteTextField.getText()),
                                        nomeClienteTextField.getText(),
                                        endClienteTextField.getText(),
                                        bairroClienteTextField.getText(),
                                        cidadeClienteTextField.getText(),
                                        cepClienteTextField.getText(),
                                        cpfClienteTextField.getText(),
                                        rgClienteTextField.getText(),
                                        cnpjClienteTextField.getText(),
                                        telClienteTextField.getText(),
                                        emailClienteTextField.getText());

                                JOptionPane.showMessageDialog(null,
                                  "Dados inseridos com sucesso!");


                            }
                            catch (SQLException s){}

                        }


                    }

                });


        panel.add(info);
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
