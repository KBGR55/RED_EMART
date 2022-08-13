/**
 *
 * @author  KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import static vista.InterfacePrincipal.Panelcontenido;

public class PanelDireccion extends javax.swing.JPanel {
    public PanelDireccion() {
        initComponents();
    }
     public void mostrarContenido(JPanel p) {
        p.setSize(750, 430);
        p.setLocation(0, 0);

        Panelcontenido.removeAll();
        Panelcontenido.add(p, BorderLayout.CENTER);
        Panelcontenido.revalidate();
        Panelcontenido.repaint();
    }

    public PanelDireccion(Boolean edition) {
        initComponents();
        Title.setText("Editar Bien Inmueble");
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

        grupAmueblado = new javax.swing.ButtonGroup();
        grupAscensor = new javax.swing.ButtonGroup();
        grupPiscina = new javax.swing.ButtonGroup();
        body = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BotonGuardarDescripcion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Text3 = new javax.swing.JLabel();
        txtCsecundaria = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Text7 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        Text8 = new javax.swing.JLabel();
        jboxLugar = new javax.swing.JComboBox<>();
        txtIDdescripcion = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txtCprincipal = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        Text18 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Descripción Bien Inmueble");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 330, -1));

        btnRegresar.setBackground(new java.awt.Color(5, 23, 58));
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegresarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRegresarMousePressed(evt);
            }
        });
        btnRegresar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Regresar");
        btnRegresar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 150, 30));

        BotonGuardarDescripcion.setBackground(new java.awt.Color(5, 23, 58));
        BotonGuardarDescripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonGuardarDescripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonGuardarDescripcionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonGuardarDescripcionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonGuardarDescripcionMousePressed(evt);
            }
        });
        BotonGuardarDescripcion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Guardar");
        BotonGuardarDescripcion.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 30));

        add(BotonGuardarDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 130, 30));

        Text3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text3.setText("ID");
        add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 30, -1));

        txtCsecundaria.setForeground(new java.awt.Color(102, 102, 102));
        txtCsecundaria.setText("Ingrese el color");
        txtCsecundaria.setBorder(null);
        txtCsecundaria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCsecundariaMousePressed(evt);
            }
        });
        txtCsecundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCsecundariaActionPerformed(evt);
            }
        });
        add(txtCsecundaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 530, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator4.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 530, 10));

        Text7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text7.setText("Calle principal");
        add(Text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 200, -1));

        jSeparator8.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator8.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 530, 10));

        Text8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text8.setText("Lugar");
        add(Text8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 140, -1));

        jboxLugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "EL SAGRARIO", "SUCRE", "EL VALLE ", "SAN SEBASTIAN", "PUNZARA", "CARIGAN", "MALACATOS", "SAN PEDRO DE VILCABAMBA", "VILCABAMBA", "EL CISNE", "CHANTACO", "CHUQUIRIBAMBA", "GUALEL", "JIMBILLA", "QUINARA", "SAN LUCAS", "SANTIAGO", "TAQUIL", "YANGANA" }));
        add(jboxLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 530, 30));

        txtIDdescripcion.setEditable(false);
        txtIDdescripcion.setBackground(new java.awt.Color(255, 255, 255));
        txtIDdescripcion.setForeground(new java.awt.Color(102, 102, 102));
        txtIDdescripcion.setBorder(null);
        txtIDdescripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtIDdescripcionMousePressed(evt);
            }
        });
        txtIDdescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDdescripcionActionPerformed(evt);
            }
        });
        add(txtIDdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 260, 30));

        jSeparator5.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator5.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 260, 10));

        txtCprincipal.setForeground(new java.awt.Color(102, 102, 102));
        txtCprincipal.setText("Ingrese el tamaño");
        txtCprincipal.setBorder(null);
        txtCprincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCprincipalMousePressed(evt);
            }
        });
        txtCprincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCprincipalActionPerformed(evt);
            }
        });
        add(txtCprincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 530, 30));

        jSeparator6.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator6.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 530, -1));

        Text18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text18.setText("Calle secundaria");
        add(Text18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BotonGuardarDescripcionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarDescripcionMouseEntered
        setColor(BotonGuardarDescripcion);
    }//GEN-LAST:event_BotonGuardarDescripcionMouseEntered

    private void BotonGuardarDescripcionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarDescripcionMouseExited
        resetColor(BotonGuardarDescripcion);
    }//GEN-LAST:event_BotonGuardarDescripcionMouseExited

    private void txtCsecundariaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCsecundariaMousePressed

    }//GEN-LAST:event_txtCsecundariaMousePressed

    // SUBIR
    private void BotonGuardarDescripcionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarDescripcionMousePressed

    }//GEN-LAST:event_BotonGuardarDescripcionMousePressed

    private void txtCsecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCsecundariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCsecundariaActionPerformed

    private void txtIDdescripcionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDdescripcionMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDdescripcionMousePressed

    private void txtIDdescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDdescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDdescripcionActionPerformed

    private void txtCprincipalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCprincipalMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCprincipalMousePressed

    private void txtCprincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCprincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCprincipalActionPerformed

    private void btnRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarMouseEntered

    private void btnRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarMouseExited

    private void btnRegresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMousePressed
        PanelNuevoBienInmueble pnbi = new PanelNuevoBienInmueble();
        mostrarContenido(pnbi);
    }//GEN-LAST:event_btnRegresarMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonGuardarDescripcion;
    private javax.swing.JLabel Text18;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text7;
    private javax.swing.JLabel Text8;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel body;
    private javax.swing.JPanel btnRegresar;
    private javax.swing.ButtonGroup grupAmueblado;
    private javax.swing.ButtonGroup grupAscensor;
    private javax.swing.ButtonGroup grupPiscina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JComboBox<String> jboxLugar;
    private javax.swing.JTextField txtCprincipal;
    private javax.swing.JTextField txtCsecundaria;
    private javax.swing.JTextField txtIDdescripcion;
    // End of variables declaration//GEN-END:variables
}
