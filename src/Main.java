import javax.swing.JFrame;
import java.awt.*;

public class Main extends JFrame{
    public static void main(String[] args){
        JFrame ventana = new JFrame();
        Dimension dimensiones = Toolkit.getDefaultToolkit().getScreenSize();
        int alto = dimensiones.height;
        int ancho = dimensiones.width;

        ventana.setSize(350,200);
        ventana.setLocation(ancho/2,alto/2);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
