package tcc1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.JButton;

public class CadastroProfessor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField UsuarioTF;
	private JTextField emailTF;
	private JTextField senhaTF1;
	private JTextField senhaTF2;
	private JTextField CargoTF;
	private JTextField telefoneTF;

	/**
	 * Launch the application.
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
		setForeground(Color.WHITE);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 844, 554);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel logoIFSCJLbl = new JLabel("");
		logoIFSCJLbl.setIcon(new ImageIcon(CadastroProfessor.class.getResource("/tcc1/Ifsc.png")));
		logoIFSCJLbl.setBounds(10, 1, 280, 138);
		contentPane.add(logoIFSCJLbl);
		
		JLabel campoUsuarioJLbl = new JLabel("Usuário:");
		campoUsuarioJLbl.setBounds(136, 186, 69, 13);
		contentPane.add(campoUsuarioJLbl);
		
		UsuarioTF = new JTextField();
		UsuarioTF.setBounds(245, 183, 96, 19);
		contentPane.add(UsuarioTF);
		UsuarioTF.setColumns(10);
		
		JLabel TextoJLbl = new JLabel("Inscrição Professor / Técnico");
		TextoJLbl.setFont(new Font("Tahoma", Font.BOLD, 10));
		TextoJLbl.setBounds(241, 126, 203, 13);
		contentPane.add(TextoJLbl);
		
		JLabel campoEmailJLbl = new JLabel("Email:");
		campoEmailJLbl.setBounds(136, 237, 45, 13);
		contentPane.add(campoEmailJLbl);
		
		emailTF = new JTextField();
		emailTF.setBounds(248, 234, 96, 19);
		contentPane.add(emailTF);
		emailTF.setColumns(10);
		
		JLabel campoSenhaJLbl = new JLabel("Digite a sua senha:");
		campoSenhaJLbl.setBounds(136, 290, 108, 13);
		contentPane.add(campoSenhaJLbl);
		
		senhaTF1 = new JPasswordField();
		senhaTF1.setBounds(254, 287, 96, 19);
		contentPane.add(senhaTF1);
		senhaTF1.setColumns(10);
		
		JLabel campoSenhaJlbl = new JLabel("Repita a senha:");
		campoSenhaJlbl.setBounds(136, 335, 108, 13);
		contentPane.add(campoSenhaJlbl);
		
		senhaTF2 = new JPasswordField();
		senhaTF2.setBounds(254, 332, 96, 19);
		contentPane.add(senhaTF2);
		senhaTF2.setColumns(10);
		
		JLabel campoCargoJLbl = new JLabel("Cargo:");
		campoCargoJLbl.setBounds(136, 379, 45, 13);
		contentPane.add(campoCargoJLbl);
		
		CargoTF = new JTextField();
		CargoTF.setBounds(254, 379, 96, 19);
		contentPane.add(CargoTF);
		CargoTF.setColumns(10);
		
		JLabel TelefoneJLbl = new JLabel("Telefone");
		TelefoneJLbl.setBounds(136, 433, 79, 13);
		contentPane.add(TelefoneJLbl);
		
		telefoneTF = new JTextField();
		telefoneTF.setBounds(254, 430, 96, 19);
		contentPane.add(telefoneTF);
		telefoneTF.setColumns(10);
		
		JButton btnNewButton = new JButton("Inscrever");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(176, 469, 123, 21);
		contentPane.add(btnNewButton);
	}

}
