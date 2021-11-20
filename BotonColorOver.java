package componentes02;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

/**
 * Crear un botón qué, cada vez que el cursor se sitúe encima ponga un color de fondo y, cuando deje de estar encima, vuelva a su color original.
 * @author Manuel Arroyo Salcedo
 */
public class BotonColorOver extends JButton {
    private Color colorEncima;
    private Color colorFuera;
    
    public BotonColorOver(){
        super("Botón");
        setBackground(colorFuera);
        escuchadores();
    }
    
    public BotonColorOver(String txtBoton){
        super(txtBoton);
        setBackground(colorFuera);
        escuchadores();
        
    }
    
    private void escuchadores(){
        MouseListener ml = new MouseListener(){
            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(colorEncima);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(colorFuera);
            }
        };
        
        addMouseListener(ml);
    }

    public Color getColorEncima() {
        return colorEncima;
    }

    public void setColorEncima(Color colorEncima) {
        this.colorEncima = colorEncima;
    }

    public Color getColorFuera() {
        return colorFuera;
    }

    public void setColorFuera(Color colorFuera) {
        this.colorFuera = colorFuera;
    }
}
