package modelo;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class Space extends JFrame {
    private Star star;
    public Space() {
        // Crear una instancia de la clase Star con una imagen y posición
        
        Image image = Toolkit.getDefaultToolkit().getImage("src\\Starr.jpeg");
        Point position = new Point(400, 400);
        star = new Star(image, position);
        

        // Configurar la ventana
        setTitle("Ventana con estrella");
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Agregar un panel a la ventana
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                super.setBackground(Color.BLACK);

                // Dibujar la estrella en el panel
                Image starImage = star.getImage();
                Point starPosition = star.getPosition();
                g.drawImage(starImage, starPosition.x, starPosition.y,30,30 ,null,null);
            }
        };
        setContentPane(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Space ventana = new Space();
            ventana.setVisible(true);
            
        });
    }
}
