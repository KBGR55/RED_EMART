/**
 *
 * @author  KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
package vista;

import java.awt.Color;
import javax.swing.JPanel;

public class PanelNuevoBienInmueble extends javax.swing.JPanel {

    private boolean edition;
    String origId;

    public PanelNuevoBienInmueble() {
        initComponents();
        Text6.setVisible(false);
        estadoComboBox.setVisible(false);
        edition = false;

    }

    public PanelNuevoBienInmueble(Boolean edition) {
        initComponents();
        this.edition = edition;
        Title.setText("Editar Bien Inmueble");
        Text6.setVisible(true);
        estadoComboBox.setVisible(true);
        jLabel1.setText("Guardar");
    }

    private void setColor(JPanel p) {
        p.setBackground(new Color(153, 153, 153));
    }

    private void resetColor(JPanel p) {
        p.setBackground(new Color(6, 24, 60));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        BotonGuardar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Text3 = new javax.swing.JLabel();
        idTxT = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Text6 = new javax.swing.JLabel();
        Text7 = new javax.swing.JLabel();
        direccionTxT = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        Text15 = new javax.swing.JLabel();
        Text16 = new javax.swing.JLabel();
        precioTxT = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        estadoComboBox = new javax.swing.JComboBox<>();
        servicioComboBox = new javax.swing.JComboBox<>();
        Text8 = new javax.swing.JLabel();
        direccionTxT1 = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Nuevo Bien Inmueble");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 330, -1));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 10, 200));

        BotonGuardar.setBackground(new java.awt.Color(5, 23, 58));
        BotonGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonGuardarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonGuardarMousePressed(evt);
            }
        });
        BotonGuardar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Subir");
        BotonGuardar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 30));

        add(BotonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 200, 50));

        Text3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text3.setText("ID");
        add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 30, -1));

        idTxT.setForeground(new java.awt.Color(102, 102, 102));
        idTxT.setText("Ingrese el ID del Bien Inmueble");
        idTxT.setBorder(null);
        idTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                idTxTMousePressed(evt);
            }
        });
        add(idTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 260, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator4.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 260, 10));

        Text6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text6.setText("Estado del Bien Inmueble");
        add(Text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, -1, -1));

        Text7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text7.setText("Descripcion");
        add(Text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 90, -1));

        direccionTxT.setForeground(new java.awt.Color(102, 102, 102));
        direccionTxT.setText("Ingrese la dirección");
        direccionTxT.setBorder(null);
        direccionTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                direccionTxTMousePressed(evt);
            }
        });
        add(direccionTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 260, 30));

        jSeparator8.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator8.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 260, 10));

        Text15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text15.setText("Tipo de Servicio");
        add(Text15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, -1, -1));

        Text16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text16.setText("Precio");
        add(Text16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        precioTxT.setForeground(new java.awt.Color(102, 102, 102));
        precioTxT.setText("Ingrese el precio");
        precioTxT.setBorder(null);
        precioTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                precioTxTMousePressed(evt);
            }
        });
        add(precioTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 260, 30));

        jSeparator17.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator17.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 260, 10));

        estadoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "Vendido" }));
        add(estadoComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 260, 30));

        servicioComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arriendo", "Venta" }));
        add(servicioComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 260, 30));

        Text8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text8.setText("Dirección");
        add(Text8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 70, -1));

        direccionTxT1.setForeground(new java.awt.Color(102, 102, 102));
        direccionTxT1.setText("Ingrese la descripcion");
        direccionTxT1.setBorder(null);
        direccionTxT1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                direccionTxT1MousePressed(evt);
            }
        });
        direccionTxT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionTxT1ActionPerformed(evt);
            }
        });
        add(direccionTxT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 260, 30));

        jSeparator9.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator9.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 260, 10));

        jSeparator10.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator10.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 260, 20));

        jSeparator11.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator11.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 260, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void BotonGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMouseEntered
        setColor(BotonGuardar);
    }//GEN-LAST:event_BotonGuardarMouseEntered

    private void BotonGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMouseExited
        resetColor(BotonGuardar);
    }//GEN-LAST:event_BotonGuardarMouseExited

    private void idTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idTxTMousePressed

    }//GEN-LAST:event_idTxTMousePressed

    private void direccionTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_direccionTxTMousePressed

    }//GEN-LAST:event_direccionTxTMousePressed

    // SUBIR
    private void BotonGuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMousePressed

    }//GEN-LAST:event_BotonGuardarMousePressed

    private void precioTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_precioTxTMousePressed

    }//GEN-LAST:event_precioTxTMousePressed

    private void direccionTxT1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_direccionTxT1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionTxT1MousePressed

    private void direccionTxT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionTxT1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionTxT1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonGuardar;
    private javax.swing.JLabel Text15;
    private javax.swing.JLabel Text16;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text6;
    private javax.swing.JLabel Text7;
    private javax.swing.JLabel Text8;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel body;
    private javax.swing.JTextField direccionTxT;
    private javax.swing.JTextField direccionTxT1;
    private javax.swing.JComboBox<String> estadoComboBox;
    private javax.swing.JTextField idTxT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField precioTxT;
    private javax.swing.JComboBox<String> servicioComboBox;
    // End of variables declaration//GEN-END:variables
}
