package tcc1;

	import javax.swing.*;
	import java.awt.*;
	import java.awt.geom.Ellipse2D;
	import java.awt.image.BufferedImage;
	import java.io.File;
	import javax.imageio.ImageIO;

	public class PerfilRedondo extends JPanel {
	    private BufferedImage imagem;

	    public PerfilRedondo(String caminhoImagem) {
	        try {
	            imagem = ImageIO.read(new File(caminhoImagem));
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        if (imagem != null) {
	            int tamanho = Math.min(getWidth(), getHeight()); // Define um tamanho quadrado
	            BufferedImage imagemRedonda = new BufferedImage(tamanho, tamanho, BufferedImage.TYPE_INT_ARGB);

	            Graphics2D g2 = imagemRedonda.createGraphics();
	            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	            
	            // Criar um recorte circular
	            Ellipse2D.Double clip = new Ellipse2D.Double(0, 0, tamanho, tamanho);
	            g2.setClip(clip);
	            
	            // Redimensionar e desenhar a imagem dentro do círculo
	            g2.drawImage(imagem, 0, 0, tamanho, tamanho, null);
	            g2.dispose();

	            // Desenha a imagem no painel
	            g.drawImage(imagemRedonda, 0, 0, tamanho, tamanho, null);
	        }
	    }

	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Foto de Perfil Redonda");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(300, 300);

	        PerfilRedondo perfil = new PerfilRedondo("caminho/para/sua/imagem.jpg");
	        frame.add(perfil);

	        frame.setVisible(true);
	    }
	}


