/**
 *
 * @author  KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
package vista;

import controlador.CaptadorController.RegistrarInmuebles;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import static vista.InterfacePrincipal.Panelcontenido;

public class PanelDireccion extends javax.swing.JPanel {
    RegistrarInmuebles cap = new RegistrarInmuebles();
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

    public void guardar() throws Exception {
        int lugar = jboxLugar.getSelectedIndex();
        switch (lugar) {
            case 1:
                cap.resgitrarDireccion("LL_ESAG", txtCprincipal.getText(), txtCsecundaria.getText());
                break;
            case 2:
                cap.resgitrarDireccion("LL_SUCR", txtCprincipal.getText(), txtCsecundaria.getText());
                break;
            case 3:
                cap.resgitrarDireccion("LL_EVAL", txtCprincipal.getText(), txtCsecundaria.getText());
                break;
            case 4:
                cap.resgitrarDireccion("LL_SSEB", txtCprincipal.getText(), txtCsecundaria.getText());
                break;
            case 5:
                cap.resgitrarDireccion("LL_PUNZ", txtCprincipal.getText(), txtCsecundaria.getText());
                break;
            case 6:
                cap.resgitrarDireccion("LL_CARI", txtCprincipal.getText(), txtCsecundaria.getText());
                break;
            case 7:
                cap.resgitrarDireccion("LL_MALA", txtCprincipal.getText(), txtCsecundaria.getText());
                break;
            case 8:
                cap.resgitrarDireccion("LL_SPED", txtCprincipal.getText(), txtCsecundaria.getText());
                break;
            case 9:
                cap.resgitrarDireccion("LL_VILC", txtCprincipal.getText(), txtCsecundaria.getText());
                break;
            case 10:
                cap.resgitrarDireccion("LL_ECIS", txtCprincipal.getText(), txtCsecundaria.getText());
                break;
            case 11:
                cap.resgitrarDireccion("LL_CHAN", txtCprincipal.getText(), txtCsecundaria.getText());
                break;
            case 12:
                cap.resgitrarDireccion("LL_CHUQ", txtCprincipal.getText(), txtCsecundaria.getText());
                break;
            case 13:
                cap.resgitrarDireccion("LL_GUAL", txtCprincipal.getText(), txtCsecundaria.getText());
                break;
            case 14:
                cap.resgitrarDireccion("LL_JIMB", txtCprincipal.getText(), txtCsecundaria.getText());
                break;
            case 15:
                cap.resgitrarDireccion("LL_QUIN", txtCprincipal.getText(), txtCsecundaria.getText());
                break;
            case 16:
                cap.resgitrarDireccion("LL_SLUC", txtCprincipal.getText(), txtCsecundaria.getText());
                break;
            case 17:
                cap.resgitrarDireccion("LL_SANT", txtCprincipal.getText(), txtCsecundaria.getText());
                break;
            case 18:
                cap.resgitrarDireccion("LL_YAQU", txtCprincipal.getText(), txtCsecundaria.getText());
                break;
            case 19:
                cap.resgitrarDireccion("LL_YANG", txtCprincipal.getText(), txtCsecundaria.getText());
                break;
        }
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
        BotonGuardarDescripcion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCsecundaria = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Text7 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        Text8 = new javax.swing.JLabel();
        jboxLugar = new javax.swing.JComboBox<>();
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

        add(BotonGuardarDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 130, 30));

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
        add(Text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 200, -1));

        jSeparator8.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator8.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 530, 10));

        Text8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text8.setText("Lugar");
        add(Text8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 140, -1));

        jboxLugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "EL SAGRARIO", "SUCRE", "EL VALLE ", "SAN SEBASTIAN", "PUNZARA", "CARIGAN", "MALACATOS", "SAN PEDRO DE VILCABAMBA", "VILCABAMBA", "EL CISNE", "CHANTACO", "CHUQUIRIBAMBA", "GUALEL", "JIMBILLA", "QUINARA", "SAN LUCAS", "SANTIAGO", "TAQUIL", "YANGANA" }));
        add(jboxLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 530, 30));

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
        add(txtCprincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 530, 30));

        jSeparator6.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator6.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 530, -1));

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
        try {
            guardar();
        } catch (Exception ex) {
            Logger.getLogger(PanelDireccion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotonGuardarDescripcionMousePressed

    private void txtCsecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCsecundariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCsecundariaActionPerformed

    private void txtCprincipalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCprincipalMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCprincipalMousePressed

    private void txtCprincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCprincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCprincipalActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonGuardarDescripcion;
    private javax.swing.JLabel Text18;
    private javax.swing.JLabel Text7;
    private javax.swing.JLabel Text8;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel body;
    private javax.swing.ButtonGroup grupAmueblado;
    private javax.swing.ButtonGroup grupAscensor;
    private javax.swing.ButtonGroup grupPiscina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JComboBox<String> jboxLugar;
    private javax.swing.JTextField txtCprincipal;
    private javax.swing.JTextField txtCsecundaria;
    // End of variables declaration//GEN-END:variables
}
