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
		setBounds(100, 100, 500, 690);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel logoIFSCLabel = new JLabel("");
		logoIFSCLabel.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\image 8.png"));
		
		JLabel divisorLabel = new JLabel("");
		divisorLabel.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\Line 4.png"));
		
		JLabel divisorLabel2 = new JLabel("");
		divisorLabel2.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\Line 6.png"));
		
		JLabel seta3Label_1_1 = new JLabel("");
		seta3Label_1_1.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\Protótipo IFSC\\Line 1.png"));
		
		JLabel seta1Label_1_1 = new JLabel("");
		seta1Label_1_1.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\Protótipo IFSC\\Line 1.png"));
		
		JLabel seta2Label_1_1 = new JLabel("");
		seta2Label_1_1.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\Protótipo IFSC\\Line 2.png"));
		
		JButton btnNewButton_1 = new JButton("Quero me inscrver!");
		btnNewButton_1.setBackground(Color.GREEN);
		
		JLabel logoNoticiasLabel = new JLabel("");
		logoNoticiasLabel.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\noticia 1.png"));
		
		JLabel NewsLabel = new JLabel("Noticias Recentes");
		NewsLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		JLabel cursoLabel = new JLabel("Curso ofertado");
		cursoLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		JLabel areaLabel = new JLabel("Área:");
		areaLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		JLabel inscricaoLabel = new JLabel("Inscrições até");
		inscricaoLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		JLabel cursoLabel2 = new JLabel("FIC Inglês");
		cursoLabel2.setFont(new Font("Tahoma", Font.ITALIC, 10));
		
		JLabel areaLabel2 = new JLabel("Qualificação Profissional");
		areaLabel2.setFont(new Font("Tahoma", Font.ITALIC, 10));
		
		JLabel InscricaoLabel2 = new JLabel("08/03/2024");
		InscricaoLabel2.setFont(new Font("Tahoma", Font.ITALIC, 10));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\user-solid (1) 6.png"));
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\Vector.png"));
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\circle-info-solid (1) 5.png"));
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setBackground(Color.WHITE);
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\livro 3.png"));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(88)
								.addComponent(logoNoticiasLabel, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(NewsLabel, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(28)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(divisorLabel, GroupLayout.PREFERRED_SIZE, 557, GroupLayout.PREFERRED_SIZE)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(logoIFSCLabel, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addComponent(seta3Label_1_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
											.addComponent(seta1Label_1_1, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
											.addComponent(seta2Label_1_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
										.addGap(78)))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(19)
							.addComponent(divisorLabel2, GroupLayout.PREFERRED_SIZE, 557, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(97)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(cursoLabel)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(inscricaoLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(areaLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
									.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
										.addComponent(btnNewButton)
										.addPreferredGap(ComponentPlacement.RELATED))))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(183)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(InscricaoLabel2, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
										.addComponent(cursoLabel2, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
										.addComponent(areaLabel2, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)))
								.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnNewButton_2)
									.addGap(29)
									.addComponent(btnNewButton_3)
									.addGap(39)
									.addComponent(btnNewButton_4)))
							.addGap(91)))
					.addContainerGap(904, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(logoIFSCLabel, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(seta3Label_1_1, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(seta1Label_1_1, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(seta2Label_1_1, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(divisorLabel, GroupLayout.PREFERRED_SIZE, 6, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(logoNoticiasLabel, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(50)
							.addComponent(NewsLabel)))
					.addGap(30)
					.addComponent(divisorLabel2, GroupLayout.PREFERRED_SIZE, 6, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(cursoLabel))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(20)
							.addComponent(cursoLabel2)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(14)
							.addComponent(areaLabel, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(inscricaoLabel))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(areaLabel2)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(InscricaoLabel2)))
					.addGap(19)
					.addComponent(btnNewButton_1)
					.addGap(127)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_2)
						.addComponent(btnNewButton_3)
						.addComponent(btnNewButton_4))
					.addGap(304))
		);
		contentPane.setLayout(gl_contentPane);
		
	
	}
}
