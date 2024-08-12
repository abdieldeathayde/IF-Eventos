package tcc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProfessorDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/seu_banco_de_dados";
    private static final String USER = "seu_usuario";
    private static final String PASSWORD = "sua_senha";

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar ao banco de dados", e);
        }
    }

    public void inserirProfessor(Professor professor) {
        String sql = "INSERT INTO Professor (usuario, email, senha, cargo, telefone, nomeCivil, faculdade, nomeSocial, sexo, dataNascimento, tipoSanguineo, naturalidade, nacionalidade) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, professor.getUsuario());
            stmt.setString(2, professor.getEmail());
            stmt.setString(3, professor.getSenha());
            stmt.setString(4, professor.getCargo());
            stmt.setString(5, professor.getTelefone());
            stmt.setString(6, professor.getNomeCivil());
            stmt.setString(7, professor.getFaculdade());
            stmt.setString(8, professor.getNomeCivil());
            stmt.setString(9, professor.getCargo());
            stmt.setString(10, professor.getDataNascimento());
            stmt.setString(11, professor.getTipoSanguineo());
            stmt.setString(12, professor.getNacionalidade());
            stmt.setString(13, professor.getNacionalidade());

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Professor> listarProfessores() {
        List<Professor> professores = new ArrayList<>();
        String sql = "SELECT * FROM Professor";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Professor professor = new Professor();
                professor.setId(rs.getInt("id"));
                professor.setUsuario(rs.getString("usuario"));
                professor.setEmail(rs.getString("email"));
                professor.setSenha(rs.getString("senha"));
                professor.setCargo(rs.getString("cargo"));
                professor.setTelefone(rs.getString("telefone"));
                professor.setNomeCivil(rs.getString("nomeCivil"));
                professor.setFaculdade(rs.getString("faculdade"));
                professor.setNomeCivil(rs.getString("nomeSocial"));
                professor.setSexo(rs.getString("sexo"));
                professor.setDataNascimento(rs.getString("dataNascimento"));
                professor.setTipoSanguineo(rs.getString("tipoSanguineo"));
                professor.setNaturalidade(rs.getString("naturalidade"));
                professor.setNacionalidade(rs.getString("nacionalidade"));

                professores.add(professor);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return professores;
    }

    public void atualizarProfessor(Professor professor) {
        String sql = "UPDATE Professor SET usuario = ?, email = ?, senha = ?, cargo = ?, telefone = ?, nomeCivil = ?, faculdade = ?, nomeSocial = ?, sexo = ?, dataNascimento = ?, tipoSanguineo = ?, naturalidade = ?, nacionalidade = ? "
                   + "WHERE id = ?";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, professor.getUsuario());
            stmt.setString(2, professor.getEmail());
            stmt.setString(3, professor.getSenha());
            stmt.setString(4, professor.getCargo());
            stmt.setString(5, professor.getTelefone());
            stmt.setString(6, professor.getNomeCivil());
            stmt.setString(7, professor.getFaculdade());
            stmt.setString(8, professor.getNomeCivil());
            stmt.setString(9, professor.getCargo());
            stmt.setString(10, professor.getDataNascimento());
            stmt.setString(11, professor.getTipoSanguineo());
            stmt.setString(12, professor.getNacionalidade());
            stmt.setString(13, professor.getNacionalidade());
            stmt.setInt(14, professor.getId());

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletarProfessor(int id) {
        String sql = "DELETE FROM Professor WHERE id = ?";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Professor buscarProfessorPorId(int id) {
        String sql = "SELECT * FROM Professor WHERE id = ?";
        Professor professor = null;

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                professor = new Professor();
                professor.setId(rs.getInt("id"));
                professor.setUsuario(rs.getString("usuario"));
                professor.setEmail(rs.getString("email"));
                professor.setSenha(rs.getString("senha"));
                professor.setCargo(rs.getString("cargo"));
                professor.setTelefone(rs.getString("telefone"));
                professor.setNomeCivil(rs.getString("nomeCivil"));
                professor.setFaculdade(rs.getString("faculdade"));
                professor.setNomeCivil(rs.getString("nomeSocial"));
                professor.setSexo(rs.getString("sexo"));
                professor.setDataNascimento(rs.getString("dataNascimento"));
                professor.setTipoSanguineo(rs.getString("tipoSanguineo"));
                professor.setNaturalidade(rs.getString("naturalidade"));
                professor.setNacionalidade(rs.getString("nacionalidade"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return professor;
    }
}
