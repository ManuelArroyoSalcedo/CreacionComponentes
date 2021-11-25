package componentes02;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;

/**
 * Crear un componente que tenga un color cuando tenga el foco y otro cuando no lo tenga. 
 * Tendrá dos propiedaes de tipo color que serán el color de fondo y color de texto cuando el JTextField no tiene el foco. 
 * Cuando recibe el foco se intercambian los colores.
 * @author Manuel Arroyo Salcedo
 */
public class CuadroTextoFoco extends JTextField implements FocusListener{
    private Color miColorFondo;
    private Color miColorTexto;

    public CuadroTextoFoco() {
        setOpaque(true);
        setPreferredSize(new Dimension(150,25));
        setText("CuadroTextoFoco");
        addFocusListener(this);
    }

    public Color getMiColorFondo() {
        return miColorFondo;
    }

    public void setMiColorFondo(Color miColorFondo) {
        this.miColorFondo = miColorFondo;
        setBackground(miColorFondo);
    }

    public Color getMiColorTexto() {
        return miColorTexto;
    }

    public void setMiColorTexto(Color miColorTexto) {
        this.miColorTexto = miColorTexto;
        setForeground(miColorTexto);        
    }

    @Override
    public void focusGained(FocusEvent e) {
        setBackground(miColorTexto);
        setForeground(miColorFondo);
        setOpaque(true); 
    }

    @Override
    public void focusLost(FocusEvent e) {
        setBackground(miColorFondo);
        setForeground(miColorTexto);
        setOpaque(true);   
    }
}
