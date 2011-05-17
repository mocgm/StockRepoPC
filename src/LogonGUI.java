//entrada das informacoes do servidor do banco de dados
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class LogonGUI
{
    private JFrame frame1;
    private JButton okButton;
    
    private JLabel informacaoEntrada;
    private JLabel hostLabel;
    private JLabel portLabel;
    private JLabel databaseLabel;
    private JLabel userLabel;
    private JLabel passwordLabel;
    static JTextField hostTextField;
    static JTextField portTextField;
    static JTextField databaseTextField;
    static JTextField userTextField;
    static JPasswordField passwordTextField;
    
    
    public LogonGUI()
    {
        
        
        frame1 = new JFrame("StockRepoPC");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLayout(null);
        
        informacaoEntrada = new JLabel("Insira as informações do servidor e do banco de dados:");
        informacaoEntrada.setBounds(20, 20, 350, 30);
        
        hostLabel = new JLabel("Host:");
        hostLabel.setBounds(90, 80, 100, 30);
        
        portLabel = new JLabel("Porta:");
        portLabel.setBounds(90, 110, 100, 30);
        
        databaseLabel = new JLabel("Database:");
        databaseLabel.setBounds(90, 140, 100, 30);
        
        userLabel = new JLabel("Nome de usuário:");
        userLabel.setBounds(90, 170, 100, 30);
        
        passwordLabel = new JLabel("Senha:");
        passwordLabel.setBounds(90, 200, 100, 30);
        
        hostTextField = new JTextField();
        hostTextField.setBounds(195, 80, 120, 25);
        
        portTextField = new JTextField();
        portTextField.setBounds(195, 110, 120, 25);
        
        databaseTextField = new JTextField();
        databaseTextField.setBounds(195, 140, 120, 25);
        
        userTextField = new JTextField();
        userTextField.setBounds(195, 170, 120, 25);
        
        passwordTextField = new JPasswordField();
        passwordTextField.setBounds(195, 200, 120, 25);
        
        okButton = new JButton("OK");
        okButton.setBounds(150, 300, 80, 30);
        okButton.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent e)
                    {
                        MainPanel mp = new MainPanel();
                        MainPanel.createAndShowGUI();
                                                
                       try
                        {
                            MySQL.connectToDB();
                            
                            frame1.setVisible(false);
                        }
                        catch (SQLException S)
                        {
                            frame1.setVisible(true);
                            MainPanel.frame.setVisible(false);
                            JOptionPane.showMessageDialog(null, 
                              "Não foi possível estabelecer a conexão.");
                            //Main.statusConexao.setText("Erro ao conectar-se");

                            //Main.statusConexao.setBackground(Color.red);
                            
                            /*hostTextField.setText("");;
                            portTextField.setText("");
                            databaseTextField.setText("");
                            userTextField.setText("");
                            passwordTextField.setText("");*/
                            
                            
                        }
                        
                    }
                    
                });
        
        
        
        frame1.add(okButton);
        frame1.add(informacaoEntrada);
        frame1.add(hostLabel);
        frame1.add(portLabel);
        frame1.add(databaseLabel);
        frame1.add(userLabel);
        frame1.add(passwordLabel);
        frame1.add(hostTextField);
        frame1.add(portTextField);
        frame1.add(databaseTextField);
        frame1.add(userTextField);
        frame1.add(passwordTextField);
        
        frame1.setResizable(false);
        frame1.setSize(400, 400);
        frame1.setVisible(true);
    }
}
