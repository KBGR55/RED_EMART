/**
 *
 * @author  KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import static vista.InterfacePrincipal.Panelcontenido;

public class PanelNuevoBienInmueble extends javax.swing.JPanel {

    private boolean edition;
    String origId;

    public PanelNuevoBienInmueble() {
        initComponents();
        Text6.setVisible(false);
        estadoComboBox.setVisible(false);
        edition = false;

    }
     public void mostrarContenido(JPanel p) {
        p.setSize(750, 430);
        p.setLocation(0, 0);

        Panelcontenido.removeAll();
        Panelcontenido.add(p, BorderLayout.CENTER);
        Panelcontenido.revalidate();
        Panelcontenido.repaint();
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
        btnDescripcion1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        BotonGuardar4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnDescripcion = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        BotonGuardar3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        BotonGuardar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Text3 = new javax.swing.JLabel();
        idTxT = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Text6 = new javax.swing.JLabel();
        Text7 = new javax.swing.JLabel();
        Text16 = new javax.swing.JLabel();
        precioTxT = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        estadoComboBox = new javax.swing.JComboBox<>();
        Text8 = new javax.swing.JLabel();

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

        btnDescripcion1.setBackground(new java.awt.Color(5, 23, 58));
        btnDescripcion1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDescripcion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDescripcion1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDescripcion1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDescripcion1MousePressed(evt);
            }
        });
        btnDescripcion1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ingresar dirección");
        btnDescripcion1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 30));

        BotonGuardar4.setBackground(new java.awt.Color(5, 23, 58));
        BotonGuardar4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonGuardar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonGuardar4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonGuardar4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonGuardar4MousePressed(evt);
            }
        });
        BotonGuardar4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Subir");
        BotonGuardar4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 30));

        btnDescripcion1.add(BotonGuardar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 200, 50));

        add(btnDescripcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 260, 30));

        btnDescripcion.setBackground(new java.awt.Color(5, 23, 58));
        btnDescripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDescripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDescripcionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDescripcionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDescripcionMousePressed(evt);
            }
        });
        btnDescripcion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ingresar descripción");
        btnDescripcion.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 30));

        BotonGuardar3.setBackground(new java.awt.Color(5, 23, 58));
        BotonGuardar3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonGuardar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonGuardar3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonGuardar3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonGuardar3MousePressed(evt);
            }
        });
        BotonGuardar3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Subir");
        BotonGuardar3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 30));

        btnDescripcion.add(BotonGuardar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 200, 50));

        add(btnDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 260, 30));

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
        BotonGuardar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, 30));

        add(BotonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 250, 50));

        Text3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text3.setText("ID");
        add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 30, -1));

        idTxT.setEditable(false);
        idTxT.setBackground(new java.awt.Color(255, 255, 255));
        idTxT.setForeground(new java.awt.Color(102, 102, 102));
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
        add(Text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, -1, -1));

        Text7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text7.setText("Descripcion");
        add(Text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 90, -1));

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

        estadoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Disponible", "Vendido" }));
        add(estadoComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 260, 30));

        Text8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text8.setText("Dirección");
        add(Text8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 70, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BotonGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMouseEntered
        setColor(BotonGuardar);
    }//GEN-LAST:event_BotonGuardarMouseEntered

    private void BotonGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMouseExited
        resetColor(BotonGuardar);
    }//GEN-LAST:event_BotonGuardarMouseExited

    private void idTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idTxTMousePressed

    }//GEN-LAST:event_idTxTMousePressed

    // SUBIR
    private void BotonGuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMousePressed

    }//GEN-LAST:event_BotonGuardarMousePressed

    private void precioTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_precioTxTMousePressed

    }//GEN-LAST:event_precioTxTMousePressed

    private void BotonGuardar3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardar3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonGuardar3MouseEntered

    private void BotonGuardar3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardar3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonGuardar3MouseExited

    private void BotonGuardar3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardar3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonGuardar3MousePressed

    private void btnDescripcionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDescripcionMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDescripcionMouseEntered

    private void btnDescripcionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDescripcionMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDescripcionMouseExited

    private void btnDescripcionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDescripcionMousePressed
        PanelDescripcion pd = new PanelDescripcion(Boolean.TRUE);
        mostrarContenido(pd);
    }//GEN-LAST:event_btnDescripcionMousePressed

    private void BotonGuardar4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardar4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonGuardar4MouseEntered

    private void BotonGuardar4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardar4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonGuardar4MouseExited

    private void BotonGuardar4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardar4MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonGuardar4MousePressed

    private void btnDescripcion1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDescripcion1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDescripcion1MouseEntered

    private void btnDescripcion1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDescripcion1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDescripcion1MouseExited

    private void btnDescripcion1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDescripcion1MousePressed
       PanelDireccion pdd = new PanelDireccion(Boolean.TRUE);
        mostrarContenido(pdd);
    }//GEN-LAST:event_btnDescripcion1MousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonGuardar;
    private javax.swing.JPanel BotonGuardar3;
    private javax.swing.JPanel BotonGuardar4;
    private javax.swing.JLabel Text16;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text6;
    private javax.swing.JLabel Text7;
    private javax.swing.JLabel Text8;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel body;
    private javax.swing.JPanel btnDescripcion;
    private javax.swing.JPanel btnDescripcion1;
    private javax.swing.JComboBox<String> estadoComboBox;
    private javax.swing.JTextField idTxT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField precioTxT;
    // End of variables declaration//GEN-END:variables
}
