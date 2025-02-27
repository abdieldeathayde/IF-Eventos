package tcc1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

public class CadastroAluno extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField usuarioTF;
	private JPasswordField senhaTF1;
	private static JFormattedTextField emailTF;
	private static JFormattedTextField telefoneJFTF;
	private JLabel campoUsuarioJLabel, campoEmailJLabel, telefoneJLabel; 

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
		setTitle("IFSC-Eventos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 920, 682);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel logoIFSC = new JLabel("");
		logoIFSC.setBounds(34, 33, 306, 117);
		logoIFSC.setIcon(new ImageIcon(CadastroAluno.class.getResource("/tcc1/Ifsc.png")));
		contentPane.add(logoIFSC);

		JLabel textoIncricaoTF = new JLabel("Inscrição Aluno");
		textoIncricaoTF.setBounds(139, 161, 199, 13);
		textoIncricaoTF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textoIncricaoTF.setForeground(Color.BLUE);
		textoIncricaoTF.setBackground(Color.BLUE);
		contentPane.add(textoIncricaoTF);
		


		

		usuarioTF = new JTextField();
		usuarioTF.setBounds(191, 199, 266, 19);
		contentPane.add(usuarioTF);
		usuarioTF.setColumns(10);


		JLabel campoSenhaJLBL = new JLabel("Senha:");
		campoSenhaJLBL.setBounds(44, 246, 45, 13);
		campoSenhaJLBL.setFont(new Font("Tahoma", Font.BOLD, 10));
		contentPane.add(campoSenhaJLBL);

		senhaTF1 = new JPasswordField();
		senhaTF1.setBounds(191, 244, 266, 19);
		contentPane.add(senhaTF1);

		
		
		emailTF = new JFormattedTextField();
		emailTF.setBounds(191, 300, 266, 19);
		contentPane.add(emailTF);
		emailTF.setColumns(10);
		
		String email = emailTF.toString();
		boolean isValidEmail = email.matches("^[\\w\\.-]+@[a-zA-Z\\d\\.-]+\\.[a-zA-Z]{2,6}$");

		

		telefoneJFTF = new JFormattedTextField();
		telefoneJFTF.setToolTipText("");
		telefoneJFTF.setBounds(191, 340, 266, 19);
		contentPane.add(telefoneJFTF);
		telefoneJFTF.setColumns(10);
		
		

		
		
		JButton botaoInscricaoJButton = new JButton("Inscrever");
		botaoInscricaoJButton.setBounds(125, 400, 111, 21);
		botaoInscricaoJButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String email = emailTF.getText();
				String senha = new String(senhaTF1.getPassword());
				
				
			
				try {
					validarCampos();
					inserirAluno();
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				dispose();
			}
		});
		JLabel campoUsuarioJLBL = new JLabel("Usuário:");
		campoUsuarioJLBL.setBounds(44, 201, 45, 13);
		campoUsuarioJLBL.setFont(new Font("Tahoma", Font.BOLD, 10));
		contentPane.add(campoUsuarioJLBL);
		
		JLabel campoEmailJLBL = new JLabel("Email:");
		campoEmailJLBL.setBounds(44, 300, 45, 13);
		contentPane.add(campoEmailJLBL);
		
		JLabel campoTelefoneJLBL = new JLabel("Telefone");
		campoTelefoneJLBL.setBounds(44, 340, 85, 13);
		campoTelefoneJLBL.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(campoTelefoneJLBL);
		
		
		
		
		botaoInscricaoJButton.setBackground(Color.WHITE);
		botaoInscricaoJButton.setForeground(Color.BLACK);
		contentPane.add(botaoInscricaoJButton);
		
		
	}

	public void inserirAluno() throws ClassNotFoundException, SQLException {

		CadastroAluno.inserirAluno(usuarioTF.getText(), senhaTF1.getPassword(), emailTF.getText(), telefoneJFTF.getText());

	}

	public static void inserirAluno(String usuario, char[] senha, String email, String telefone) throws ClassNotFoundException, SQLException {
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

			//System.out.println("Aluno inserido 	com sucesso!");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}	
	
	/*
	 * private static boolean validarCampos() {
		// String usuario = usuarioTF.getText();
		String email = emailTF.getText();
		String telefone = telefoneTF.getText();

//
//		System.out.println(validarEmail(email) ? "Email válido" : "Email inválido");
//		System.out.println(validarTelefone(telefone) ? "Telefone válido" : "Telefone inválido");

		
	 */

	private static boolean validarCampos() {
			//String usuario = usuarioTF.getText();
			String email = emailTF.getText();
			
			String telefone = telefoneJFTF.getText();
			
			
			boolean isEmailValid = email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");

			boolean isTelefoneValid = telefone.matches("^\\(?\\d{2}\\)?[\\s-]?\\d{4,5}[-]?\\d{4}$");
					
			//System.out.println(isEmailValid ? "Usuário válido" : "Usuário inválido");


			

			if (isEmailValid) {
				JOptionPane.showMessageDialog(emailTF, "Email cadastrado com sucesso!");
				

			} else {
				JOptionPane.showMessageDialog(emailTF, "Erro! Email inválido ou Já cadastrado! Tente novamente!");
				return false;

			}
			
			if (isTelefoneValid) {
				JOptionPane.showMessageDialog(telefoneJFTF, "Telefone cadastrado com sucesso!");
				
			} else {
				JOptionPane.showMessageDialog(telefoneJFTF, "Telefone inválido ou já cadastrado! Tente novamente!");
				return false;
			}
			return isTelefoneValid;
			
		

			

		
			
			
		}
	
	 	private boolean validarEmail(String email) {
	        String emailRegex = "^[\\w.-]+@[a-zA-Z\\d.-]+\\.[a-zA-Z]{2,6}$";
	        return Pattern.matches(emailRegex, email);
	    }

	    private boolean validarTelefone(String phone) {
	        String phoneRegex = "^\\(?\\d{2,9}\\)?[\\s-]?\\d{4,9}-\\d{4,9}$";
	        return Pattern.matches(phoneRegex, phone);
	    }
	
	
	    public static SimpleDateFormat getFormatData() {
	    	return formatData;
	}

	public static void setFormatData(SimpleDateFormat formatData) {
		CadastroAluno.formatData = formatData;
	}
	 
	
	public MaskFormatter MascaraEmail(String EmailMascara) {
		MaskFormatter F_Mascara = new MaskFormatter();
		try {
			F_Mascara.setMask(EmailMascara);
			F_Mascara.setPlaceholderCharacter(' ');
		} catch(Exception e) {
			e.printStackTrace();
		}
		return F_Mascara;
	}
	
	
	
	
	public MaskFormatter Mascara(String Mascara) {
		MaskFormatter F_Mascara = new MaskFormatter();
		try {
			F_Mascara.setMask(Mascara);
			F_Mascara.setPlaceholderCharacter(' ');
		} catch (Exception e) {
			e.printStackTrace();
		}
		return F_Mascara;
	}

	
	
	
	private static SimpleDateFormat formatData = new SimpleDateFormat("dd/MM/yyyy");
}
