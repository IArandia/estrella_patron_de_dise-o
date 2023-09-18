package vista;

import javax.swing.JFrame;

public class Vista extends JFrame {
    
    public Vista(){
        super("Espacio");
        initComponents();
    }
    

    public void initComponents(){
        this.setSize(400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
    }

}
