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
		setBounds(100, 100, 450, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel logoIFSCLabel = new JLabel("");
		logoIFSCLabel.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\image 8.png"));
		
		JLabel divisorLabel2 = new JLabel("");
		divisorLabel2.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\Line 6.png"));
		
		JLabel logoNoticiasLabel_1 = new JLabel("");
		logoNoticiasLabel_1.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\noticia 1.png"));
		
		JLabel cursoLabel_1 = new JLabel("Curso ofertado");
		cursoLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		JLabel areaLabel_1 = new JLabel("Área:");
		areaLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		JLabel cursoLabel2_1 = new JLabel("FIC Inglês");
		cursoLabel2_1.setFont(new Font("Tahoma", Font.ITALIC, 10));
		
		JLabel areaLabel2_1 = new JLabel("Qualificação Profissional");
		areaLabel2_1.setFont(new Font("Tahoma", Font.ITALIC, 10));
		
		JLabel inscricaoLabel_1 = new JLabel("Inscrições até");
		inscricaoLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		JLabel InscricaoLabel2_1 = new JLabel("08/03/2024");
		InscricaoLabel2_1.setFont(new Font("Tahoma", Font.ITALIC, 10));
		
		JButton btnNewButton_1_1 = new JButton("Quero me inscrver!");
		btnNewButton_1_1.setBackground(Color.GREEN);
		
		JButton btnNewButton_5_2 = new JButton("");
		btnNewButton_5_2.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\user-solid (1) 6.png"));
		btnNewButton_5_2.setForeground(Color.WHITE);
		btnNewButton_5_2.setBackground(Color.WHITE);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\Vector.png"));
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setBackground(Color.WHITE);
		
		JButton btnNewButton_7_1 = new JButton("");
		btnNewButton_7_1.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\circle-info-solid (1) 5.png"));
		btnNewButton_7_1.setForeground(Color.WHITE);
		btnNewButton_7_1.setBackground(Color.WHITE);
		
		JButton btnNewButton_4_1_1 = new JButton("");
		btnNewButton_4_1_1.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\livro 3.png"));
		btnNewButton_4_1_1.setBackground(Color.WHITE);
		
		JLabel NoticiasLabel_1 = new JLabel("Noticias Recentes");
		NoticiasLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btnNewButton_5_1_1 = new JButton("");
		btnNewButton_5_1_1.setIcon(new ImageIcon("C:\\Users\\Athay\\OneDrive\\Documentos\\IFSC\\proejtoIntegrador\\menu3.png"));
		btnNewButton_5_1_1.setBackground(Color.WHITE);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(128)
							.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(78)
							.addComponent(btnNewButton_5_2, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnNewButton_5, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnNewButton_7_1, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnNewButton_4_1_1, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(69)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(logoNoticiasLabel_1, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(NoticiasLabel_1, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(logoIFSCLabel, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
											.addGap(12)
											.addComponent(btnNewButton_5_1_1, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(divisorLabel2, GroupLayout.PREFERRED_SIZE, 557, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(cursoLabel_1, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
										.addComponent(areaLabel_1, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
										.addComponent(inscricaoLabel_1, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
									.addGap(69)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(InscricaoLabel2_1, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
										.addComponent(areaLabel2_1, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
										.addComponent(cursoLabel2_1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))))))
					.addContainerGap(562, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(logoIFSCLabel, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton_5_1_1, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(NoticiasLabel_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addGap(52)
							.addComponent(divisorLabel2, GroupLayout.PREFERRED_SIZE, 6, GroupLayout.PREFERRED_SIZE))
						.addComponent(logoNoticiasLabel_1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(43)
							.addComponent(cursoLabel_1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(areaLabel_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(inscricaoLabel_1))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(35)
							.addComponent(cursoLabel2_1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(areaLabel2_1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(InscricaoLabel2_1)))
					.addGap(42)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnNewButton_1_1)
							.addGap(91)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton_5_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_5, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_7_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)))
						.addComponent(btnNewButton_4_1_1, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
					.addGap(288))
		);
		contentPane.setLayout(gl_contentPane);
		
	
	}
}
