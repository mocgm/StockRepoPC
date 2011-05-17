
import java.awt.Color;
import java.sql.Connection;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class PostgreSQL {

    /*private static final String host     = "brivendare.dyndns.biz";
    private static final String port     = "3306";
    private static final String database = "aluno";
    private static final String user     = "root";
    private static final String password = "harod";*/
    
    private static  String host;
    private static String port;
    private static String database;
    private static String user;
    private static String password;
    public static Connection conn;
    
    static void connectToDB() throws SQLException
    {
        host = LogonGUI.hostTextField.getText();
        port = LogonGUI.portTextField.getText();
        database = LogonGUI.databaseTextField.getText();
        user = LogonGUI.userTextField.getText();
        password = LogonGUI.passwordTextField.getText();
        // Formato do string de conexao no mysql:
        // jdbc:mysql://servidor:porta/nomebd?user=usuario&password=senha
        String url = "jdbc:postgresql://" + host + ":" + port + "/" + database
            + "?user=" + user + "&password=" + password;
        //Class.forName(driver); // desnecessario no Java SE 6
        conn = DriverManager.getConnection(url);
        
               
        
        
    }
    
    /*static void insereAlunos() throws SQLException 
    {
        
        insereAluno(1111, "Fulano de Tal");
        insereAluno(2222, "Ciclano de Tal");
        insereAluno(3333, "Joao da Silva");
        
        System.out.println("ALUNOS CADASTRADOS POR CODIGO:");
        listaAlunos("codigo");
        System.out.println("ALUNOS CADASTRADOS POR NOME:");
        listaAlunos("nome");
        
        /*System.out.println("EXCLUINDO ALUNO 1111...");
        excluiAluno(1111);
        System.out.println("ALUNOS CADASTRADOS APOS EXCLUSAO:");
        listaAlunos("codigo");
        System.out.println("EXCLUINDO TODOS OS ALUNOS...");
        excluiAlunos();
    }*/
    
    
    /*static void listaAlunos(String ordem) throws SQLException {
        int n = 0;
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM aluno ORDER BY " + ordem);
        while (rs.next()) {
            System.out.println(String.format("%08d %s", rs.getInt("codigo"),
                    rs.getString("nome")));
            n++;
        }
        System.out.println(n + " alunos cadastrados");
    }
    
    static void insereAluno(int codigo, String nome) throws SQLException {
        PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO aluno(codigo, nome) VALUES (?, ?)");
        ps.setInt(1, codigo);
        ps.setString(2, nome);
        ps.executeUpdate();
    }*/
    
    
    
    static void insereComponente(int id, String nome, int qtd, int precoC, int precoR, String fabricante, String descricao) throws SQLException
    {
        PreparedStatement ps = conn.prepareStatement("INSERT INTO stock.componente (id, nome, quantidade, precocliente, precorevendedor, fabricante, descricao)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?) ");
        
        ps.setInt(1, id);
        ps.setString(2, nome);
        ps.setInt(3, qtd);
        ps.setInt(4, precoC);
        ps.setInt(5, precoR);
        ps.setString(6, fabricante);
        ps.setString(7, descricao);
        ps.executeUpdate();
        
                
        
    }
	
	static void insereProduto( String nome, int qtd, String descricao) throws SQLException
	{
                
		PreparedStatement ps = conn.prepareStatement("INSERT INTO stock.produto (nome, quantidade, descricao)"
				+ " VALUES (?, ?, ?)");
				
		//ps.setInt(1, entry);
		ps.setString(1, nome);
		ps.setInt(2, qtd);
		ps.setString(3, descricao);
		ps.executeUpdate();
	
	}
	
	static void insereCliente(int entry, int id, String nome, String end, String bairro, String cidade, int cep, int cpf, int rg, int cnpj, int tel, String email) throws SQLException
	{
		PreparedStatement ps = conn.prepareStatement("INSERT INTO clientes (entry, idCliente, nome, endereco, bairro, cidade, cep, cpf, rg, cnpj, telefone, email)"
			+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			
		ps.setInt(1, entry);
		ps.setInt(2, id);
		ps.setString(3, nome);
		ps.setString(4, end);
		ps.setString(5, bairro);
		ps.setString(6, cidade);
		ps.setInt(7, cep);
		ps.setInt(8, cpf);
		ps.setInt(9, rg);
		ps.setInt(10, cnpj);
		ps.setInt(11, tel);
		ps.setString(12, email);
		ps.executeUpdate();
	
	
	
	}
    
    static void excluiAluno(int codigo) throws SQLException {
        PreparedStatement ps = conn.prepareStatement(
                "DELETE FROM aluno WHERE codigo = ?");
        ps.setInt(1, codigo);
        ps.executeUpdate();
    }
    
    static void excluiAlunos() throws SQLException {
        Statement stmt = conn.createStatement();
        int n = stmt.executeUpdate("DELETE FROM aluno");
        System.out.println(n + " registros excluidos");
    }
    
}
