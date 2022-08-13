/**
 *
 * @author  KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import static vista.InterfacePrincipal.Panelcontenido;

public class PanelDescripcion extends javax.swing.JPanel {
    public PanelDescripcion() {
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

    public PanelDescripcion(Boolean edition) {
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
        jSeparator3 = new javax.swing.JSeparator();
        btnRegresar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BotonGuardarDescripcion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Text3 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Text7 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        Text15 = new javax.swing.JLabel();
        Text16 = new javax.swing.JLabel();
        txtPisos = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        Text8 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jboxTipoBien = new javax.swing.JComboBox<>();
        txtIDdescripcion = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txtSize = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        Text17 = new javax.swing.JLabel();
        txtHabitaciones = new javax.swing.JTextField();
        Text18 = new javax.swing.JLabel();
        Text19 = new javax.swing.JLabel();
        Text20 = new javax.swing.JLabel();
        rbAmuebladoNO = new javax.swing.JRadioButton();
        rbAmuebladoSI = new javax.swing.JRadioButton();
        rbAsensorNO = new javax.swing.JRadioButton();
        rbAsensorSI = new javax.swing.JRadioButton();
        rbPiscinaNO = new javax.swing.JRadioButton();
        rbPiscinaSI = new javax.swing.JRadioButton();

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

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 10, 200));

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
        btnRegresar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 30));

        add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 130, 30));

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

        add(BotonGuardarDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 120, 30));

        Text3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text3.setText("ID");
        add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 30, -1));

        txtColor.setForeground(new java.awt.Color(102, 102, 102));
        txtColor.setText("Ingrese el color");
        txtColor.setBorder(null);
        txtColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtColorMousePressed(evt);
            }
        });
        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });
        add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 260, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator4.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 260, 10));

        Text7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text7.setText("Tamaño en metros cuadrados");
        add(Text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 200, -1));

        jSeparator8.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator8.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 260, 10));

        Text15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text15.setText("Número de pisos");
        add(Text15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, -1));

        Text16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text16.setText("Número de habitaciones");
        add(Text16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, -1));

        txtPisos.setForeground(new java.awt.Color(102, 102, 102));
        txtPisos.setText("Ingrese el nro. de pisos");
        txtPisos.setBorder(null);
        txtPisos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPisosMousePressed(evt);
            }
        });
        add(txtPisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 260, 30));

        jSeparator17.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator17.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 260, 10));

        Text8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text8.setText("Tipo del inmueble");
        add(Text8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 140, -1));

        jSeparator9.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator9.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 260, 10));

        jboxTipoBien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Casa", "Casa_vacacional", "Edificio", "Departamento" }));
        add(jboxTipoBien, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 260, 30));

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

        txtSize.setForeground(new java.awt.Color(102, 102, 102));
        txtSize.setText("Ingrese el tamaño");
        txtSize.setBorder(null);
        txtSize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtSizeMousePressed(evt);
            }
        });
        txtSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSizeActionPerformed(evt);
            }
        });
        add(txtSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 260, 30));

        jSeparator6.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator6.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 260, -1));

        Text17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text17.setText("Ascensor");
        add(Text17, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, -1, -1));

        txtHabitaciones.setForeground(new java.awt.Color(102, 102, 102));
        txtHabitaciones.setText("Ingrese el nro. de habitaciones");
        txtHabitaciones.setBorder(null);
        txtHabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtHabitacionesMousePressed(evt);
            }
        });
        add(txtHabitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 260, 30));

        Text18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text18.setText("Color");
        add(Text18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        Text19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text19.setText("Piscina");
        add(Text19, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, -1, -1));

        Text20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text20.setText("Amueblado");
        add(Text20, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, -1, -1));

        rbAmuebladoNO.setBackground(new java.awt.Color(255, 255, 255));
        grupAmueblado.add(rbAmuebladoNO);
        rbAmuebladoNO.setSelected(true);
        rbAmuebladoNO.setText("NO");
        rbAmuebladoNO.setActionCommand("");
        rbAmuebladoNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAmuebladoNOActionPerformed(evt);
            }
        });
        add(rbAmuebladoNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, -1, -1));

        rbAmuebladoSI.setBackground(new java.awt.Color(255, 255, 255));
        grupAmueblado.add(rbAmuebladoSI);
        rbAmuebladoSI.setText("SI");
        rbAmuebladoSI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAmuebladoSIActionPerformed(evt);
            }
        });
        add(rbAmuebladoSI, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));

        rbAsensorNO.setBackground(new java.awt.Color(255, 255, 255));
        grupAscensor.add(rbAsensorNO);
        rbAsensorNO.setSelected(true);
        rbAsensorNO.setText("NO");
        rbAsensorNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAsensorNOActionPerformed(evt);
            }
        });
        add(rbAsensorNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, -1, -1));

        rbAsensorSI.setBackground(new java.awt.Color(255, 255, 255));
        grupAscensor.add(rbAsensorSI);
        rbAsensorSI.setText("SI");
        rbAsensorSI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAsensorSIActionPerformed(evt);
            }
        });
        add(rbAsensorSI, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, -1, -1));

        rbPiscinaNO.setBackground(new java.awt.Color(255, 255, 255));
        grupPiscina.add(rbPiscinaNO);
        rbPiscinaNO.setSelected(true);
        rbPiscinaNO.setText("NO");
        add(rbPiscinaNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, -1, -1));

        rbPiscinaSI.setBackground(new java.awt.Color(255, 255, 255));
        grupPiscina.add(rbPiscinaSI);
        rbPiscinaSI.setText("SI");
        add(rbPiscinaSI, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BotonGuardarDescripcionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarDescripcionMouseEntered
        setColor(BotonGuardarDescripcion);
    }//GEN-LAST:event_BotonGuardarDescripcionMouseEntered

    private void BotonGuardarDescripcionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarDescripcionMouseExited
        resetColor(BotonGuardarDescripcion);
    }//GEN-LAST:event_BotonGuardarDescripcionMouseExited

    private void txtColorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtColorMousePressed

    }//GEN-LAST:event_txtColorMousePressed

    // SUBIR
    private void BotonGuardarDescripcionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarDescripcionMousePressed

    }//GEN-LAST:event_BotonGuardarDescripcionMousePressed

    private void txtPisosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPisosMousePressed

    }//GEN-LAST:event_txtPisosMousePressed

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

    private void txtIDdescripcionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDdescripcionMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDdescripcionMousePressed

    private void txtIDdescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDdescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDdescripcionActionPerformed

    private void txtSizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSizeMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSizeMousePressed

    private void txtSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSizeActionPerformed

    private void txtHabitacionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHabitacionesMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHabitacionesMousePressed

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

    private void rbAmuebladoNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAmuebladoNOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAmuebladoNOActionPerformed

    private void rbAmuebladoSIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAmuebladoSIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAmuebladoSIActionPerformed

    private void rbAsensorNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAsensorNOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAsensorNOActionPerformed

    private void rbAsensorSIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAsensorSIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAsensorSIActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonGuardarDescripcion;
    private javax.swing.JLabel Text15;
    private javax.swing.JLabel Text16;
    private javax.swing.JLabel Text17;
    private javax.swing.JLabel Text18;
    private javax.swing.JLabel Text19;
    private javax.swing.JLabel Text20;
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
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JComboBox<String> jboxTipoBien;
    private javax.swing.JRadioButton rbAmuebladoNO;
    private javax.swing.JRadioButton rbAmuebladoSI;
    private javax.swing.JRadioButton rbAsensorNO;
    private javax.swing.JRadioButton rbAsensorSI;
    private javax.swing.JRadioButton rbPiscinaNO;
    private javax.swing.JRadioButton rbPiscinaSI;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtHabitaciones;
    private javax.swing.JTextField txtIDdescripcion;
    private javax.swing.JTextField txtPisos;
    private javax.swing.JTextField txtSize;
    // End of variables declaration//GEN-END:variables
}
