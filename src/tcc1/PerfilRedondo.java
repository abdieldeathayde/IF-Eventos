package tcc1;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class PerfilRedondo extends JPanel {
    private BufferedImage imagem;

    public PerfilRedondo(String caminhoImagem) {
        try {
            imagem = ImageIO.read(new File(caminhoImagem));
        } catch (IOException e) {
            e.printStackTrace();
        }
        setPreferredSize(new Dimension(150, 150));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imagem != null) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            int width = getWidth();
            int height = getHeight();

            // Criar um recorte circular
            Ellipse2D.Double clip = new Ellipse2D.Double(0, 0, width, height);
            g2.setClip(clip);
            g2.drawImage(imagem, 0, 0, width, height, this);

            g2.dispose();
        }
    }
}
