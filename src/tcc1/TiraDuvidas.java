package tcc1;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Window;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class TiraDuvidas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfTitulo;
	private JTextField tfDuvida;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TiraDuvidas frame = new TiraDuvidas();
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
	public TiraDuvidas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 619);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 556, 619));

		setContentPane(contentPane);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(TiraDuvidas.class.getResource("/tcc1/image 8.png")));
		
		JLabel lblExplicacao = new JLabel("SUA PERGUNTA SERÁ ENVIADA PARA A COORDENAÇÃO\r\n DO CURSO DE ANÁLISE E DESENVOLVIMENTO DE SISTEMAS \r\n[547]/GAS  - TECNOLOGIA CAMPUS GASPAR");
		
		JLabel lblInformeTitulo = new JLabel("Informe um título");
		
		tfTitulo = new JTextField();
		tfTitulo.setColumns(10);
		
		JLabel lblElaboraPergunta = new JLabel("Elabore Sua pergunta ");
		
		tfDuvida = new JTextField();
		tfDuvida.setColumns(10);
		
		JButton btnLivro = new JButton("");
		btnLivro.setBackground(Color.WHITE);
		btnLivro.setIcon(new ImageIcon(TiraDuvidas.class.getResource("/tcc1/user-solid (1) 6.png")));
		
		JButton btnConfiguracoes = new JButton("");
		btnConfiguracoes.setBackground(Color.WHITE);
		btnConfiguracoes.setIcon(new ImageIcon(TiraDuvidas.class.getResource("/tcc1/Vector.png")));
		
		JButton btnInformacoes = new JButton("");
		btnInformacoes.setBackground(Color.WHITE);
		btnInformacoes.setIcon(new ImageIcon(TiraDuvidas.class.getResource("/tcc1/circle-info-solid (1) 5.png")));
		
		JButton btnProgresso = new JButton("");
		btnProgresso.setBackground(Color.WHITE);
		btnProgresso.setIcon(new ImageIcon(TiraDuvidas.class.getResource("/tcc1/livro 3.png")));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblInformeTitulo)
					.addContainerGap(1529, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(tfTitulo, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1297, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblElaboraPergunta)
					.addContainerGap(1506, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(tfDuvida, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1297, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(32)
					.addComponent(btnLivro)
					.addGap(46)
					.addComponent(btnConfiguracoes)
					.addGap(64)
					.addComponent(btnInformacoes, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addGap(69)
					.addComponent(btnProgresso)
					.addContainerGap(1173, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addComponent(lblExplicacao, GroupLayout.DEFAULT_SIZE, 1578, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblLogo)
							.addGap(10))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(9)
					.addComponent(lblLogo)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblExplicacao, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
					.addGap(46)
					.addComponent(lblInformeTitulo)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(tfTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblElaboraPergunta)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(tfDuvida, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
					.addGap(96)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnLivro)
						.addComponent(btnConfiguracoes)
						.addComponent(btnInformacoes, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnProgresso))
					.addGap(89))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
