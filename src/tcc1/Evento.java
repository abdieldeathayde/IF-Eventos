package tcc1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.awt.Color;

public class Evento extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Evento frame = new Evento();
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
	public Evento() {
		setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 925, 769);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel logoIFSCTF = new JLabel("");
		logoIFSCTF.setIcon(new ImageIcon(Evento.class.getResource("/tcc1/Ifsc.png")));
		logoIFSCTF.setBounds(10, 24, 310, 87);
		contentPane.add(logoIFSCTF);
		
		JLabel notebookLogoTF = new JLabel("");
		notebookLogoTF.setIcon(new ImageIcon(Evento.class.getResource("/tcc1/notebook.png")));
		notebookLogoTF.setBounds(97, 144, 235, 114);
		contentPane.add(notebookLogoTF);
		
		JLabel tituloTF = new JLabel("Título da Palestra / Evento");
		tituloTF.setForeground(new Color(0, 255, 64));
		tituloTF.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tituloTF.setBounds(130, 322, 265, 13);
		contentPane.add(tituloTF);
		
		JLabel duracaoTF = new JLabel("Duração: 1H");
		duracaoTF.setForeground(new Color(0, 255, 64));
		duracaoTF.setFont(new Font("Tahoma", Font.PLAIN, 18));
		duracaoTF.setBounds(130, 374, 142, 13);
		contentPane.add(duracaoTF);
		
		JLabel lblNewLabel = new JLabel("Data: 22/04/2024");
		lblNewLabel.setForeground(new Color(0, 255, 64));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(130, 436, 162, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Palestrante: Abdiel");
		lblNewLabel_1.setForeground(new Color(0, 255, 64));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(130, 497, 210, 13);
		contentPane.add(lblNewLabel_1);
	}
}
