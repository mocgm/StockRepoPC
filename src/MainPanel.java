

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import javax.swing.*;



public class MainPanel extends JPanel 
{
    static JFrame frame;
   
   
	
    public static JLabel statusConexao;
    
	
   
    
    public MainPanel(){
        super(new GridLayout(1, 1));
        
        JTabbedPane tabbedPane = new JTabbedPane();
        Tab1Componentes tb1 = new Tab1Componentes();
        Tab2Produtos tb2 = new Tab2Produtos();
        Tab3Clientes tb3 = new Tab3Clientes();
        Tab4Funcionarios tb4 = new Tab4Funcionarios();
        Tab5Fornecedores tb5 = new Tab5Fornecedores();
        Tab7ConsultaProdutos tb7 = new Tab7ConsultaProdutos();
        
        
        tabbedPane.addTab("Cadastro de componentes", tb1.getPanel());
        tabbedPane.addTab("Cadastro de produtos", tb2.getPanel());
	tabbedPane.addTab("Cadastro de clientes", tb3.getPanel());
        tabbedPane.addTab("Cadastro de funcionários", tb4.getPanel());
        tabbedPane.addTab("Cadastro de fornecedores", tb5.getPanel());
        tabbedPane.addTab("Consulta de Produtos", tb7.getPanel());
   
        add(tabbedPane);
        
        //The following line enables to use scrolling tabs.
        //tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
    }
          
    
 
                         
    
    public static void createAndShowGUI() 
    {
        //Create and set up the window.
                
        
        frame = new JFrame("StockRepoPC");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Add content to the window.
        frame.add(new MainPanel(), null);
        
        //Display the window.
        //frame.pack();
        frame.setResizable(false);
        frame.setSize(800, 600);
        frame.setVisible(true);
        
        
    }
   
     
    
}

