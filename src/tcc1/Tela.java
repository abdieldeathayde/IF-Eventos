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
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

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
	public Tela() {
		setTitle("IFSC-Eventos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 556, 619);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel LabelLogoIFSC = new JLabel("");
		LabelLogoIFSC.setIcon(new ImageIcon(Tela.class.getResource("/tcc1/image 8.png")));
		
		JLabel LabelDivisor = new JLabel("");
		LabelDivisor.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\Line 6.png"));
		
		JLabel LabelLogoNoticias = new JLabel("");
		LabelLogoNoticias.setIcon(new ImageIcon(Tela.class.getResource("/tcc1/ebook2 2.png")));
		
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
		ButtonInscricao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ButtonInscricao.setBackground(Color.GREEN);
		
		
		
		JButton ButtonUsuario = new JButton("");
		ButtonUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User usuario = new User();
				usuario.setVisible(true);
				dispose();
			}
		});
		ButtonUsuario.setIcon(new ImageIcon(Tela.class.getResource("/tcc1/user-solid (1) 6.png")));
		ButtonUsuario.setForeground(Color.WHITE);
		ButtonUsuario.setBackground(Color.WHITE);
		
		JButton ButtonInformacoes = new JButton("");
		ButtonInformacoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TiraDuvidas tiraDuvidas = new TiraDuvidas();
				tiraDuvidas.setVisible(true);
				dispose();
			}
		});
		ButtonInformacoes.setIcon(new ImageIcon(Tela.class.getResource("/tcc1/circle-info-solid (1) 5.png")));
		ButtonInformacoes.setForeground(Color.WHITE);
		ButtonInformacoes.setBackground(Color.WHITE);
		
		JButton ButtonAreaEstudante = new JButton("");
		ButtonAreaEstudante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ButtonAreaEstudante.setIcon(new ImageIcon(Tela.class.getResource("/tcc1/livro 3.png")));
		ButtonAreaEstudante.setBackground(Color.WHITE);
		
		JLabel LabelTextoNoticias = new JLabel("Noticias Recentes");
		LabelTextoNoticias.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton ButtonMenu = new JButton("");
		ButtonMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ButtonMenu.setIcon(new ImageIcon(Tela.class.getResource("/tcc1/menu4.png")));
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
									.addComponent(LabelLogoIFSC, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)
									.addGap(26)
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
					.addContainerGap(963, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(LabelLogoIFSC, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(43)
							.addComponent(ButtonMenu, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
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
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addComponent(ButtonUsuario, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
							.addComponent(ButtonInformacoes, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
						.addComponent(ButtonAreaEstudante, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGap(288))
		);
		contentPane.setLayout(gl_contentPane);
		
	
	}
}
