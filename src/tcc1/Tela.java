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
	private JTextField txtCursoOfertado;
	private JTextField txtrea;
	private JTextField txtInscriesAt;
	private JTextField textField;
	private JTextField txtFicIngls;
	private JTextField txtQualificaoProfissional;
	private JTextField textField_1;

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
		setBounds(100, 100, 571, 951);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel logoIFSCLabel = new JLabel("");
		logoIFSCLabel.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\image 8.png"));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\Line 4.png"));
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\Line 6.png"));
		
		JLabel seta3Label_1_1 = new JLabel("");
		seta3Label_1_1.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\Protótipo IFSC\\Line 1.png"));
		
		JLabel seta1Label_1_1 = new JLabel("");
		seta1Label_1_1.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\Protótipo IFSC\\Line 1.png"));
		
		JLabel seta2Label_1_1 = new JLabel("");
		seta2Label_1_1.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\Protótipo IFSC\\Line 2.png"));
		
		txtCursoOfertado = new JTextField();
		txtCursoOfertado.setText("Curso ofertado:");
		txtCursoOfertado.setFont(new Font("Tahoma", Font.BOLD, 10));
		txtCursoOfertado.setColumns(10);
		
		txtrea = new JTextField();
		txtrea.setText("Área:");
		txtrea.setFont(new Font("Tahoma", Font.BOLD, 10));
		txtrea.setColumns(10);
		
		txtInscriesAt = new JTextField();
		txtInscriesAt.setText("Inscrições até:");
		txtInscriesAt.setFont(new Font("Tahoma", Font.BOLD, 10));
		txtInscriesAt.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Quero me inscrver!");
		btnNewButton_1.setBackground(Color.GREEN);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\noticia 1.png"));
		
		textField = new JTextField();
		textField.setText("Noticias Recentes");
		textField.setFont(new Font("Tahoma", Font.BOLD, 10));
		textField.setColumns(10);
		
		txtFicIngls = new JTextField();
		txtFicIngls.setText("FIC Inglês");
		txtFicIngls.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtFicIngls.setColumns(10);
		
		txtQualificaoProfissional = new JTextField();
		txtQualificaoProfissional.setText("Qualificação Profissional");
		txtQualificaoProfissional.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtQualificaoProfissional.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("08/03/2024");
		textField_1.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(49)
								.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(28)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 557, GroupLayout.PREFERRED_SIZE)
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
							.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 557, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(97)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(txtCursoOfertado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(185)
									.addComponent(txtFicIngls, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(txtrea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtInscriesAt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(185)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtQualificaoProfissional, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(214)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)))
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
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 6, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(45)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(30)
					.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 6, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtCursoOfertado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtFicIngls, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtrea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtInscriesAt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(27)
							.addComponent(btnNewButton_1))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(4)
							.addComponent(txtQualificaoProfissional, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(167))
		);
		contentPane.setLayout(gl_contentPane);
		
	
	}
}
