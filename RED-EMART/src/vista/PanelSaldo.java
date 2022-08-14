/**
 *
 * @author  KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
package vista;

import java.awt.Color;
import java.time.LocalDate;
import javax.swing.JPanel;

public class PanelSaldo extends javax.swing.JPanel {

    public PanelSaldo() {
        initComponents();
        jPanel3.setVisible(false);
    }

    public PanelSaldo(String nameEmpleado, String porcentaje) {
        initComponents();
        NombreTxT.setText(MayuscUser(nameEmpleado));
        porcentajeTxT.setText(porcentaje);
        fechaActual();
        jPanel3.setVisible(false);
    }
    private String MayuscUser(String n) {
        return Character.toUpperCase(n.charAt(0)) + n.substring(1);
    }
    private void fechaActual(){
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        fechaTxT.setText(dia + " / " + month + " / " + year);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        body1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        NombreTxT = new javax.swing.JTextField();
        Text3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Text10 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        fechaTxT = new javax.swing.JTextField();
        ingresarBttn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TitleTxT = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        numeroAccionesTxT = new javax.swing.JTextField();
        Text5 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        Text4 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        totalTxT = new javax.swing.JTextField();
        porcentajeTxT = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        Text6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(750, 430));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 430));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body1.setBackground(new java.awt.Color(255, 255, 255));
        body1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(body1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator4.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator4.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 260, 10));

        NombreTxT.setEditable(false);
        NombreTxT.setForeground(new java.awt.Color(102, 102, 102));
        NombreTxT.setText("Ingresar Nombre");
        NombreTxT.setBorder(null);
        NombreTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NombreTxTMousePressed(evt);
            }
        });
        jPanel2.add(NombreTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 260, 30));

        Text3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text3.setText("Nombre del Empleado");
        jPanel2.add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 260, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/calendar-plus.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 30, 30));

        Text10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text10.setText("Fecha");
        jPanel2.add(Text10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 150, 20));

        jSeparator5.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator5.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 210, 10));

        fechaTxT.setEditable(false);
        fechaTxT.setForeground(new java.awt.Color(102, 102, 102));
        fechaTxT.setText("Ingresar fecha");
        fechaTxT.setBorder(null);
        fechaTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fechaTxTMousePressed(evt);
            }
        });
        jPanel2.add(fechaTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 210, 30));

        ingresarBttn.setBackground(new java.awt.Color(5, 23, 58));
        ingresarBttn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ingresarBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingresarBttnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingresarBttnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ingresarBttnMousePressed(evt);
            }
        });
        ingresarBttn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consultar");
        ingresarBttn.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, -1));

        jPanel2.add(ingresarBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 140, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 760, 100));

        TitleTxT.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TitleTxT.setText("Saldo Actual");
        jPanel1.add(TitleTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 170, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        numeroAccionesTxT.setEditable(false);
        numeroAccionesTxT.setForeground(new java.awt.Color(102, 102, 102));
        numeroAccionesTxT.setText("Datos");
        numeroAccionesTxT.setBorder(null);
        jPanel3.add(numeroAccionesTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 330, 30));

        Text5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text5.setText("Porcentaje de ganancia");
        jPanel3.add(Text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, 20));

        jSeparator6.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator6.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 330, 10));

        Text4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text4.setText("Numero de acciones realizadas");
        jPanel3.add(Text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jSeparator8.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator8.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 330, 20));

        totalTxT.setEditable(false);
        totalTxT.setForeground(new java.awt.Color(102, 102, 102));
        totalTxT.setText("Datos");
        totalTxT.setBorder(null);
        jPanel3.add(totalTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 330, 30));

        porcentajeTxT.setEditable(false);
        porcentajeTxT.setForeground(new java.awt.Color(102, 102, 102));
        porcentajeTxT.setText("Datos");
        porcentajeTxT.setBorder(null);
        porcentajeTxT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porcentajeTxTActionPerformed(evt);
            }
        });
        jPanel3.add(porcentajeTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 330, 30));

        jSeparator7.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator7.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 330, 10));

        Text6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text6.setText("Total de ganacia");
        jPanel3.add(Text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 760, 250));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void NombreTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreTxTMousePressed

    }//GEN-LAST:event_NombreTxTMousePressed

    private void fechaTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechaTxTMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaTxTMousePressed

    private void ingresarBttnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarBttnMouseEntered
        setColor(ingresarBttn);
    }//GEN-LAST:event_ingresarBttnMouseEntered

    private void ingresarBttnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarBttnMouseExited
        resetColor(ingresarBttn);
    }//GEN-LAST:event_ingresarBttnMouseExited

    private void ingresarBttnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarBttnMousePressed
        jPanel3.setVisible(true);
    }//GEN-LAST:event_ingresarBttnMousePressed

    private void porcentajeTxTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porcentajeTxTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_porcentajeTxTActionPerformed

    private void setColor(JPanel p) {
        p.setBackground(new Color(153, 153, 153));
    }

    private void resetColor(JPanel p) {
        p.setBackground(new Color(6, 24, 60));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NombreTxT;
    private javax.swing.JLabel Text10;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text4;
    private javax.swing.JLabel Text5;
    private javax.swing.JLabel Text6;
    private javax.swing.JLabel TitleTxT;
    private javax.swing.JPanel body;
    private javax.swing.JPanel body1;
    private javax.swing.JTextField fechaTxT;
    private javax.swing.JPanel ingresarBttn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField numeroAccionesTxT;
    private javax.swing.JTextField porcentajeTxT;
    private javax.swing.JTextField totalTxT;
    // End of variables declaration//GEN-END:variables
}
