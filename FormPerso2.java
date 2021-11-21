
package componentes02;

import java.awt.Dimension;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Crear un componente que conste de un formulario para introducir: nombre, primer apellido, segundo apellido, correo electrónica y el rango de edad.
 * El rango de edad está implementado con un JComboBox.
 * @author Manuel Arroyo Salcedo
 */
public class FormPerso2 extends JPanel{
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    
    private JTextField miNombre;
    private JTextField miPrimApel;
    private JTextField miSegApel;
    private JTextField miCorreo;
    private JComboBox<String> miRangoEdades;
    private int miOpcionElegidaDefecto = 0;//Opción elegida

    public FormPerso2() {
        setLayout(null);
        setPreferredSize(new Dimension(400, 160));
        miIni();
    }

    /**
     * Inicialización de los componentes del fomrulario.
     */
    private void miIni(){
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        miNombre = new JTextField();
        miPrimApel = new JTextField();
        miSegApel = new JTextField();
        miCorreo = new JTextField();
        miRangoEdades = new JComboBox<>();


        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nombre:");
        add(jLabel1);
        jLabel1.setBounds(5, 13, 130, 15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Primer apellido:");
        add(jLabel2);
        jLabel2.setBounds(5, 43, 130, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Segundo apellido:");
        add(jLabel3);
        jLabel3.setBounds(5, 73, 130, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Correo electrónico:");
        add(jLabel4);
        jLabel4.setBounds(5, 103, 130, 15);
        
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Rango de edad:");
        add(jLabel5);
        jLabel5.setBounds(5, 133, 130, 15);
        
        
        add(miNombre);
        miNombre.setBounds(140, 10, 190, 20);
        add(miPrimApel);
        miPrimApel.setBounds(140, 40, 190, 20);
        add(miSegApel);
        miSegApel.setBounds(140, 70, 190, 20);
        add(miCorreo);
        miCorreo.setBounds(140, 100, 250, 20);    
        add(miRangoEdades);
        miRangoEdades.setBounds(140, 130, 190, 20);
        miRangoEdades.setModel(new DefaultComboBoxModel<>(new String[]{}));

    }

    
    //Getters y Setters

    public String getMiNombre() {
        return miNombre.getText();
    }

    public void setMiNombre(String miNombre) {
        this.miNombre.setText(miNombre);
    }

    public String getMiPrimApel() {
        return miPrimApel.getText();
    }

    public void setMiPrimApel(String miPrimApel) {
        this.miPrimApel.setText(miPrimApel);
    }

    public String getMiSegApel() {
        return miSegApel.getText();
    }

    public void setMiSegApel(String miSegApel) {
        this.miSegApel.setText(miSegApel);
    }

    public String getMiCorreo() {
        return miCorreo.getText();
    }

    public void setMiCorreo(String miCorreo) {
        this.miCorreo.setText(miCorreo);
    }

    public String[] getMiRangoEdades() {
        String[] arrEdades = new String[miRangoEdades.getModel().getSize()];
        for (int f = 0; f < miRangoEdades.getModel().getSize(); f++) arrEdades[f] = miRangoEdades.getModel().getElementAt(f);
        return arrEdades;
    }

    public void setMiRangoEdades(String[] arrasyEdades) {
        miRangoEdades.setModel(new DefaultComboBoxModel<>(arrasyEdades));
        if(miOpcionElegidaDefecto<0) miOpcionElegidaDefecto = 0; //Si el índice es negativo, entonces el elemento elegido por defecto será el que ocupe la posición 0.
           else if (miOpcionElegidaDefecto > arrasyEdades.length -1) miOpcionElegidaDefecto = arrasyEdades.length -1; //Si no, si el número es mayor que el número de elementos que tiene el array, entonces el valor elegido por defecto será el que ocupe la última posición.
        miRangoEdades.setSelectedIndex(miOpcionElegidaDefecto);        
    }

    public int getMiOpcionElegidaDefecto() {
        return miOpcionElegidaDefecto;
    }

    public void setMiOpcionElegidaDefecto(int opcionElegida) {
        //miRangoEdades.setSelectedIndex(miOpcionElegida); //Esta forma puede dar error si se llama a este método antes de setMiRangoEdades
        miOpcionElegidaDefecto = opcionElegida; //Utilizamos esta variable para que contenga la opción elegida por defecto.
    }

    public int getOpcionElegidaPos(){
       return miRangoEdades.getSelectedIndex();
    }

    public void setOpcionElegidaPos(int pos){
       miRangoEdades.setSelectedIndex(pos);
    }
    
    public String getOpcionElegidaTxt(){
       return miRangoEdades.getItemAt(miRangoEdades.getSelectedIndex());
    }
}
