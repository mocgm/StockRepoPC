import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.*;

public class Tab4Funcionarios
{
    JPanel panel;

    //(idFuncionario, nome, endereco, cep, bairro, cidade, cpf, rg, telefone, email)

    static JLabel statusConexao;

    static JLabel entryFuncionario;
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

    static JTextField entryFuncionarioTextField;
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

    static JButton insert3;

    public Tab4Funcionarios()
    {
        panel = new JPanel(false);
        panel.setLayout(null);


        MainPanel.statusConexao = new JLabel("Conectando ao banco de dados...");
        MainPanel.statusConexao.setBounds(10, 5, 200, 30);
        MainPanel.statusConexao.setOpaque(true);

        entryFuncionario = new JLabel("Cógido do funcionário:");
        entryFuncionario.setBounds(10, 70, 200, 30);

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

        entryFuncionarioTextField = new JTextField();
        entryFuncionarioTextField.setBounds(220, 70, 200, 30);

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
        panel.add(entryFuncionario);
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

        panel.add(entryFuncionarioTextField);
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
