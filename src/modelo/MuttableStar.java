package modelo;
import java.awt.Graphics;
import java.awt.Image;

public class MuttableStar {
    private int xPosition;
    private int yPosition;


    public MuttableStar(int x, int y) {
        this.xPosition = x;
        this.yPosition = y;
    }

    public void draw(Graphics g, int xSize, int ySize, Image starImage){
        
        g.drawImage(starImage, xPosition, yPosition, xSize, ySize, null);

    }

    
}
