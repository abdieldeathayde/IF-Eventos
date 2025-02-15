package tcc1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
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
		setBounds(100, 100, 956, 619);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel LabelLogoIFSC = new JLabel("");
		LabelLogoIFSC.setBounds(74, 5, 268, 107);
		LabelLogoIFSC.setIcon(new ImageIcon(Tela.class.getResource("/tcc1/image 8.png")));
		
		JLabel LabelDivisor = new JLabel("");
		LabelDivisor.setBounds(44, 256, 376, 6);
		LabelDivisor.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\Line 6.png"));
		
		JLabel LabelLogoNoticias = new JLabel("");
		LabelLogoNoticias.setBounds(74, 130, 200, 108);
		LabelLogoNoticias.setIcon(new ImageIcon(Tela.class.getResource("/tcc1/ebook2 2.png")));
		
		JLabel LabelCampoCursoOfertado = new JLabel("Curso ofertado");
		LabelCampoCursoOfertado.setBounds(74, 281, 78, 13);
		LabelCampoCursoOfertado.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		JLabel LabelCampoArea = new JLabel("Área:");
		LabelCampoArea.setBounds(74, 304, 77, 13);
		LabelCampoArea.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		JLabel LabelNomeCurso = new JLabel("FIC Inglês");
		LabelNomeCurso.setBounds(221, 273, 80, 13);
		LabelNomeCurso.setFont(new Font("Tahoma", Font.ITALIC, 10));
		
		JLabel LabelDescricaoArea = new JLabel("Qualificação Profissional");
		LabelDescricaoArea.setBounds(221, 296, 129, 13);
		LabelDescricaoArea.setFont(new Font("Tahoma", Font.ITALIC, 10));
		
		JLabel LabelCampoPrazo = new JLabel("Inscrições até");
		LabelCampoPrazo.setBounds(74, 323, 77, 13);
		LabelCampoPrazo.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		JLabel LabelDescricaoPrazo = new JLabel("08/03/2024");
		LabelDescricaoPrazo.setBounds(221, 319, 85, 13);
		LabelDescricaoPrazo.setFont(new Font("Tahoma", Font.ITALIC, 10));
		
		
		
		PerfilUsuario frame = new PerfilUsuario();
		
		JLabel imagem = new JLabel("");
		imagem.setBounds(632, 5, 300, 350);

		
		
		
		imagem.setIcon(new ImageIcon(CadastroAluno.class.getResource("/tcc1/user-solid (1) 6.png")));
		
		
		
		JButton btnAlteraImagem = new JButton("Escolher Imagem: ");
		btnAlteraImagem.setBounds(390, 310, 185, 80);
		btnAlteraImagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		
				 PerfilUsuario frame = new PerfilUsuario();
				
				
				//imagem.setIcon(new ImageIcon((frame.carregarUltimaImagem())));
				
				String caminhoImagem = frame.carregarUltimaImagem();
				
				ImageIcon imagemRedonda = ImageUtils.criarImagemRedonda(caminhoImagem, 200);
				
				if (imagemRedonda != null) {
					imagem.setIcon(imagemRedonda);
				}
				
				contentPane.add(imagem);
				

				
				
				
			
			
				
			}
		});
//		btnAlteraImagem.setBound
		contentPane.add(btnAlteraImagem);
	
		
		JButton btnSair = new JButton("Sair da conta:");
		
		
		btnSair.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
//				Login login = new Login();
//				login.();
				
			}
		});
		
		
		
		/*
		 * import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogoutExample extends JFrame {
    public LogoutExample() {
        setTitle("Sistema");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton btnLogout = new JButton("Logout");
        btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(
                    null,
                    "Deseja realmente sair?",
                    "Confirmação",
                    JOptionPane.YES_NO_OPTION
                );
                
                if (confirm == JOptionPane.YES_OPTION) {
                    dispose(); // Fecha a janela atual
                    new LoginScreen(); // Retorna para a tela de login
                }
            }
        });

        setLayout(new FlowLayout());
        add(btnLogout);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LogoutExample());
    }
}

class LoginScreen extends JFrame {
    public LoginScreen() {
        setTitle("Login");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel lblMessage = new JLabel("Tela de Login");
        add(lblMessage);

        setLayout(new FlowLayout());
        setVisible(true);
    }
}

		 */
		
		
		
		
		
		JButton ButtonInscricao = new JButton("Quero me inscrver!");
		ButtonInscricao.setBounds(133, 396, 145, 21);
		ButtonInscricao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ButtonInscricao.setBackground(Color.GREEN);
		
		
		
		
		JButton ButtonUsuario = new JButton("");
		ButtonUsuario.setBounds(74, 507, 53, 65);
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
		ButtonInformacoes.setBounds(221, 507, 59, 65);
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
		ButtonAreaEstudante.setBounds(345, 507, 65, 65);
		ButtonAreaEstudante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ButtonAreaEstudante.setIcon(new ImageIcon(Tela.class.getResource("/tcc1/livro 3.png")));
		ButtonAreaEstudante.setBackground(Color.WHITE);
		
		JLabel LabelTextoNoticias = new JLabel("Noticias Recentes");
		LabelTextoNoticias.setBounds(280, 163, 130, 17);
		LabelTextoNoticias.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton ButtonMenu = new JButton("");
		ButtonMenu.setBounds(368, 48, 70, 64);
		ButtonMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ButtonMenu.setIcon(new ImageIcon(Tela.class.getResource("/tcc1/menu4.png")));
		ButtonMenu.setBackground(Color.WHITE);
		
		JLabel LabelDivisor2 = new JLabel("");
		LabelDivisor2.setBounds(44, 446, 376, 6);
		LabelDivisor2.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\Line 6.png"));
		contentPane.setLayout(null);
		contentPane.add(btnAlteraImagem);
		contentPane.add(ButtonInscricao);
		contentPane.add(ButtonUsuario);
		contentPane.add(ButtonInformacoes);
		contentPane.add(ButtonAreaEstudante);
		contentPane.add(LabelLogoNoticias);
		contentPane.add(LabelTextoNoticias);
		contentPane.add(LabelLogoIFSC);
		contentPane.add(ButtonMenu);
		contentPane.add(LabelCampoCursoOfertado);
		contentPane.add(LabelCampoArea);
		contentPane.add(LabelCampoPrazo);
		contentPane.add(LabelDescricaoPrazo);
		contentPane.add(LabelDescricaoArea);
		contentPane.add(LabelNomeCurso);
		contentPane.add(LabelDivisor2);
		contentPane.add(LabelDivisor);
		contentPane.add(imagem);
		
	
	}
}
