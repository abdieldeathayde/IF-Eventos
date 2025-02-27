package tcc1;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
		setTitle("IFSC-Eventos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1050, 619);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

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
		btnLivro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				User usuario = new User();
				usuario.setVisible(true);
				dispose();
			}
		});
		getContentPane().add(btnLivro);
		setVisible(true);
		
		
		
		JButton btnInformacoes = new JButton("");
		btnInformacoes.setBackground(Color.WHITE);
		btnInformacoes.setIcon(new ImageIcon(TiraDuvidas.class.getResource("/tcc1/circle-info-solid (1) 5.png")));
		
		
		
		JButton btnProgresso = new JButton("");
		btnProgresso.setBackground(Color.WHITE);
		btnProgresso.setIcon(new ImageIcon(TiraDuvidas.class.getResource("/tcc1/livro 3.png")));
		btnProgresso.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				TodoListIFSC lista = new TodoListIFSC();
				lista.setVisible(true);
				dispose();
			}
		});
		getContentPane().add(btnLivro);
		setVisible(true);
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblInformeTitulo)
					.addContainerGap(1441, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(tfTitulo, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1209, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblElaboraPergunta)
					.addContainerGap(1418, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(tfDuvida, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1209, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(32)
					.addComponent(btnLivro, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
					.addGap(82)
					.addComponent(btnInformacoes, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
					.addGap(69)
					.addComponent(btnProgresso)
					.addGap(1080))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addComponent(lblExplicacao, GroupLayout.DEFAULT_SIZE, 1490, Short.MAX_VALUE)
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
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(tfDuvida, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
					.addGap(96)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnLivro, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnInformacoes, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
							.addGap(0))
						.addComponent(btnProgresso, GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE))
					.addGap(10))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
