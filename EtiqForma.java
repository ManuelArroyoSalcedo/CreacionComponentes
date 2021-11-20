package componentes02;

import javax.swing.JLabel;

/**
 * Ejemplo de creación de un componente JLabel.
 * Crear un componente etiqueta que tenga dos modos: título y texto. Ambos tendrán el mismo estilo y tamaño Arial 12), pero en el caso de que sea un título, el texto estará en negrita y alineado a la derecha.
 * @author Manuel Arroyo Salcedo
 */
public class EtiqForma extends JLabel{
    private Boolean esTitulo = Boolean.FALSE; //Inicialmente la etiqueta no es un título. 
    
    /**
     * Constructor.
     */
    public EtiqForma(){
       super("Etiqueta");
    }

    /**
     * Constructor.
     * @param txtEtiq Texto del contenido de la etiqueta.
     */
    public EtiqForma(String txtEtiq){
       super(txtEtiq);
    }

    /**
     * Devuelve un booleano indicando si esta etiqueta es un título o no lo es.
     * @return Boolean
     */
    public Boolean getEsTitulo() {
        return esTitulo;
    }

    /**
     * Establece si la etiqueta es o no un título y establece la fuente y el alineamiento según corresponda.
     * @param esTitulo Valor booleano indicando si la etiqueta es o no es un título.
     * Estableecer el estilo se hace cuando se ejecuta este método y no cuando se instanacia el objeto porque en ese momento el valor es siempre null.
     */
    public void setEsTitulo(Boolean esTitulo) {
       this.esTitulo = esTitulo;
       if(!esTitulo){
          setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
          setFont(new java.awt.Font("Arial", 0, 14)); 
       }else{
          setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);   
          setFont(new java.awt.Font("Arial", 1, 14));
       }
    }   
}
