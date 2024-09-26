package tcc1;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class ImagemResolucao extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ImagemResolucao frame = new ImagemResolucao();
					
					URL caminhoImagem = this.getClass().getResource("ifsc.png");
					Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoImagem);
					
					frame.setIconImage(iconeTitulo);
					
					
					
					
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
	public ImagemResolucao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ImagemResolucao.class.getResource("/tcc1/image 8.png")));
		lblNewLabel.setBounds(25, 10, 308, 213);
		contentPane.add(lblNewLabel);
	}

}
