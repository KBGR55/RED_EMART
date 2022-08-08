/**
 *
 * @author  KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
package vista;

import java.awt.Color;
import java.time.LocalDate;
import javax.swing.JPanel;

public class PanelServicio extends javax.swing.JPanel {
    private boolean edit;
    public PanelServicio() { 
        initComponents();
        edit = false;
        fechaActual();
        fechaTxT.setEditable(false);
    }
    private void fechaActual(){
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();

        fechaTxT.setText(dia + " / " + month + " / " + year);
    }
    
    private void setColor(JPanel p) {
        p.setBackground(new Color(153,153,153));
    }

    private void resetColor(JPanel p) {
        p.setBackground(new Color(6,24,60));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        body1 = new javax.swing.JPanel();
        BotonGuardar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TitleUserTxT1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Text9 = new javax.swing.JLabel();
        nroVentaTxT = new javax.swing.JTextField();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        fechaTxT = new javax.swing.JTextField();
        Text10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jSeparator24 = new javax.swing.JSeparator();
        nroVentaTxT3 = new javax.swing.JTextField();
        buscarClienteBttn = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator22 = new javax.swing.JSeparator();
        nroVentaTxT1 = new javax.swing.JTextField();
        buscarInmuebleBttn = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        agregarInmuebleBttn = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator23 = new javax.swing.JSeparator();
        Text11 = new javax.swing.JLabel();
        totalVentaTxT = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(750, 430));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 430));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body1.setBackground(new java.awt.Color(255, 255, 255));
        body1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(body1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
        jLabel1.setText("Confirmar");
        BotonGuardar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 20));

        jPanel1.add(BotonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, 140, 40));

        TitleUserTxT1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TitleUserTxT1.setText("SERVICIO DE VENTAS/ARRIENDO RED-EMART");
        jPanel1.add(TitleUserTxT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 640, 30));

        jPanel2.setBackground(new java.awt.Color(51, 51, 54));
        jPanel2.setForeground(new java.awt.Color(51, 51, 54));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Text9.setBackground(new java.awt.Color(255, 255, 255));
        Text9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text9.setForeground(new java.awt.Color(255, 255, 255));
        Text9.setText("Nro Venta");
        jPanel2.add(Text9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 150, 20));

        nroVentaTxT.setBackground(new java.awt.Color(51, 51, 55));
        nroVentaTxT.setForeground(new java.awt.Color(153, 153, 153));
        nroVentaTxT.setText("Ingresar Nro.Venta");
        nroVentaTxT.setBorder(null);
        nroVentaTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nroVentaTxTMousePressed(evt);
            }
        });
        jPanel2.add(nroVentaTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 260, 30));

        jSeparator20.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator20.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel2.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 260, 20));

        jSeparator21.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator21.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel2.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 260, 20));

        fechaTxT.setBackground(new java.awt.Color(51, 51, 55));
        fechaTxT.setForeground(new java.awt.Color(102, 102, 102));
        fechaTxT.setText("Fecha");
        fechaTxT.setBorder(null);
        fechaTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fechaTxTMousePressed(evt);
            }
        });
        jPanel2.add(fechaTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 260, 30));

        Text10.setBackground(new java.awt.Color(255, 255, 255));
        Text10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text10.setForeground(new java.awt.Color(255, 255, 255));
        Text10.setText("Fecha");
        jPanel2.add(Text10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 150, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 760, 80));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DEL CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Identificación", "Nombre", "Apellido"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 350, 80));

        jSeparator24.setForeground(new java.awt.Color(255, 0, 51));
        jSeparator24.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel3.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 210, 10));

        nroVentaTxT3.setBackground(new java.awt.Color(204, 204, 204));
        nroVentaTxT3.setForeground(new java.awt.Color(102, 102, 102));
        nroVentaTxT3.setText("Ingresar ID del Cliente");
        nroVentaTxT3.setBorder(null);
        nroVentaTxT3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nroVentaTxT3MousePressed(evt);
            }
        });
        jPanel3.add(nroVentaTxT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 210, 30));

        buscarClienteBttn.setBackground(new java.awt.Color(5, 23, 58));
        buscarClienteBttn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buscarClienteBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarClienteBttnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarClienteBttnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buscarClienteBttnMousePressed(evt);
            }
        });
        buscarClienteBttn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Buscar");
        buscarClienteBttn.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));

        jPanel3.add(buscarClienteBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 90, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 370, 200));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DEL INMUEBLE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Precio", "Direccion", "TipoServicio"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 350, 80));

        jSeparator22.setForeground(new java.awt.Color(255, 0, 51));
        jSeparator22.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel4.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 210, 10));

        nroVentaTxT1.setBackground(new java.awt.Color(204, 204, 204));
        nroVentaTxT1.setForeground(new java.awt.Color(102, 102, 102));
        nroVentaTxT1.setText("Ingresar ID del Inmueble");
        nroVentaTxT1.setBorder(null);
        nroVentaTxT1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nroVentaTxT1MousePressed(evt);
            }
        });
        jPanel4.add(nroVentaTxT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 210, 30));

        buscarInmuebleBttn.setBackground(new java.awt.Color(5, 23, 58));
        buscarInmuebleBttn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buscarInmuebleBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarInmuebleBttnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarInmuebleBttnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buscarInmuebleBttnMousePressed(evt);
            }
        });
        buscarInmuebleBttn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Buscar");
        buscarInmuebleBttn.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));

        jPanel4.add(buscarInmuebleBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 90, 30));

        agregarInmuebleBttn.setBackground(new java.awt.Color(5, 23, 58));
        agregarInmuebleBttn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        agregarInmuebleBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                agregarInmuebleBttnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                agregarInmuebleBttnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                agregarInmuebleBttnMousePressed(evt);
            }
        });
        agregarInmuebleBttn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Agregar");
        agregarInmuebleBttn.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));

        jPanel4.add(agregarInmuebleBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 90, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 370, 200));

        jSeparator23.setForeground(new java.awt.Color(51, 51, 55));
        jSeparator23.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 260, 10));

        Text11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text11.setForeground(new java.awt.Color(0, 0, 0));
        Text11.setText("Total de Venta");
        jPanel1.add(Text11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 120, -1));

        totalVentaTxT.setBackground(new java.awt.Color(255, 255, 255));
        totalVentaTxT.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        totalVentaTxT.setForeground(new java.awt.Color(102, 102, 102));
        totalVentaTxT.setText("Total de Venta $");
        totalVentaTxT.setBorder(null);
        totalVentaTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                totalVentaTxTMousePressed(evt);
            }
        });
        jPanel1.add(totalVentaTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 260, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void fechaTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechaTxTMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaTxTMousePressed

    private void nroVentaTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nroVentaTxTMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nroVentaTxTMousePressed

    private void BotonGuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMousePressed

    }//GEN-LAST:event_BotonGuardarMousePressed

    private void BotonGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMouseExited
        resetColor(BotonGuardar);
    }//GEN-LAST:event_BotonGuardarMouseExited

    private void BotonGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMouseEntered
        setColor(BotonGuardar);
    }//GEN-LAST:event_BotonGuardarMouseEntered

    private void nroVentaTxT1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nroVentaTxT1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nroVentaTxT1MousePressed

    private void buscarInmuebleBttnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarInmuebleBttnMouseEntered
        setColor(buscarInmuebleBttn);
    }//GEN-LAST:event_buscarInmuebleBttnMouseEntered

    private void buscarInmuebleBttnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarInmuebleBttnMouseExited
        resetColor(buscarInmuebleBttn);
    }//GEN-LAST:event_buscarInmuebleBttnMouseExited

    private void buscarInmuebleBttnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarInmuebleBttnMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarInmuebleBttnMousePressed

    private void agregarInmuebleBttnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarInmuebleBttnMouseEntered
        setColor(agregarInmuebleBttn);
    }//GEN-LAST:event_agregarInmuebleBttnMouseEntered

    private void agregarInmuebleBttnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarInmuebleBttnMouseExited
        resetColor(agregarInmuebleBttn);
    }//GEN-LAST:event_agregarInmuebleBttnMouseExited

    private void agregarInmuebleBttnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarInmuebleBttnMousePressed
       
    }//GEN-LAST:event_agregarInmuebleBttnMousePressed

    private void totalVentaTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totalVentaTxTMousePressed
        
    }//GEN-LAST:event_totalVentaTxTMousePressed

    private void nroVentaTxT3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nroVentaTxT3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nroVentaTxT3MousePressed

    private void buscarClienteBttnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarClienteBttnMouseEntered
        setColor(buscarClienteBttn);
    }//GEN-LAST:event_buscarClienteBttnMouseEntered

    private void buscarClienteBttnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarClienteBttnMouseExited
        resetColor(buscarClienteBttn);
    }//GEN-LAST:event_buscarClienteBttnMouseExited

    private void buscarClienteBttnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarClienteBttnMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarClienteBttnMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonGuardar;
    private javax.swing.JLabel Text10;
    private javax.swing.JLabel Text11;
    private javax.swing.JLabel Text9;
    private javax.swing.JLabel TitleUserTxT1;
    private javax.swing.JPanel agregarInmuebleBttn;
    private javax.swing.JPanel body1;
    private javax.swing.JPanel buscarClienteBttn;
    private javax.swing.JPanel buscarInmuebleBttn;
    private javax.swing.JTextField fechaTxT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField nroVentaTxT;
    private javax.swing.JTextField nroVentaTxT1;
    private javax.swing.JTextField nroVentaTxT3;
    private javax.swing.JTextField totalVentaTxT;
    // End of variables declaration//GEN-END:variables
}
