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
    private Color colorEncima; //Contiene el color que tendrá el botón cuando el cursor se sitúe enciam de él.
    private Color colorFuera; //Contiene el color que tiene el botón cuando el cursor no está encima de él.
    
    /**
     * Constructor.
     */
    public BotonColorOver(){
        super("Botón");
        setBackground(colorFuera);
        escuchadores();
    }

    /**
     * Constructor
     * @param txtBoton Texto que aparece en el botón.
     */
    public BotonColorOver(String txtBoton){
        super(txtBoton);
        setBackground(colorFuera);
        escuchadores();
    }
    
    private void escuchadores(){
        //Definición del Listener
        MouseListener ml = new MouseListener(){
            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            
            //Cuando el cursor del ratón se sitúa encima del botón.
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(colorEncima);
            }

            //Cuando el cursor del ratón no está encima del botón.
            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(colorFuera);
            }
        };
        //Se añade el Listener al componente.
        addMouseListener(ml);
    }

    //Los Getter y Setter permiten que se pueda establecer los colores desde el panel de propiedades del componente.
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
