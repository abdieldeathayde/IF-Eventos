package tcc1;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageUtils {

    public static ImageIcon criarImagemRedonda(String caminhoImagem, int tamanho) {
        try {
            BufferedImage imagemOriginal = ImageIO.read(new File(caminhoImagem));

            // Redimensionar a imagem para o tamanho desejado
            Image imagemRedimensionada = imagemOriginal.getScaledInstance(tamanho, tamanho, Image.SCALE_SMOOTH);
            BufferedImage imagemBuffered = new BufferedImage(tamanho, tamanho, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = imagemBuffered.createGraphics();

            // Habilitar renderização suave
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            // Criar um recorte circular
            Ellipse2D.Double clip = new Ellipse2D.Double(0, 0, tamanho, tamanho);
            g2.setClip(clip);
            g2.drawImage(imagemRedimensionada, 0, 0, null);
            g2.dispose();

            return new ImageIcon(imagemBuffered);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
