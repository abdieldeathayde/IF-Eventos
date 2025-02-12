package tcc1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class PerfilUsuario extends JFrame {
    private JLabel lblImagem;
    private JButton btnEscolherImagem;
    private final String DIRETORIO_IMAGENS = "perfil_usuario/";
    private final String CONFIG_PATH = "config.txt";
    private String imagemAtual;

    public PerfilUsuario() {
        setTitle("Escolha sua Imagem de Perfil");
        setSize(400, 400);
        setLayout(new BorderLayout());

        // Criar diretório se não existir
        File dir = new File(DIRETORIO_IMAGENS);
        if (!dir.exists()) dir.mkdirs();

        // Recuperar última imagem usada
        imagemAtual = carregarUltimaImagem();
        lblImagem = new JLabel();
        lblImagem.setHorizontalAlignment(JLabel.CENTER);
        setImagemPerfil(imagemAtual);

        // Botão para escolher imagem
        btnEscolherImagem = new JButton("Escolher Imagem");
        btnEscolherImagem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                escolherImagem();
            }
        });

        add(lblImagem, BorderLayout.CENTER);
        add(btnEscolherImagem, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void escolherImagem() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Selecione uma imagem");
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Imagens", "jpg", "png", "jpeg"));

        int escolha = fileChooser.showOpenDialog(this);

        if (escolha == JFileChooser.APPROVE_OPTION) {
            File arquivoSelecionado = fileChooser.getSelectedFile();
            salvarImagemPerfil(arquivoSelecionado);
        }
    }

    public void salvarImagemPerfil(File arquivoSelecionado) {
        try {
            String extensao = arquivoSelecionado.getName().substring(arquivoSelecionado.getName().lastIndexOf("."));
            String novoCaminho = DIRETORIO_IMAGENS + "imagem_perfil" + extensao;
            File destino = new File(novoCaminho);

            // Copia a imagem escolhida para a pasta de perfil
            Files.copy(arquivoSelecionado.toPath(), destino.toPath(), StandardCopyOption.REPLACE_EXISTING);

            // Atualiza a imagem e salva no config.txt
            imagemAtual = novoCaminho;
            salvarUltimaImagem(imagemAtual);
            setImagemPerfil(imagemAtual);

        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao salvar a imagem!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void setImagemPerfil(String caminho) {
        ImageIcon icone = new ImageIcon(caminho);
        Image imagemRedimensionada = icone.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        lblImagem.setIcon(new ImageIcon(imagemRedimensionada));
    }

    public void salvarUltimaImagem(String caminho) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CONFIG_PATH))) {
            writer.write(caminho);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String carregarUltimaImagem() {
        File configFile = new File(CONFIG_PATH);
        if (configFile.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(configFile))) {
                return reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
		return CONFIG_PATH;
         
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PerfilUsuario());
    }
}




