/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package proyecto_aio_flotavehiculos.Vistas;

import java.awt.event.ActionListener;

/**
 *
 * @author Jesus
 */
public class DialogoConfiguracion extends javax.swing.JDialog {

    /**
     * Creates new form DialogoConfiguracion
     */
    public DialogoConfiguracion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Ajustes");
    }

     /**
    * Getters del Nombre y DNI del propietario
    */ 
     public String getNombrePropietario() {
        return txtNombre.getText();
    }
      public String getDNIPropietario() {
        return txtDni.getText();
    }
     /**
    * Escuchador para el boton de Guardar
    */ 
      public void addActionListenerbtnGuardar(ActionListener l){
        btnGuardar.addActionListener(l);
    }
      /**
    * Escuchador para el boton de Salir
    */
        public void addActionListenerbtnSalir(ActionListener l){
        btnSalir.addActionListener(l);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelInferior = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        PanelSuperior = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabelDNI = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ajustes AIO ");

        btnGuardar.setText("Guardar");
        PanelInferior.add(btnGuardar);

        btnSalir.setText("Salir");
        PanelInferior.add(btnSalir);

        getContentPane().add(PanelInferior, java.awt.BorderLayout.PAGE_END);

        PanelSuperior.setLayout(new java.awt.GridLayout());

        jLabelNombre.setText("Nombre del Propietario:  ");
        PanelSuperior.add(jLabelNombre);
        PanelSuperior.add(txtNombre);

        jLabelDNI.setText("DNI :");
        PanelSuperior.add(jLabelDNI);
        PanelSuperior.add(txtDni);

        getContentPane().add(PanelSuperior, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelInferior;
    private javax.swing.JPanel PanelSuperior;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabelDNI;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
