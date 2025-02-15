package tcc1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Login;
	private JTextField Senha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 934, 755);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel LogoIFSC = new JLabel("");
		LogoIFSC.setBounds(24, 10, 287, 87);
		LogoIFSC.setIcon(new ImageIcon(Login.class.getResource("/tcc1/Ifsc.png")));
		contentPane.add(LogoIFSC);
		
		JLabel LoginLabel = new JLabel("Entrar no sistema");
		LoginLabel.setForeground(Color.BLUE);
		LoginLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		LoginLabel.setBackground(Color.BLUE);
		LoginLabel.setBounds(108, 145, 159, 13);
		contentPane.add(LoginLabel);
		
		


		
		Login = new JTextField();
		Login.setBounds(183, 197, 96, 19);
		contentPane.add(Login);
		Login.setColumns(10);
		
		Senha = new JPasswordField();
		Senha.setBounds(183, 236, 96, 19);
		contentPane.add(Senha);
		Senha.setColumns(10);
		
		JButton BotaoLogin = new JButton("Entrar");
		BotaoLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela tela = new Tela();
				tela.setVisible(true);
				dispose();
			}
		});
		BotaoLogin.setBackground(Color.WHITE);
		BotaoLogin.setBounds(123, 293, 85, 21);
		contentPane.add(BotaoLogin);
		
		JLabel inscricaoAlunoTF = new JLabel("Inscreva-se Aluno");
		inscricaoAlunoTF.setBounds(266, 297, 102, 13);
		contentPane.add(inscricaoAlunoTF);
		
		JLabel InscricaoTecnicoTF = new JLabel("Inscreva-se Docente/Técnico");
		InscricaoTecnicoTF.setBounds(266, 341, 166, 13);
		contentPane.add(InscricaoTecnicoTF);
		
		JLabel campoLoginTF = new JLabel("Login:");
		campoLoginTF.setBounds(51, 200, 45, 13);
		contentPane.add(campoLoginTF);
		
		JLabel campoSenhaTF = new JLabel("Senha:");
		campoSenhaTF.setBounds(51, 239, 45, 13);
		contentPane.add(campoSenhaTF);
	}
}
