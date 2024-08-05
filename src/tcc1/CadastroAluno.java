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

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

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

	/**
	 * Launch the application.
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		textoIncricaoTF.setBounds(247, 160, 199, 13);
		contentPane.add(textoIncricaoTF);
		
		JLabel campoUsuarioTF = new JLabel("Usuário:");
		campoUsuarioTF.setFont(new Font("Tahoma", Font.BOLD, 10));
		campoUsuarioTF.setBounds(152, 200, 45, 13);
		contentPane.add(campoUsuarioTF);
		
		usuarioTF = new JTextField();
		usuarioTF.setBounds(299, 198, 96, 19);
		contentPane.add(usuarioTF);
		usuarioTF.setColumns(10);
		
		JLabel campoSenhaTF1 = new JLabel("Senha:");
		campoSenhaTF1.setFont(new Font("Tahoma", Font.BOLD, 10));
		campoSenhaTF1.setBounds(152, 245, 45, 13);
		contentPane.add(campoSenhaTF1);
		
		senhaTF1 = new JPasswordField();
		senhaTF1.setBounds(299, 243, 96, 19);
		contentPane.add(senhaTF1);
		
		JLabel campoSenhaTF2 = new JLabel("Repita a Senha:");
		campoSenhaTF2.setBounds(152, 302, 111, 13);
		contentPane.add(campoSenhaTF2);
		
		senhaTF2 = new JPasswordField();
		senhaTF2.setBounds(299, 299, 96, 19);
		contentPane.add(senhaTF2);
		
		JLabel CampoMatriculaTF = new JLabel("Matrícula");
		CampoMatriculaTF.setBounds(152, 344, 72, 13);
		contentPane.add(CampoMatriculaTF);
		
		matriculaTF = new JTextField();
		matriculaTF.setBounds(299, 341, 96, 19);
		contentPane.add(matriculaTF);
		matriculaTF.setColumns(10);
		
		JLabel campoNomeCivilTF = new JLabel("Nome Civil:");
		campoNomeCivilTF.setHorizontalAlignment(SwingConstants.LEFT);
		campoNomeCivilTF.setBounds(152, 394, 124, 13);
		contentPane.add(campoNomeCivilTF);
		
		NomeCivilTF = new JTextField();
		NomeCivilTF.setBounds(299, 391, 96, 19);
		contentPane.add(NomeCivilTF);
		NomeCivilTF.setColumns(10);
		
		JLabel campoCursoTF = new JLabel("Curso:");
		campoCursoTF.setBounds(152, 446, 45, 13);
		contentPane.add(campoCursoTF);
		
		cursoTF = new JTextField();
		cursoTF.setBounds(299, 443, 96, 19);
		contentPane.add(cursoTF);
		cursoTF.setColumns(10);
		
		JLabel campoEmailTF = new JLabel("Email:");
		campoEmailTF.setBounds(152, 491, 45, 13);
		contentPane.add(campoEmailTF);
		
		emailTF = new JTextField();
		emailTF.setBounds(299, 488, 96, 19);
		contentPane.add(emailTF);
		emailTF.setColumns(10);
		
		JLabel campoTelefoneTF = new JLabel("Telefone");
		campoTelefoneTF.setHorizontalAlignment(SwingConstants.LEFT);
		campoTelefoneTF.setBounds(152, 540, 85, 13);
		contentPane.add(campoTelefoneTF);
		
		telefoneTF = new JTextField();
		telefoneTF.setBounds(299, 537, 96, 19);
		contentPane.add(telefoneTF);
		telefoneTF.setColumns(10);
		
		JButton botaoInscricaoTF = new JButton("Inscrever");
		botaoInscricaoTF.setBackground(Color.WHITE);
		botaoInscricaoTF.setForeground(Color.BLACK);
		botaoInscricaoTF.setBounds(233, 589, 111, 21);
		contentPane.add(botaoInscricaoTF);
	}
}
