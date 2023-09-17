package modelo;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;


public class ImmutableStar {


    private ImageIcon icon;
    private Image image ;
    private int boundX ;
    private int boundY ;
    private MuttableStar star;

    public ImmutableStar(MuttableStar star) {

        this.icon = new ImageIcon("src\\Star.jpeg");
        image = this.icon.getImage();
        boundX = 15;
        boundY = 15;
        this.star = star;

    }

    public void draw(Graphics g){

        star.draw(g, boundX, boundY, image);

    }

}
