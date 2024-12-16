package tcc1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConexaoDAO {

    

    public static Connection conectaBD() {
    	Connection conn = null;
    	
    	
    	
    	try {
    		String url = "jdbc:mysql://localhost:3306/studies?user=root&password=88567731";
    		conn = DriverManager.getConnection(url);
    		
    	} catch (SQLException erro) {
    		erro.printStackTrace();
			JOptionPane.showMessageDialog(null, erro.getMessage());
		}
    	return conn;
    }
    //public static void main(String[] args) throws Exception{
		//CadastroAluno.inserirAluno("abd","abd","abd","abd","abd","abd","abd","abd","abd","2022-01-01","abd","abd","abd");
	//}

    
}
