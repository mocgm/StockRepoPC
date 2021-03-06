

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import javax.swing.*;



public class MainPanel extends JPanel 
{
    static JFrame frame;
   
   
	     	
   
    
    public MainPanel(){
        super(new GridLayout(1, 1));
        
        JTabbedPane tabbedPane = new JTabbedPane();
        Tab1Componentes tb1 = new Tab1Componentes();
        Tab2Produtos tb2 = new Tab2Produtos();
        Tab3Clientes tb3 = new Tab3Clientes();
        Tab4Funcionarios tb4 = new Tab4Funcionarios();
        Tab5Fornecedores tb5 = new Tab5Fornecedores();
        Tab6ConsultaComponentes tb6 = new Tab6ConsultaComponentes();
        Tab7ConsultaProdutos tb7 = new Tab7ConsultaProdutos();
        Tab8ConsultaCliente tb8 = new Tab8ConsultaCliente();
        Tab9ConsultaFuncionario tb9 = new Tab9ConsultaFuncionario();
        Tab10ConsultaFornecedor tb10 = new Tab10ConsultaFornecedor();
        
        
        tabbedPane.addTab("Cadastro de componentes", tb1.getPanel());
        tabbedPane.addTab("Cadastro de produtos", tb2.getPanel());
	tabbedPane.addTab("Cadastro de clientes", tb3.getPanel());
        tabbedPane.addTab("Cadastro de funcionários", tb4.getPanel());
        tabbedPane.addTab("Cadastro de fornecedores", tb5.getPanel());
        tabbedPane.addTab("Consulta de componentes", tb6.getPanel());
        tabbedPane.addTab("Consulta de produtos", tb7.getPanel());
        tabbedPane.addTab("Consulta de clientes", tb8.getPanel());
        tabbedPane.addTab("Consulta de funcionários", tb9.getPanel());
        tabbedPane.addTab("Consulta de fornecedores", tb10.getPanel());
   
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

