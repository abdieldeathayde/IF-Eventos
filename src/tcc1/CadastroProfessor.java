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

public class CadastroProfessor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField usuarioTF;
	private JPasswordField senhaTF1;
	private JTextField cargoTF;
	private JTextField NomeCivilTF;
	private JTextField faculdadeTF;
	private JTextField emailTF;
	private JTextField telefoneTF;
	private JTextField NomeSocialTF;
	private JTextField sexoTF;
	private JTextField dataNascimentoTF;
	private JTextField tipoSanguineoTF;
	private JTextField naturalidadeTF;
	private JTextField NacionalidadeTF;

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

		JLabel campoSenhaTF1 = new JLabel("Senha:");
		campoSenhaTF1.setFont(new Font("Tahoma", Font.BOLD, 10));
		campoSenhaTF1.setBounds(44, 246, 45, 13);
		contentPane.add(campoSenhaTF1);

		senhaTF1 = new JPasswordField();
		senhaTF1.setBounds(191, 244, 96, 19);
		contentPane.add(senhaTF1);

		

		JLabel CampocargoTF = new JLabel("Cargo:");
		CampocargoTF.setBounds(44, 345, 72, 13);
		contentPane.add(CampocargoTF);

		cargoTF = new JTextField();
		cargoTF.setBounds(191, 342, 96, 19);
		contentPane.add(cargoTF);
		cargoTF.setColumns(10);

		JLabel campoNomeCivilTF = new JLabel("Nome Civil:");
		campoNomeCivilTF.setHorizontalAlignment(SwingConstants.LEFT);
		campoNomeCivilTF.setBounds(44, 395, 124, 13);
		contentPane.add(campoNomeCivilTF);

		NomeCivilTF = new JTextField();
		NomeCivilTF.setBounds(191, 392, 96, 19);
		contentPane.add(NomeCivilTF);
		NomeCivilTF.setColumns(10);

		JLabel campofaculdadeTF = new JLabel("faculdade:");
		campofaculdadeTF.setBounds(44, 447, 45, 13);
		contentPane.add(campofaculdadeTF);

		faculdadeTF = new JTextField();
		faculdadeTF.setBounds(191, 444, 96, 19);
		contentPane.add(faculdadeTF);
		faculdadeTF.setColumns(10);

		JLabel campoEmailTF = new JLabel("Email:");
		campoEmailTF.setBounds(44, 492, 45, 13);
		contentPane.add(campoEmailTF);

		emailTF = new JTextField();
		emailTF.setBounds(191, 489, 96, 19);
		contentPane.add(emailTF);
		emailTF.setColumns(10);

		JLabel campoTelefoneTF = new JLabel("Telefone");
		campoTelefoneTF.setHorizontalAlignment(SwingConstants.LEFT);
		campoTelefoneTF.setBounds(44, 541, 85, 13);
		contentPane.add(campoTelefoneTF);

		telefoneTF = new JTextField();
		telefoneTF.setBounds(191, 538, 96, 19);
		contentPane.add(telefoneTF);
		telefoneTF.setColumns(10);

		JButton botaoInscricaoTF = new JButton("Inscrever");
		botaoInscricaoTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				login.setVisible(true);
				try {
					validarUsuarioESenha(usuarioTF.getText(), senhaTF1.getText());
					inserirProfessor();
					
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			}
		});
		botaoInscricaoTF.setBackground(Color.WHITE);
		botaoInscricaoTF.setForeground(Color.BLACK);
		botaoInscricaoTF.setBounds(125, 590, 111, 21);
		contentPane.add(botaoInscricaoTF);

		JLabel campoNomeSocialJLbl = new JLabel("Nome Social:");
		campoNomeSocialJLbl.setBounds(370, 201, 72, 13);
		contentPane.add(campoNomeSocialJLbl);

		NomeSocialTF = new JTextField();
		NomeSocialTF.setBounds(472, 198, 96, 19);
		contentPane.add(NomeSocialTF);
		NomeSocialTF.setColumns(10);

		JLabel campoSexoJLbl = new JLabel("Sexo:");
		campoSexoJLbl.setBounds(370, 246, 45, 13);
		contentPane.add(campoSexoJLbl);

		sexoTF = new JTextField();
		sexoTF.setBounds(472, 243, 96, 19);
		contentPane.add(sexoTF);
		sexoTF.setColumns(10);

		dataNascimentoTF = new JTextField();
		dataNascimentoTF.setBounds(472, 300, 96, 19);
		contentPane.add(dataNascimentoTF);
		dataNascimentoTF.setColumns(10);

		JLabel campoDataNascimentoJLbl = new JLabel("Data Nascimento:");
		campoDataNascimentoJLbl.setBounds(370, 303, 96, 13);
		contentPane.add(campoDataNascimentoJLbl);
		
		campoDataNascimentoJLbl.setBounds(380, 300, 96, 13);
		contentPane.add(campoDataNascimentoJLbl);
		
		JLabel campoTipoSanguineoJLbl = new JLabel("Tipo Sanguineo:");
		campoTipoSanguineoJLbl.setBounds(44, 303, 111, 13);
		contentPane.add(campoTipoSanguineoJLbl);
		
		tipoSanguineoTF = new JTextField();
		tipoSanguineoTF.setBounds(191, 300, 96, 19);
		contentPane.add(tipoSanguineoTF);
		tipoSanguineoTF.setColumns(10);
		
		
		JLabel campoEstadoCivilJLbl = new JLabel("Estado Civil:");
		campoEstadoCivilJLbl.setBounds(390, 395, 79, 13);
		contentPane.add(campoEstadoCivilJLbl);

		JTextField estadoCivilTF = new JTextField();
		estadoCivilTF.setBounds(472, 389, 96, 19);
		contentPane.add(estadoCivilTF);
		estadoCivilTF.setColumns(10);

		JLabel campoNaturalidadeJLbl = new JLabel("Naturalidade:");
		campoNaturalidadeJLbl.setBounds(370, 447, 72, 13);
		contentPane.add(campoNaturalidadeJLbl);

		naturalidadeTF = new JTextField();
		naturalidadeTF.setBounds(472, 444, 96, 19);
		contentPane.add(naturalidadeTF);
		naturalidadeTF.setColumns(10);

		JLabel NacionalidadeJLbl = new JLabel("Nacionalidade:");
		NacionalidadeJLbl.setBounds(370, 492, 85, 13);
		contentPane.add(NacionalidadeJLbl);

		NacionalidadeTF = new JTextField();
		NacionalidadeTF.setBounds(472, 489, 96, 19);
		contentPane.add(NacionalidadeTF);
		NacionalidadeTF.setColumns(10);
	}

	public void inserirProfessor() throws ClassNotFoundException, SQLException {
//		CadastroProfessor cadastroProfessor = new CadastroProfessor();
		CadastroProfessor.inserirProfessor(usuarioTF.getText(), emailTF.getText(), new String(senhaTF1.getPassword()), telefoneTF.getText(), cargoTF.getText(), NomeCivilTF.getText(), faculdadeTF.getText(),
				dataNascimentoTF.getText(), tipoSanguineoTF.getText(), naturalidadeTF.getText(),
				NacionalidadeTF.getText(), NomeSocialTF.getText(), sexoTF.getText());
	}
	
	public void validarUsuarioESenha(String usuario, String senha) {
		//Class.forName("com.mysql.cj.jdbc.Driver");
		/*try (Connection conn = ConexaoDAO.conectaBD();
				String sqlValidaSeUsuarioExiste = "SELECT ALUNO WHERE usuario = " + usuario;
				PreparedStatement pstmt = conn.prepareStatement(sqlValidaSeUsuarioExiste)) {
					
					if (usuario == usuarioTF.getText().toString()) {
						String sqlValidaSenha = "SELECT SENHA = " + senha + " WHERE USUARIO = " + usuario;
						System.out.println("Usuario e senha conferem!");
					}
		}
		*/
		
		
		
	}

	public static void inserirProfessor(String usuario, String email, String senha, String telefone, String cargo, String nomeCivil, String faculdade, String dataNascimento, String tipoSanguineo,
			String naturalidade, String nacionalidade, String nomeSocial, String sexo) throws ClassNotFoundException, SQLException {
			String sql = "INSERT INTO Professor (usuario, email, senha, telefone, cargo, nomeCivil, faculdade, dataNascimento, tipoSanguineo, naturalidade, nacionalidade, nomeSocial, sexo)"
					+ " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)" ;
	
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
		    
		try (Connection conn = ConexaoDAO.conectaBD();

				PreparedStatement pstmt = conn.prepareStatement(sql)) {
		
					pstmt.setString(1, usuario);
					pstmt.setString(2, email);
					pstmt.setString(3, senha);
					
					pstmt.setString(4, telefone);
					
					pstmt.setString(5, cargo);
					pstmt.setString(6, nomeCivil);
					pstmt.setString(7, faculdade);
					
					pstmt.setDate(8, Date.valueOf(LocalDate.parse(dataNascimento)));
					pstmt.setString(9, tipoSanguineo);
					
					pstmt.setString(10, naturalidade);
					pstmt.setString(11, nacionalidade);
					
					pstmt.setString(12, nomeSocial);
					pstmt.setString(13, sexo);
					

					
		
					pstmt.executeUpdate();
					conn.close();

			System.out.println("Professor inserido com sucesso!");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
		}
	}
	
	private static SimpleDateFormat formatData = new SimpleDateFormat("dd/MM/yyyy");
}
