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

public class Configuracoes extends Tela {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel LabelCampoNomeSocial;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Configuracoes frame = new Configuracoes();
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
	public Configuracoes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		JLabel LabelNomeCurso = new JLabel("ANÁLISE E DESENVOLVIMENTO DE SISTEMAS - GASPAR");
		LabelNomeCurso.setFont(new Font("Tahoma", Font.ITALIC, 14));
		
		JLabel LabelIFSCLogo = new JLabel("");
		LabelIFSCLogo.setIcon(new ImageIcon(Configuracoes.class.getResource("/tcc1/image 8.png")));
		
		JLabel LabelNumeroMatricula = new JLabel("201710005168");
		LabelNumeroMatricula.setFont(new Font("Tahoma", Font.ITALIC, 14));
		
		JLabel LabelNomeCivil = new JLabel("ABDIEL ATHAYDE");
		LabelNomeCivil.setFont(new Font("Tahoma", Font.ITALIC, 14));
		
		JLabel LabelCampoSexo = new JLabel("Sexo:");
		LabelCampoSexo.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel LabelSexo = new JLabel("M");
		LabelSexo.setFont(new Font("Tahoma", Font.ITALIC, 14));
		
		JLabel LabelCampoEstadoCivil = new JLabel("Estado Civil:");
		LabelCampoEstadoCivil.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel LabelEstadoCivil = new JLabel("Solteiro");
		LabelEstadoCivil.setFont(new Font("Tahoma", Font.ITALIC, 14));
		
		JLabel LabelCampoDataNascimento = new JLabel("Data de Nascimento:");
		LabelCampoDataNascimento.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel LabelDataNascimento = new JLabel("11/05/1999");
		LabelDataNascimento.setFont(new Font("Tahoma", Font.ITALIC, 14));
		
		JLabel LabelCampoTipoSanguineo = new JLabel("Tipo Sanguíneo:");
		LabelCampoTipoSanguineo.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel LabelCampoNaturalidade = new JLabel("Naturalidade:");
		LabelCampoNaturalidade.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel LabelNaturalidade = new JLabel("Blumenau, SC");
		LabelNaturalidade.setFont(new Font("Tahoma", Font.ITALIC, 14));
		
		JLabel LabelCampoRaca = new JLabel("Raça:");
		LabelCampoRaca.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel LabelRaca = new JLabel("Pardo");
		LabelRaca.setFont(new Font("Tahoma", Font.ITALIC, 14));
		
		JLabel LabelCampoNacionalidade = new JLabel("Nacionalidade:");
		LabelCampoNacionalidade.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel LabelNacionalidade = new JLabel("BRASILEIRA");
		LabelNacionalidade.setFont(new Font("Tahoma", Font.ITALIC, 14));
		
		JLabel LabelCampoPais = new JLabel("País");
		LabelCampoPais.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel LabelPais = new JLabel("Brasil");
		LabelPais.setFont(new Font("Tahoma", Font.ITALIC, 14));
		
		JLabel LabelCampoIEConclusaoEscolaridade = new JLabel("Instituição de Conclusão da Escolaridade");
		LabelCampoIEConclusaoEscolaridade.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel LabelIEConlusaoEscolaridade = new JLabel("IFSC Gaspar");
		LabelIEConlusaoEscolaridade.setFont(new Font("Tahoma", Font.ITALIC, 14));
		
		JLabel LabelCampoEmail = new JLabel("EMAIL:");
		LabelCampoEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel LabelEmail = new JLabel("abdiel@aluno.ifsc.edu.br");
		LabelEmail.setFont(new Font("Tahoma", Font.ITALIC, 14));
		
		JLabel LabelCampoSenha = new JLabel("SENHA:");
		LabelCampoSenha.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel LabelSenha = new JLabel("*****");
		LabelSenha.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton ButtonUsuario = new JButton("");
		ButtonUsuario.setBackground(Color.WHITE);
		ButtonUsuario.setIcon(new ImageIcon(Configuracoes.class.getResource("/tcc1/user-solid (1) 6.png")));
		
		JButton ButtonConfiguracoes = new JButton("");
		ButtonConfiguracoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ButtonConfiguracoes.setBackground(Color.WHITE);
		ButtonConfiguracoes.setIcon(new ImageIcon(Configuracoes.class.getResource("/tcc1/Vector.png")));
		
		JButton ButtonInformacoes = new JButton("");
		ButtonInformacoes.setBackground(Color.WHITE);
		ButtonInformacoes.setIcon(new ImageIcon(Configuracoes.class.getResource("/tcc1/circle-info-solid (1) 5.png")));
		
		JButton ButtonAreaEstudante = new JButton("");
		ButtonAreaEstudante.setBackground(Color.WHITE);
		ButtonAreaEstudante.setForeground(Color.WHITE);
		ButtonAreaEstudante.setIcon(new ImageIcon(Configuracoes.class.getResource("/tcc1/livro 3.png")));
		
		JLabel LabelDivisor = new JLabel("");
		LabelDivisor.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\Line 6.png"));
		
		JLabel LabelNomeSocial = new JLabel("Campo Vazio");
		LabelNomeSocial.setFont(new Font("Tahoma", Font.ITALIC, 14));
		
		JLabel LabelTipoSanguineo = new JLabel("A+");
		LabelTipoSanguineo.setFont(new Font("Tahoma", Font.ITALIC, 14));
		
		JLabel LabelDivisor_1 = new JLabel("");
		
		JLabel LabelDivisor_2 = new JLabel("");
		LabelDivisor_2.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\Line 6.png"));
		
		JButton ButtonMenu = new JButton("");
		ButtonMenu.setIcon(new ImageIcon(Configuracoes.class.getResource("/tcc1/menu4.png")));
		ButtonMenu.setBackground(Color.WHITE);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(LabelIFSCLogo, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
							.addGap(120)
							.addComponent(ButtonMenu, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(43)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(LabelDivisor, GroupLayout.PREFERRED_SIZE, 376, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(LabelDivisor_2, GroupLayout.PREFERRED_SIZE, 376, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(LabelDivisor_1, GroupLayout.PREFERRED_SIZE, 376, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(LabelCampoNacionalidade, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
											.addGap(54)
											.addComponent(LabelNacionalidade, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(LabelCampoPais, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
										.addComponent(LabelCampoIEConclusaoEscolaridade, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(LabelCampoEmail, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
												.addComponent(LabelCampoSenha, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
											.addGap(105)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(LabelSenha, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addGap(46)
													.addComponent(ButtonAreaEstudante, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
												.addComponent(LabelEmail, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(ButtonUsuario)
											.addGap(18)
											.addComponent(ButtonConfiguracoes, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(ButtonInformacoes, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)))
									.addGap(27)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(LabelIEConlusaoEscolaridade, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
										.addComponent(LabelPais, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(LabelCampoSexo, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
										.addComponent(LabelCampoDataNascimento, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
										.addComponent(LabelCampoNaturalidade, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
										.addComponent(LabelCampoRaca, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
										.addComponent(LabelCampoNomeCivil, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
										.addComponent(LabelCampoMatricula, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
										.addComponent(LabelCampoNomeSocial, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(LabelNomeSocial, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
										.addComponent(LabelNumeroMatricula, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
										.addComponent(LabelNomeCivil, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addComponent(LabelSexo, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addComponent(LabelCampoEstadoCivil, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
												.addComponent(LabelNaturalidade, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
												.addComponent(LabelDataNascimento, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(LabelEstadoCivil, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addComponent(LabelCampoTipoSanguineo, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addComponent(LabelTipoSanguineo, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))))
										.addComponent(LabelRaca, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(LabelCampoCurso, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
									.addGap(29)
									.addComponent(LabelNomeCurso, GroupLayout.PREFERRED_SIZE, 393, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(717, Short.MAX_VALUE))
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
							.addGap(30)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(LabelCampoMatricula)
								.addComponent(LabelNumeroMatricula, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(LabelCampoNomeCivil, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(LabelCampoNomeSocial, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(LabelNomeCivil, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(LabelNomeSocial, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))))
						.addComponent(LabelDivisor_1, GroupLayout.PREFERRED_SIZE, 6, GroupLayout.PREFERRED_SIZE)
						.addComponent(LabelDivisor_2, GroupLayout.PREFERRED_SIZE, 6, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(LabelCampoCurso, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(LabelNomeCurso, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(LabelCampoSexo, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(LabelSexo, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(LabelCampoEstadoCivil, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addComponent(LabelEstadoCivil)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(LabelDataNascimento, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addComponent(LabelCampoDataNascimento, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(LabelCampoTipoSanguineo, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addComponent(LabelTipoSanguineo)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(LabelCampoNaturalidade, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(LabelNaturalidade, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(LabelCampoRaca, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(LabelRaca, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(LabelCampoNacionalidade, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(LabelCampoPais, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addComponent(LabelPais, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addComponent(LabelNacionalidade, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(LabelIEConlusaoEscolaridade, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(LabelCampoIEConclusaoEscolaridade, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(LabelCampoEmail, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(LabelEmail, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(LabelCampoSenha, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(LabelSenha, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGap(22)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addComponent(ButtonUsuario)
							.addComponent(ButtonConfiguracoes, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
							.addComponent(ButtonInformacoes, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
						.addComponent(ButtonAreaEstudante, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(152, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
