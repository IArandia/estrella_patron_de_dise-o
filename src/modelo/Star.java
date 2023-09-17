package modelo;
import java.awt.Image;
import java.awt.Point;

public class Star {
    private Image image;
    private Point position;

    public Star(Image image, Point position) {
        this.image = image;
        this.position = position;
    }

    // Getters y setters para los atributos image y position

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    // Otros métodos y lógica de la clase Star
}
