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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		JLabel campoSenhaTF2 = new JLabel("Repita a Senha:");
		campoSenhaTF2.setBounds(44, 303, 111, 13);
		contentPane.add(campoSenhaTF2);
		
		senhaTF2 = new JPasswordField();
		senhaTF2.setBounds(191, 300, 96, 19);
		contentPane.add(senhaTF2);
		
		JLabel CampoMatriculaTF = new JLabel("Matrícula");
		CampoMatriculaTF.setBounds(44, 345, 72, 13);
		contentPane.add(CampoMatriculaTF);
		
		matriculaTF = new JTextField();
		matriculaTF.setBounds(191, 342, 96, 19);
		contentPane.add(matriculaTF);
		matriculaTF.setColumns(10);
		
		JLabel campoNomeCivilTF = new JLabel("Nome Civil:");
		campoNomeCivilTF.setHorizontalAlignment(SwingConstants.LEFT);
		campoNomeCivilTF.setBounds(44, 395, 124, 13);
		contentPane.add(campoNomeCivilTF);
		
		NomeCivilTF = new JTextField();
		NomeCivilTF.setBounds(191, 392, 96, 19);
		contentPane.add(NomeCivilTF);
		NomeCivilTF.setColumns(10);
		
		JLabel campoCursoTF = new JLabel("Curso:");
		campoCursoTF.setBounds(44, 447, 45, 13);
		contentPane.add(campoCursoTF);
		
		cursoTF = new JTextField();
		cursoTF.setBounds(191, 444, 96, 19);
		contentPane.add(cursoTF);
		cursoTF.setColumns(10);
		
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
		
		JLabel campoTipoSanguineoJLbl = new JLabel("Tipo Sanguíneo:");
		campoTipoSanguineoJLbl.setBounds(370, 345, 85, 13);
		contentPane.add(campoTipoSanguineoJLbl);
		
		JTextField tipoSanguineoTF = new JTextField();
		tipoSanguineoTF.setBounds(472, 342, 96, 19);
		contentPane.add(tipoSanguineoTF);
		tipoSanguineoTF.setColumns(10);
		
		JLabel campoEstadoCivilJLbl = new JLabel("Estado Civil:");
		campoEstadoCivilJLbl.setBounds(370, 395, 79, 13);
		contentPane.add(campoEstadoCivilJLbl);
		
		estadoCivilTF = new JTextField();
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
}
