/**
 *
 * @author  KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
package vista;

import controlador.Adaptador.DAO_Modelo.Bien_InmuebleDAO;
import controlador.Adaptador.DAO_Modelo.VentaDAO;
import controlador.DespachadorController.Ventas;
import controlador.tda.lista.exception.PosicionException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static vista.InterfacePrincipal.Panelcontenido;

public class PanelServicio extends javax.swing.JPanel {

    private boolean edit;
    Ventas v = new Ventas();
    VentaDAO dao = new VentaDAO();
    Bien_InmuebleDAO daoBien = new Bien_InmuebleDAO();

    public PanelServicio() {
        initComponents();
        edit = false;
        fechaActual();
        fechaTxT.setEditable(false);
        nroVentaTxT.setEditable(false);
        totalVentaTxT.setEditable(false);
        System.out.println("******" + v.getDaoBien().listado().getSize());
        nroVentaTxT.setText(String.valueOf(v.getDaoVen().listado().getSize()));
        v.mostrarDatosTablaInmuebles(tblInmuebles);
        v.leerClientes(tblClientes, v.getDaoPer().listado());
    }

    private void fechaActual() {
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        fechaTxT.setText(dia + " / " + month + " / " + year);
    }

    public void mostrarContenido(JPanel p) {
        p.setSize(750, 430);
        p.setLocation(0, 0);

        Panelcontenido.removeAll();
        Panelcontenido.add(p, BorderLayout.CENTER);
        Panelcontenido.revalidate();
        Panelcontenido.repaint();
    }

    public Integer traerDato(Integer id) throws Exception {
        try {
            Integer dato;
            int idPos = tblInmuebles.getSelectedRow();
            if (idPos > -1) {
                dato = v.getDaoBien().getListaInmuebles().obtenerDato(idPos).getId_direccion();
                return dato;
            } else {
                JOptionPane.showMessageDialog(null, "Selecciones una fila de bien inmueble");
                return null;
            }

        } catch (PosicionException ex) {
            return null;
        }
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

        jPanel1 = new javax.swing.JPanel();
        body1 = new javax.swing.JPanel();
        BotonGuardar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TitleUserTxT1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Text9 = new javax.swing.JLabel();
        nroVentaTxT = new javax.swing.JTextField();
        jSeparator21 = new javax.swing.JSeparator();
        fechaTxT = new javax.swing.JTextField();
        Text10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator24 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInmuebles = new javax.swing.JTable();
        jSeparator22 = new javax.swing.JSeparator();
        buscarInmuebleBttn = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator23 = new javax.swing.JSeparator();
        Text11 = new javax.swing.JLabel();
        totalVentaTxT = new javax.swing.JTextField();
        Text12 = new javax.swing.JLabel();
        Text13 = new javax.swing.JLabel();
        txtCedulaDespachador = new javax.swing.JTextField();
        jSeparator20 = new javax.swing.JSeparator();
        Text14 = new javax.swing.JLabel();
        fechaVenta = new com.toedter.calendar.JDateChooser();

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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonGuardarMouseClicked(evt);
            }
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

        jPanel1.add(BotonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 140, 40));

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
        nroVentaTxT.setText("Nro. Venta");
        nroVentaTxT.setBorder(null);
        nroVentaTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nroVentaTxTMousePressed(evt);
            }
        });
        jPanel2.add(nroVentaTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 260, 30));

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
        fechaTxT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaTxTActionPerformed(evt);
            }
        });
        jPanel2.add(fechaTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 260, 30));

        Text10.setBackground(new java.awt.Color(255, 255, 255));
        Text10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text10.setForeground(new java.awt.Color(255, 255, 255));
        Text10.setText("Fecha");
        jPanel2.add(Text10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 150, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/calendar-plus.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 30, 30));

        jSeparator24.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator24.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel2.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 260, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 760, 80));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DEL CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblClientes);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 350, 80));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 370, 120));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DEL INMUEBLE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblInmuebles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Precio", "Direccion", "TipoInmueble"
            }
        ));
        tblInmuebles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblInmueblesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblInmuebles);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 350, 80));

        jSeparator22.setForeground(new java.awt.Color(255, 0, 51));
        jSeparator22.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel4.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 160, 10));

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
        jLabel2.setText("Detalle Inmueble");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        buscarInmuebleBttn.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 30));

        jPanel4.add(buscarInmuebleBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 160, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 370, 150));

        jSeparator23.setForeground(new java.awt.Color(51, 51, 55));
        jSeparator23.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 260, 10));

        Text11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text11.setForeground(new java.awt.Color(102, 102, 102));
        Text11.setText("Seleccione las filas correspondiente a los datos de venta");
        jPanel1.add(Text11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 360, -1));

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

        Text12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text12.setForeground(new java.awt.Color(0, 0, 0));
        Text12.setText("Fecha:");
        jPanel1.add(Text12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 60, -1));

        Text13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text13.setForeground(new java.awt.Color(0, 0, 0));
        Text13.setText("Total de Venta");
        jPanel1.add(Text13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 120, -1));
        jPanel1.add(txtCedulaDespachador, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 180, 30));

        jSeparator20.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator20.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 180, 20));

        Text14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text14.setForeground(new java.awt.Color(0, 0, 0));
        Text14.setText("Ingrese su cédula:");
        jPanel1.add(Text14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 120, -1));
        jPanel1.add(fechaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 180, 30));

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

    private void buscarInmuebleBttnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarInmuebleBttnMouseEntered
        setColor(buscarInmuebleBttn);
    }//GEN-LAST:event_buscarInmuebleBttnMouseEntered

    private void buscarInmuebleBttnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarInmuebleBttnMouseExited
        resetColor(buscarInmuebleBttn);
    }//GEN-LAST:event_buscarInmuebleBttnMouseExited

    private void buscarInmuebleBttnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarInmuebleBttnMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarInmuebleBttnMousePressed

    private void totalVentaTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totalVentaTxTMousePressed

    }//GEN-LAST:event_totalVentaTxTMousePressed

    private void fechaTxTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaTxTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaTxTActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        PanelDescripcion pd = new PanelDescripcion(v.getDaoBien().listado().getSize());
        mostrarContenido(pd);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void BotonGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMouseClicked
        try {
            v.generarVenta(datoCliente(), v.id_despachador(txtCedulaDespachador.getText()), fechaVenta.getDate(), datoPrecio(), datoID());
        } catch (Exception ex) {
            System.out.println("ERROR: " + ex);
        }
    }//GEN-LAST:event_BotonGuardarMouseClicked

    private void tblInmueblesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInmueblesMouseClicked
        try {
            totalVentaTxT.setText(String.valueOf(datoPrecio()));
        } catch (Exception ex) {
            System.out.println("ERROR: " + ex);
        }
    }//GEN-LAST:event_tblInmueblesMouseClicked

    public Integer datoID() throws Exception {
        try {
            Integer dato;
            int idPos = tblInmuebles.getSelectedRow();
            if (idPos > -1) {
                dato = v.getDaoBien().getListaInmuebles().obtenerDato(idPos).getId_Bien_Inmueble();
                return dato;
            } else {
                JOptionPane.showMessageDialog(null, "Selecciones una fila de bien inmueble");
                return null;
            }

        } catch (PosicionException ex) {
            return null;
        }
    }

    public Integer datoCliente() throws Exception {
        try {
            Integer dato;
            int idPos = tblClientes.getSelectedRow();
            if (idPos > -1) {
                dato = v.getDaoPer().getListaPersonas().obtenerDato(idPos).getId_persona();
                return dato;
            } else {
                JOptionPane.showMessageDialog(null, "Selecciones una fila de cliente");
                return null;
            }

        } catch (PosicionException ex) {
            return null;
        }
    }

    public Double datoPrecio() throws Exception {
        try {
            Double dato;
            int idPos = tblInmuebles.getSelectedRow() ;
            if (idPos > -1) {
                dato = v.getDaoBien().getListaInmuebles().obtenerDato(idPos).getPrecio();
                return dato;
            } else {
                JOptionPane.showMessageDialog(null, "Selecciones una fila de bien inmueble");
                return null;
            }
        } catch (PosicionException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonGuardar;
    private javax.swing.JLabel Text10;
    private javax.swing.JLabel Text11;
    private javax.swing.JLabel Text12;
    private javax.swing.JLabel Text13;
    private javax.swing.JLabel Text14;
    private javax.swing.JLabel Text9;
    private javax.swing.JLabel TitleUserTxT1;
    private javax.swing.JPanel body1;
    private javax.swing.JPanel buscarInmuebleBttn;
    private javax.swing.JTextField fechaTxT;
    private com.toedter.calendar.JDateChooser fechaVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JTextField nroVentaTxT;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTable tblInmuebles;
    private javax.swing.JTextField totalVentaTxT;
    private javax.swing.JTextField txtCedulaDespachador;
    // End of variables declaration//GEN-END:variables
}
