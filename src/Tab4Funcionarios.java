import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.*;

public class Tab4Funcionarios
{
    JPanel panel;

    //(idFuncionario, nome, endereco, cep, bairro, cidade, cpf, rg, telefone, email)

    static JLabel info;    
    
    static JLabel idFuncionario;
    static JLabel nomeFuncionario;
    static JLabel endFuncionario;
    static JLabel bairroFuncionario;
    static JLabel cidadeFuncionario;
    static JLabel cepFuncionario;
    static JLabel cpfFuncionario;
    static JLabel rgFuncionario;
    static JLabel telFuncionario;
    static JLabel emailFuncionario;

    static JTextField idFuncionarioTextField;
    static JTextField nomeFuncionarioTextField;
    static JTextField endFuncionarioTextField;
    static JTextField bairroFuncionarioTextField;
    static JTextField cidadeFuncionarioTextField;
    static JTextField cepFuncionarioTextField;
    static JTextField cpfFuncionarioTextField;
    static JTextField rgFuncionarioTextField;
    static JTextField telFuncionarioTextField;
    static JTextField emailFuncionarioTextField;

    static JButton insert4;

    public Tab4Funcionarios()
    {
        panel = new JPanel(false);
        panel.setLayout(null);


        info = new JLabel("Cadastro de funcionários no banco de dados.");
        info.setBounds(10, 5, 200, 30);
        info.setOpaque(true);

        idFuncionario = new JLabel("Id do funcionário:");
        idFuncionario.setBounds(10, 110, 200, 30);

        nomeFuncionario = new JLabel("Nome do funcionário:");
        nomeFuncionario.setBounds(10, 150, 200, 30);

        endFuncionario = new JLabel("Endereço do funcionário:");
        endFuncionario.setBounds(10, 190, 200, 30);

	bairroFuncionario = new JLabel("Bairro:");
        bairroFuncionario.setBounds(10, 230, 200, 30);

	cidadeFuncionario = new JLabel("Cidade:");
        cidadeFuncionario.setBounds(10, 270, 200, 30);

        cepFuncionario = new JLabel("Cep:");
        cepFuncionario.setBounds(10, 310, 200, 30);

        cpfFuncionario = new JLabel("CPF:");
        cpfFuncionario.setBounds(10, 350, 200, 30);

        rgFuncionario = new JLabel("RG:");
        rgFuncionario.setBounds(10, 390, 200, 30);

        telFuncionario = new JLabel("Telefone:");
        telFuncionario.setBounds(10, 430, 200, 30);

	emailFuncionario = new JLabel("Email:");
	emailFuncionario.setBounds(10, 470, 200, 30);

        //text fields

        idFuncionarioTextField = new JTextField();
        idFuncionarioTextField.setBounds(220, 110, 200, 30);

        nomeFuncionarioTextField = new JTextField();
        nomeFuncionarioTextField.setBounds(220, 150, 200, 30);

        endFuncionarioTextField = new JTextField();
        endFuncionarioTextField.setBounds(220, 190, 200, 30);

	bairroFuncionarioTextField = new JTextField();
        bairroFuncionarioTextField.setBounds(220, 230, 200, 30);

	cidadeFuncionarioTextField = new JTextField();
        cidadeFuncionarioTextField.setBounds(220, 270, 200, 30);

        cepFuncionarioTextField = new JTextField();
        cepFuncionarioTextField.setBounds(220, 310, 200, 30);

        cpfFuncionarioTextField = new JTextField();
        cpfFuncionarioTextField.setBounds(220, 350, 200, 30);

        rgFuncionarioTextField = new JTextField();
        rgFuncionarioTextField.setBounds(220, 390, 200, 30);

        telFuncionarioTextField = new JTextField();
	telFuncionarioTextField.setBounds(220, 430, 200, 30);

	emailFuncionarioTextField = new JTextField();
	emailFuncionarioTextField.setBounds(220, 470, 200, 30);



        insert4 = new JButton("Inserir dados");
        insert4.setBounds(600, 150, 150, 60);
        insert4.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        if (    nomeFuncionarioTextField.getText().isEmpty() || 
                                endFuncionarioTextField.getText().isEmpty() ||
                                bairroFuncionarioTextField.getText().isEmpty() ||
                                cidadeFuncionarioTextField.getText().isEmpty() ||
                                cepFuncionarioTextField.getText().isEmpty() ||
                                telFuncionarioTextField.getText().isEmpty())
                        {
                            JOptionPane.showMessageDialog(null,
                              "Dados não podem ser nulos.");

                        }
                        else
                        {
                            try
                            {
                                
                                PostgreSQL.insereFuncionario(
                                        stringToInt(idFuncionarioTextField.getText()),
                                        nomeFuncionarioTextField.getText(),
                                        endFuncionarioTextField.getText(),
                                        bairroFuncionarioTextField.getText(),
                                        cidadeFuncionarioTextField.getText(),
                                        cepFuncionarioTextField.getText(),
                                        cpfFuncionarioTextField.getText(),
                                        rgFuncionarioTextField.getText(),                                        
                                        telFuncionarioTextField.getText(),
                                        emailFuncionarioTextField.getText());

                                JOptionPane.showMessageDialog(null,
                                  "Dados inseridos com sucesso!");


                            }
                            catch (SQLException s){}

                        }


                    }

                });


        panel.add(info);
        panel.add(idFuncionario);
        panel.add(nomeFuncionario);
        panel.add(endFuncionario);
        panel.add(bairroFuncionario);
        panel.add(cidadeFuncionario);
        panel.add(cepFuncionario);
        panel.add(cpfFuncionario);
        panel.add(rgFuncionario);
        panel.add(telFuncionario);
        panel.add(emailFuncionario);
        
        panel.add(idFuncionarioTextField);
        panel.add(nomeFuncionarioTextField);
        panel.add(endFuncionarioTextField);
        panel.add(bairroFuncionarioTextField);
        panel.add(cidadeFuncionarioTextField);
        panel.add(cepFuncionarioTextField);
        panel.add(cpfFuncionarioTextField);
        panel.add(rgFuncionarioTextField);
        panel.add(telFuncionarioTextField);
        panel.add(emailFuncionarioTextField);

        panel.add(insert4);






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
