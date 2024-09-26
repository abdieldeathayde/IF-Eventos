package tcc1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class CadastroAluno extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField usuarioTF;
	private JPasswordField senhaTF1;
	private JPasswordField senhaTF2;
	private JTextField matriculaTF;
	private JTextField NomeCivilTF;
	private JTextField cursoTF;
	private JTextField emailTF;
	private JTextField telefoneTF;
	private JTextField NomeSocialTF;
	private JTextField sexoTF;
	private JTextField dataNascimentoTF;
	private JTextField estadoCivilTF;
	private JTextField naturalidadeTF;
	private JTextField NacionalidadeTF;

	/**
	 * * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroAluno frame = new CadastroAluno();
					URL caminhoImagem = this.getClass().getResource("IfscLogo.png");
					Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoImagem);

					frame.setIconImage(iconeTitulo);

					// ("C:Users/Athay/OneDrive/Imagens/Capturas de tela/Ifsc.png");
					frame.setTitle("IFSC-Eventos");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroAluno() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 920, 682);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel logoIFSC = new JLabel("");
		logoIFSC.setIcon(new ImageIcon(CadastroAluno.class.getResource("/tcc1/Ifsc.png")));
		logoIFSC.setBounds(34, 33, 306, 117);
		contentPane.add(logoIFSC);

		JLabel textoIncricaoTF = new JLabel("Inscrição Aluno");
		textoIncricaoTF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textoIncricaoTF.setForeground(Color.BLUE);
		textoIncricaoTF.setBackground(Color.BLUE);
		textoIncricaoTF.setBounds(139, 161, 199, 13);
		contentPane.add(textoIncricaoTF);

		JLabel campoUsuarioJLBL = new JLabel("Usuário:");
		campoUsuarioJLBL.setFont(new Font("Tahoma", Font.BOLD, 10));
		campoUsuarioJLBL.setBounds(44, 201, 45, 13);
		contentPane.add(campoUsuarioJLBL);

		usuarioTF = new JTextField();
		usuarioTF.setBounds(191, 199, 96, 19);
		contentPane.add(usuarioTF);
		usuarioTF.setColumns(10);

		JLabel campoSenhaJLBL = new JLabel("Senha:");
		campoSenhaJLBL.setFont(new Font("Tahoma", Font.BOLD, 10));
		campoSenhaJLBL.setBounds(44, 246, 45, 13);
		contentPane.add(campoSenhaJLBL);

		senhaTF1 = new JPasswordField();
		senhaTF1.setBounds(191, 244, 96, 19);
		contentPane.add(senhaTF1);

		JLabel campoEmailJLBL = new JLabel("Email:");
		campoEmailJLBL.setBounds(44, 300, 45, 13);
		contentPane.add(campoEmailJLBL);

		emailTF = new JTextField();
		emailTF.setBounds(191, 300, 96, 19);
		contentPane.add(emailTF);
		emailTF.setColumns(10);

		JLabel campoTelefoneJLBL = new JLabel("Telefone");
		campoTelefoneJLBL.setHorizontalAlignment(SwingConstants.LEFT);
		campoTelefoneJLBL.setBounds(44, 340, 85, 13);
		contentPane.add(campoTelefoneJLBL);

		telefoneTF = new JTextField();
		telefoneTF.setBounds(191, 340, 96, 19);
		contentPane.add(telefoneTF);
		telefoneTF.setColumns(10);

		JButton botaoInscricaoJButton = new JButton("Inscrever");
		botaoInscricaoJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				login.setVisible(true);
				try {
					inserirAluno();
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			}
		});
		botaoInscricaoJButton.setBackground(Color.WHITE);
		botaoInscricaoJButton.setForeground(Color.BLACK);
		botaoInscricaoJButton.setBounds(125, 400, 111, 21);
		contentPane.add(botaoInscricaoJButton);
	}

	public void inserirAluno() throws ClassNotFoundException, SQLException {
//		CadastroAluno cadastroAluno = new CadastroAluno();
		CadastroAluno.inserirAluno(usuarioTF.getText(), new String(senhaTF1.getPassword()), emailTF.getText(), telefoneTF.getText());

	}

	public static void inserirAluno(String usuario, String senha, String email, String telefone) throws ClassNotFoundException, SQLException {
			String sql = "INSERT INTO Aluno (usuario, senha, email, telefone)"
					+ " VALUES (?,?,?,?)" ;
	
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
		    
		try (Connection conn = ConexaoDAO.conectaBD();

				PreparedStatement pstmt = conn.prepareStatement(sql)) {
		
					pstmt.setString(1, usuario);
					pstmt.setString(2, senha.toString());
					
					pstmt.setString(3, email);
					pstmt.setString(4, telefone);
		
					pstmt.executeUpdate();
					conn.close();

			System.out.println("Aluno inserido 	com sucesso!");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	

	public static SimpleDateFormat getFormatData() {
		return formatData;
	}

	public static void setFormatData(SimpleDateFormat formatData) {
		CadastroAluno.formatData = formatData;
	}

	private static SimpleDateFormat formatData = new SimpleDateFormat("dd/MM/yyyy");
}
