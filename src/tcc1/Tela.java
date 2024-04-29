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
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Font;

public class Tela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
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
	public Tela() {
		setTitle("IFSC-Eventos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 619);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel LabelLogoIFSC = new JLabel("");
		LabelLogoIFSC.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\image 8.png"));
		
		JLabel LabelDivisor = new JLabel("");
		LabelDivisor.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\Line 6.png"));
		
		JLabel LabelLogoNoticias = new JLabel("");
		LabelLogoNoticias.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\noticia 1.png"));
		
		JLabel LabelCampoCursoOfertado = new JLabel("Curso ofertado");
		LabelCampoCursoOfertado.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		JLabel LabelCampoArea = new JLabel("Área:");
		LabelCampoArea.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		JLabel LabelNomeCurso = new JLabel("FIC Inglês");
		LabelNomeCurso.setFont(new Font("Tahoma", Font.ITALIC, 10));
		
		JLabel LabelDescricaoArea = new JLabel("Qualificação Profissional");
		LabelDescricaoArea.setFont(new Font("Tahoma", Font.ITALIC, 10));
		
		JLabel LabelCampoPrazo = new JLabel("Inscrições até");
		LabelCampoPrazo.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		JLabel LabelDescricaoPrazo = new JLabel("08/03/2024");
		LabelDescricaoPrazo.setFont(new Font("Tahoma", Font.ITALIC, 10));
		
		JButton ButtonInscricao = new JButton("Quero me inscrver!");
		ButtonInscricao.setBackground(Color.GREEN);
		
		JButton ButtonUsuario = new JButton("");
		ButtonUsuario.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\user-solid (1) 6.png"));
		ButtonUsuario.setForeground(Color.WHITE);
		ButtonUsuario.setBackground(Color.WHITE);
		
		JButton ButtonConfiguracoes = new JButton("");
		ButtonConfiguracoes.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\Vector.png"));
		ButtonConfiguracoes.setForeground(Color.WHITE);
		ButtonConfiguracoes.setBackground(Color.WHITE);
		
		JButton ButtonInformacoes = new JButton("");
		ButtonInformacoes.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\circle-info-solid (1) 5.png"));
		ButtonInformacoes.setForeground(Color.WHITE);
		ButtonInformacoes.setBackground(Color.WHITE);
		
		JButton ButtonAreaEstudante = new JButton("");
		ButtonAreaEstudante.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\livro 3.png"));
		ButtonAreaEstudante.setBackground(Color.WHITE);
		
		JLabel LabelTextoNoticias = new JLabel("Noticias Recentes");
		LabelTextoNoticias.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton ButtonMenu = new JButton("");
		ButtonMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ButtonMenu.setIcon(new ImageIcon("C:\\Users\\Athay\\OneDrive\\Documentos\\IFSC\\proejtoIntegrador\\menu3.png"));
		ButtonMenu.setBackground(Color.WHITE);
		
		JLabel LabelDivisor2 = new JLabel("");
		LabelDivisor2.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\Line 6.png"));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(128)
							.addComponent(ButtonInscricao, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(78)
							.addComponent(ButtonUsuario, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(ButtonConfiguracoes, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(ButtonInformacoes, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(ButtonAreaEstudante, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(69)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(LabelLogoNoticias, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(LabelTextoNoticias, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(LabelLogoIFSC, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
									.addGap(12)
									.addComponent(ButtonMenu, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(LabelCampoCursoOfertado, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
										.addComponent(LabelCampoArea, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
										.addComponent(LabelCampoPrazo, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
									.addGap(69)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(LabelDescricaoPrazo, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
										.addComponent(LabelDescricaoArea, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
										.addComponent(LabelNomeCurso, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(39)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(LabelDivisor2, GroupLayout.PREFERRED_SIZE, 376, GroupLayout.PREFERRED_SIZE)
								.addComponent(LabelDivisor, GroupLayout.PREFERRED_SIZE, 376, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(934, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(LabelLogoIFSC, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(ButtonMenu, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(LabelTextoNoticias, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addGap(58))
						.addComponent(LabelLogoNoticias, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(LabelDivisor, GroupLayout.PREFERRED_SIZE, 6, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(19)
							.addComponent(LabelCampoCursoOfertado)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(LabelCampoArea)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(LabelCampoPrazo))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(11)
							.addComponent(LabelNomeCurso)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(LabelDescricaoArea)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(LabelDescricaoPrazo)))
					.addGap(60)
					.addComponent(ButtonInscricao)
					.addGap(29)
					.addComponent(LabelDivisor2, GroupLayout.PREFERRED_SIZE, 6, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addComponent(ButtonUsuario, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
							.addComponent(ButtonConfiguracoes, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
							.addComponent(ButtonInformacoes, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
						.addComponent(ButtonAreaEstudante, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGap(288))
		);
		contentPane.setLayout(gl_contentPane);
		
	
	}
}
