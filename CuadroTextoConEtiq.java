package componentes02;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Realizar un componente que conste de un JTextField con un JLabel en la parte superior.
 * @author Manuel Arroyo Salcedo
 */
public class CuadroTextoConEtiq extends JPanel{
    //Por un lado, es necesario que existan las clases JLabel y JTextField, pero para poder inicializar el texto de ambos desde el panel de propiedades y tener los getter&setter, es encesario que existan dos variables String.
    //Estas dos variables solo se utilizan para declarar los getter y setter.
    private String miEtiqueta;
    private String miTexto; 
    
    private JLabel miLabel;
    private JTextField miTxtField;

    /**
     * Constructor.
     */
    public CuadroTextoConEtiq(){
        miLabel = new JLabel();
        miTxtField = new JTextField();
        setLayout(new java.awt.GridLayout(0, 1));        
        add(miLabel);
        add(miTxtField);   
    }
    
    /**
     * Devuelve el texto de la etiqueta.
     * @return Texto de la etiqueta.
     */
    public String getMiEtiqueta() {
        return this.miLabel.getText();
    }

    /**
     * Establece el texto de la etiqueta.
     * @param etiqueta Texto de la etiqueta.
     */
    public void setMiEtiqueta(String etiqueta) {
        this.miLabel.setText(etiqueta);
    }

    /**
     * Devuelve el texto del JTextField.
     * @return Texto del JTextField.
     */
    public String getMiTexto() {
        return miTxtField.getText();
    }

    /**
     * Establece el texto del JTextField.
     * @param texto Texto del JTextField.
     */
    public void setMiTexto(String texto) {
        this.miTxtField.setText(texto);
    }
}
