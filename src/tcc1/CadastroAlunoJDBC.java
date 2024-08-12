package tcc1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CadastroAlunoJDBC {

    private static final String URL = "jdbc:mysql://localhost:3306/seu_banco_de_dados";
    private static final String USER = "seu_usuario";
    private static final String PASSWORD = "sua_senha";

    public static void main(String[] args) {
        CadastroAlunoJDBC cadastro = new CadastroAlunoJDBC();
        cadastro.inserirAluno("usuarioExemplo", "senhaExemplo", "matriculaExemplo", "Nome Civil Exemplo", 
                              "Curso Exemplo", "email@exemplo.com", "123456789", "Nome Social Exemplo", 
                              "M", "2000-01-01", "Solteiro", "Cidade Exemplo", "Brasileira");
    }

    public void inserirAluno(String usuario, String senha, String matricula, String nomeCivil, 
                             String curso, String email, String telefone, String nomeSocial, 
                             String sexo, String dataNascimento, String estadoCivil, 
                             String naturalidade, String nacionalidade) {
        String sql = "INSERT INTO Aluno (usuario, senha, matricula, nomeCivil, curso, email, telefone, " +
                     "nomeSocial, sexo, dataNascimento, estadoCivil, naturalidade, nacionalidade) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, usuario);
            pstmt.setString(2, senha);
            pstmt.setString(3, matricula);
            pstmt.setString(4, nomeCivil);
            pstmt.setString(5, curso);
            pstmt.setString(6, email);
            pstmt.setString(7, telefone);
            pstmt.setString(8, nomeSocial);
            pstmt.setString(9, sexo);
            pstmt.setDate(10, java.sql.Date.valueOf(dataNascimento));
            pstmt.setString(11, estadoCivil);
            pstmt.setString(12, naturalidade);
            pstmt.setString(13, nacionalidade);

            pstmt.executeUpdate();
            System.out.println("Aluno inserido com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
