package tcc1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.desktop.ScreenSleepEvent;
import java.net.URL;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.regex.Pattern;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.io.Reader;
import java.awt.event.ActionEvent;

public class CadastroProfessor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField usuarioTF;
	private JPasswordField senhaTF1;
	private static JTextField cpfTF = new JTextField();

	private static JTextField emailTF;
	private static JTextField telefoneTF;
	private JTextField dataNascimentoTF;

	/**
	 * * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroProfessor frame = new CadastroProfessor();
					URL caminhoImagem = this.getClass().getResource("IfscLogo.png");
					Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoImagem);

					frame.setIconImage(iconeTitulo);

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
	public CadastroProfessor() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 920, 682);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel logoIFSC = new JLabel("");
		logoIFSC.setIcon(new ImageIcon(CadastroProfessor.class.getResource("/tcc1/Ifsc.png")));
		logoIFSC.setBounds(34, 33, 306, 117);
		contentPane.add(logoIFSC);

		JLabel textoIncricaoTF = new JLabel("Inscrição Professor");
		textoIncricaoTF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textoIncricaoTF.setForeground(Color.BLUE);
		textoIncricaoTF.setBackground(Color.BLUE);
		textoIncricaoTF.setBounds(139, 161, 199, 13);
		contentPane.add(textoIncricaoTF);

		JLabel campoUsuarioTF = new JLabel("Usuário:");
		campoUsuarioTF.setFont(new Font("Tahoma", Font.BOLD, 10));
		campoUsuarioTF.setBounds(44, 201, 45, 13);
		contentPane.add(campoUsuarioTF);

		usuarioTF = new JTextField();
		usuarioTF.setBounds(191, 199, 96, 19);
		contentPane.add(usuarioTF);
		usuarioTF.setColumns(10);

		JLabel campoSenhaJLBL = new JLabel("Senha:");
		campoSenhaJLBL.setFont(new Font("Tahoma", Font.BOLD, 10));
		campoSenhaJLBL.setBounds(44, 269, 45, 13);
		contentPane.add(campoSenhaJLBL);

		senhaTF1 = new JPasswordField();
		senhaTF1.setBounds(191, 266, 96, 19);
		contentPane.add(senhaTF1);

		JLabel campoCPFJLBL = new JLabel("CPF:");
		campoCPFJLBL.setFont(new Font("Tahoma", Font.BOLD, 10));
		campoCPFJLBL.setBounds(44, 231, 45, 13);
		contentPane.add(campoCPFJLBL);

		cpfTF.setBounds(191, 228, 96, 19);
		contentPane.add(cpfTF);

		// regex professor email e telefone jcalendar validação email e senha

		JLabel campoEmailjlbl = new JLabel("Email:");
		campoEmailjlbl.setBounds(44, 300, 45, 13);
		contentPane.add(campoEmailjlbl);

		emailTF = new JTextField();
		emailTF.setBounds(191, 300, 96, 19);
		contentPane.add(emailTF);
		emailTF.setColumns(10);

		JLabel campoTelefoneJLBL = new JLabel("Telefone");
		campoTelefoneJLBL.setHorizontalAlignment(SwingConstants.LEFT);
		campoTelefoneJLBL.setBounds(44, 344, 85, 13);
		contentPane.add(campoTelefoneJLBL);

		telefoneTF = new JTextField();
		telefoneTF.setBounds(191, 344, 96, 19);
		contentPane.add(telefoneTF);
		telefoneTF.setColumns(10);

		JLabel campoDataNascimentoJLbl = new JLabel("Data Nascimento:");
		campoDataNascimentoJLbl.setBounds(44, 400, 116, 13);
		contentPane.add(campoDataNascimentoJLbl);

		dataNascimentoTF = new JTextField();
		dataNascimentoTF.setBounds(191, 397, 96, 19);
		contentPane.add(dataNascimentoTF);
		dataNascimentoTF.setColumns(10);

		JButton botaoInscricaoJButton = new JButton("Inscrever");
		botaoInscricaoJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				login.setVisible(true);
				try {
					// validarUsuarioESenha(usuarioTF.getText(), senhaTF1.getPassword(),
					// emailTF.getText(), telefoneTF.getText());
					inserirProfessor(usuarioTF.getText(), senhaTF1.getPassword(), emailTF.getText(),
							telefoneTF.getText(), dataNascimentoTF.getText());

				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			}
		});
		botaoInscricaoJButton.setBackground(Color.WHITE);
		botaoInscricaoJButton.setForeground(Color.BLACK);
		botaoInscricaoJButton.setBounds(125, 460, 111, 21);
		contentPane.add(botaoInscricaoJButton);

	}

	private static boolean validarCampos() {
		// String usuario = usuarioTF.getText();
		String email = emailTF.getText();
		String telefone = telefoneTF.getText();



		boolean isEmailValid = email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
		
	
		

		String cpf = cpfTF.getText();

		Boolean isValidCPF = cpf.matches("^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$");
		
		Boolean isValidTelefone = telefone.matches("^\\(?\\d{2}\\)?[\\s-]?\\d{4,5}[-]?\\d{4}$");


		if (isEmailValid) {
			JOptionPane.showMessageDialog(emailTF, "Email cadastrado com sucesso!");
			

		} else {
			JOptionPane.showMessageDialog(emailTF, "Erro! Email inválido ou já cadastrado! Tente novamente!");
			return false;

		}
		

		if (isValidCPF) {
			JOptionPane.showMessageDialog(cpfTF, " cpf sem erro!");

		} else {
			JOptionPane.showMessageDialog(cpfTF, "Erro! cpf! tente novamente no formato errado!");
			return false;

		}
		
		
		
		
		if (isValidTelefone) {
			JOptionPane.showMessageDialog(telefoneTF, "Telefone sem erro!");
		} else {
			JOptionPane.showMessageDialog(telefoneTF, "Erro! Telefone no formato errado! Tente novamente!");
			return false;
		}
		
		return isValidTelefone;



	}



	private boolean validarEmail(String email) {
		String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		return Pattern.matches(emailRegex, email);
	}

	private boolean validarTelefone(String phone) {
		String phoneRegex = "^\\(?\\d{2,9}\\)?[\\s-]?\\d{4,9}-\\d{4,9}$";
		return Pattern.matches(phoneRegex, phone);
	}

	public static void inserirProfessor(String usuario, char[] senha, String email, String telefone,
			String dataNascimento) throws ClassNotFoundException, SQLException {
		String sql = "INSERT INTO Professor (usuario, senha, email, telefone, dataNascimento)" + " VALUES (?,?,?,?,?)";

		Class.forName("com.mysql.cj.jdbc.Driver");



		try (Connection conn = ConexaoDAO.conectaBD();

				PreparedStatement pstmt = conn.prepareStatement(sql)) {

			pstmt.setString(1, usuario);
			pstmt.setString(2, senha.toString());
			pstmt.setString(3, email);

			pstmt.setString(4, telefone);

			pstmt.setDate(5, Date.valueOf(LocalDate.parse(dataNascimento)));

			pstmt.executeUpdate();
			conn.close();



		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
		}
	}

	private static SimpleDateFormat formatData = new SimpleDateFormat("dd/MM/yyyy");
}
