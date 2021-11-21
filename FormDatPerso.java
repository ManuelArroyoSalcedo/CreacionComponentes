package componentes02;

import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Crear un formulario para intorudir datos eprsonales: nombre, primer apellido, segundo apellido y correo electrónico.
 * @author Manuel Arroyo Salcedo
 */
public class FormDatPerso extends JPanel{
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;

    //Se utiliza para que se pueda establecer el valor de los JTextField desde el panel de propiedades.
    private String miNombre;
    private String miPriApell;
    private String miSegApell;
    private String miCorreoElec;    
    
    /**
     * Constructor.
     */
    public FormDatPerso(){
        setLayout(null);
        setPreferredSize(new Dimension(400, 130));
        miIni();
    }

    /**
     * Inserta los componentes en el panel.
     */    
    private void miIni(){
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();


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
        
        
        add(jTextField1);
        jTextField1.setBounds(140, 10, 190, 20);
        add(jTextField2);
        jTextField2.setBounds(140, 40, 190, 20);
        add(jTextField3);
        jTextField3.setBounds(140, 70, 190, 20);
        add(jTextField4);
        jTextField4.setBounds(140, 100, 250, 20);    
    }

    //GETTER Y SETTER
    public String getMiNombre() {
        return jTextField1.getText();
    }

    public void setMiNombre(String miNombre) {
        jTextField1.setText(miNombre);
    }

    public String getMiPriApell() {
        return jTextField2.getText();
    }

    public void setMiPriApell(String miPriApell) {
        jTextField2.setText(miPriApell);
    }

    public String getMiSegApell() {
        return jTextField3.getText();
    }

    public void setMiSegApell(String miSegApell) {
        jTextField3.setText(miSegApell);
    }

    public String getMiCorreoElec() {
        return jTextField4.getText();
    }

    public void setMiCorreoElec(String miCorreoElec) {
        jTextField4.setText(miCorreoElec);
    }
}
