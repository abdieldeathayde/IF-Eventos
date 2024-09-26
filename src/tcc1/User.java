package tcc1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JTextField;

public class User extends Tela {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel LabelCampoNomeSocial;
	private JTextField EstadoCivilTF;
	private JTextField DataNascimentoTF;
	private JTextField MatriculaTF;
	private JTextField NomeCivilTF;
	private JTextField NomeSocialTF;
	private JTextField CursoTF;
	private JTextField SexoTF;
	private JTextField TipoSanguineoTF;
	private JTextField NaturalidadeTF;
	private JTextField RacaTF;
	private JTextField SenhaTF;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField EscolaridadeTF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User frame = new User();
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
	public User() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 556, 619);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel LabelCampoMatricula = new JLabel("Matrícula:");
		LabelCampoMatricula.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel LabelCampoNomeCivil = new JLabel("Nome Civil:");
		LabelCampoNomeCivil.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		LabelCampoNomeSocial = new JLabel("Nome Social:");
		LabelCampoNomeSocial.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel LabelCampoCurso = new JLabel("Curso:");
		LabelCampoCurso.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel LabelIFSCLogo = new JLabel("");
		LabelIFSCLogo.setIcon(new ImageIcon(User.class.getResource("/tcc1/image 8.png")));
		
		JLabel LabelCampoSexo = new JLabel("Sexo:");
		LabelCampoSexo.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel LabelCampoEstadoCivil = new JLabel("Estado Civil:");
		LabelCampoEstadoCivil.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel LabelCampoDataNascimento = new JLabel("Data de Nascimento:");
		LabelCampoDataNascimento.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel LabelCampoNaturalidade = new JLabel("Naturalidade:");
		LabelCampoNaturalidade.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel LabelCampoRaca = new JLabel("Raça:");
		LabelCampoRaca.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel LabelDivisor = new JLabel("");
		LabelDivisor.setIcon(new ImageIcon(User.class.getResource("/tcc1/Line 6.png")));
		
		JLabel LabelDivisor_1 = new JLabel("");
		
		JLabel LabelDivisor_2 = new JLabel("");
		LabelDivisor_2.setIcon(new ImageIcon(User.class.getResource("/tcc1/Line 6.png")));
		
		JButton ButtonMenu = new JButton("");
		ButtonMenu.setIcon(new ImageIcon(User.class.getResource("/tcc1/menu4.png")));
		ButtonMenu.setBackground(Color.WHITE);
		
		EstadoCivilTF = new JTextField();
		EstadoCivilTF.setColumns(10);
		
		DataNascimentoTF = new JTextField();
		DataNascimentoTF.setColumns(10);
		
		MatriculaTF = new JTextField();
		MatriculaTF.setColumns(10);
		
		NomeCivilTF = new JTextField();
		NomeCivilTF.setColumns(10);
		
		NomeSocialTF = new JTextField();
		NomeSocialTF.setColumns(10);
		
		CursoTF = new JTextField();
		CursoTF.setColumns(10);
		
		SexoTF = new JTextField();
		SexoTF.setColumns(10);
		
		JLabel LabelCampoTipoSanguineo_1 = new JLabel("Tipo Sanguíneo:");
		LabelCampoTipoSanguineo_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		TipoSanguineoTF = new JTextField();
		TipoSanguineoTF.setColumns(10);
		
		NaturalidadeTF = new JTextField();
		NaturalidadeTF.setColumns(10);
		
		RacaTF = new JTextField();
		RacaTF.setColumns(10);
		
		JButton ButtonUsuario = new JButton("");
		ButtonUsuario.setIcon(new ImageIcon(User.class.getResource("/tcc1/user-solid (1) 6.png")));
		ButtonUsuario.setBackground(Color.WHITE);
		
		JButton ButtonInformacoes = new JButton("");
		ButtonInformacoes.setIcon(new ImageIcon(User.class.getResource("/tcc1/circle-info-solid (1) 5.png")));
		ButtonInformacoes.setBackground(Color.WHITE);
		
		JButton ButtonAreaEstudante = new JButton("");
		ButtonAreaEstudante.setIcon(new ImageIcon(User.class.getResource("/tcc1/livro 3.png")));
		ButtonAreaEstudante.setForeground(Color.WHITE);
		ButtonAreaEstudante.setBackground(Color.WHITE);
		
		JLabel LabelCampoSenha = new JLabel("SENHA:");
		LabelCampoSenha.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		SenhaTF = new JTextField();
		SenhaTF.setColumns(10);
		
		JLabel LabelCampoEmail = new JLabel("EMAIL:");
		LabelCampoEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblInstituioDaEscolaridade = new JLabel("Instituição Escolaridade");
		lblInstituioDaEscolaridade.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel LabelCampoNacionalidade = new JLabel("Nacionalidade:");
		LabelCampoNacionalidade.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		EscolaridadeTF = new JTextField();
		EscolaridadeTF.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(0)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(LabelIFSCLogo, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
							.addGap(120)
							.addComponent(ButtonMenu, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(0)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(LabelDivisor, GroupLayout.PREFERRED_SIZE, 376, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(LabelDivisor_2, GroupLayout.PREFERRED_SIZE, 376, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(LabelDivisor_1, GroupLayout.PREFERRED_SIZE, 376, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(ButtonUsuario, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
									.addGap(36)
									.addComponent(ButtonInformacoes, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
									.addGap(39)
									.addComponent(ButtonAreaEstudante, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(LabelCampoSenha, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
											.addGap(105))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(LabelCampoEmail, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
											.addGap(104)))
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(SenhaTF, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblInstituioDaEscolaridade, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
									.addGap(2)
									.addComponent(EscolaridadeTF, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
									.addGap(813))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(LabelCampoNacionalidade, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
									.addGap(54)
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(LabelCampoSexo, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
										.addComponent(LabelCampoDataNascimento, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
										.addComponent(LabelCampoNaturalidade, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
										.addComponent(LabelCampoRaca, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
										.addComponent(LabelCampoNomeCivil, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
										.addComponent(LabelCampoMatricula, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
										.addComponent(LabelCampoNomeSocial, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
										.addComponent(LabelCampoCurso, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
									.addGap(4)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(RacaTF, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
										.addComponent(CursoTF, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
										.addComponent(NomeSocialTF, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
										.addComponent(NomeCivilTF, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(DataNascimentoTF, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
												.addComponent(SexoTF, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
												.addComponent(NaturalidadeTF, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addGap(15)
													.addComponent(LabelCampoEstadoCivil, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_contentPane.createSequentialGroup()
													.addGap(16)
													.addComponent(LabelCampoTipoSanguineo_1, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(TipoSanguineoTF, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
												.addComponent(EstadoCivilTF, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)))
										.addComponent(MatriculaTF, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))))))
					.addGap(719))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(LabelIFSCLogo, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
						.addComponent(ButtonMenu, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
					.addGap(46)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(LabelDivisor, GroupLayout.PREFERRED_SIZE, 6, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(LabelCampoMatricula)
								.addComponent(MatriculaTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(LabelCampoNomeCivil, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
								.addComponent(NomeCivilTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(LabelCampoNomeSocial, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
								.addComponent(NomeSocialTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(LabelDivisor_1, GroupLayout.PREFERRED_SIZE, 6, GroupLayout.PREFERRED_SIZE)
						.addComponent(LabelDivisor_2, GroupLayout.PREFERRED_SIZE, 6, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(LabelCampoCurso, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
								.addComponent(CursoTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(8)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(LabelCampoSexo, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
									.addComponent(SexoTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(LabelCampoEstadoCivil, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)))
						.addComponent(EstadoCivilTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(LabelCampoDataNascimento, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addComponent(DataNascimentoTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(LabelCampoTipoSanguineo_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addComponent(TipoSanguineoTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(LabelCampoNaturalidade, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(NaturalidadeTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(LabelCampoRaca, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(RacaTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(LabelCampoNacionalidade, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblInstituioDaEscolaridade, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addComponent(EscolaridadeTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(0)
							.addComponent(LabelCampoEmail, GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE))
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(15)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(LabelCampoSenha, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(SenhaTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(33)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(ButtonUsuario, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(ButtonInformacoes, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(ButtonAreaEstudante, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGap(80))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
