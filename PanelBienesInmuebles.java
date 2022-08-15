/**
 *
 * @author  KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
package vista;

import controlador.CaptadorController.RegistrarInmuebles;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import static vista.InterfacePrincipal.Panelcontenido;

public class PanelBienesInmuebles extends javax.swing.JPanel {
    public static Object[] inmuebleedit = new Object[7];
    RegistrarInmuebles registro = new RegistrarInmuebles();

    public PanelBienesInmuebles() {
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

   public PanelBienesInmuebles(String rol) {
        initComponents();
        BotonEditar.setVisible(false);
        TablaBienesInmuebles.setEnabled(false);
        if (rol.equalsIgnoreCase("CAPTADOR")) {
            registro.leerInmuebles(TablaBienesInmuebles, registro.getDao().listado());
            BotonEditar.setVisible(true);
            TablaBienesInmuebles.setEnabled(true);
        } else {
                registro.leerInmuebles(TablaBienesInmuebles, registro.getDao().listado());
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

        body = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        IdProductoObtenidoTxT = new javax.swing.JTextField();
        BotonBuscar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BotonEditar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaBienesInmuebles = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Bienes Inmuebles");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 240, -1));

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator2.setPreferredSize(new java.awt.Dimension(250, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 620, 10));

        IdProductoObtenidoTxT.setForeground(new java.awt.Color(102, 102, 102));
        IdProductoObtenidoTxT.setText("Ingrese el ID del Bien Inmueble");
        IdProductoObtenidoTxT.setBorder(null);
        IdProductoObtenidoTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IdProductoObtenidoTxTMousePressed(evt);
            }
        });
        IdProductoObtenidoTxT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdProductoObtenidoTxTActionPerformed(evt);
            }
        });
        add(IdProductoObtenidoTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 620, 30));

        BotonBuscar.setBackground(new java.awt.Color(5, 23, 58));
        BotonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonBuscarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonBuscarMousePressed(evt);
            }
        });
        BotonBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar");
        BotonBuscar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        add(BotonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 80, 30));

        BotonEditar.setBackground(new java.awt.Color(5, 23, 58));
        BotonEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonEditarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonEditarMousePressed(evt);
            }
        });
        BotonEditar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Editar");
        BotonEditar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 60, -1));

        add(BotonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 170, -1));

        TablaBienesInmuebles.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        TablaBienesInmuebles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "ID Estado del Inmueble", "Precio", "ID Dirección", "ID Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaBienesInmuebles.getTableHeader().setReorderingAllowed(false);
        TablaBienesInmuebles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablaBienesInmueblesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TablaBienesInmuebles);
        if (TablaBienesInmuebles.getColumnModel().getColumnCount() > 0) {
            TablaBienesInmuebles.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 710, 300));
    }// </editor-fold>//GEN-END:initComponents

    private void IdProductoObtenidoTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IdProductoObtenidoTxTMousePressed
        if (IdProductoObtenidoTxT.getText().equals("Ingrese el ID del Producto a Buscar"))
            IdProductoObtenidoTxT.setText("");
    }//GEN-LAST:event_IdProductoObtenidoTxTMousePressed

    private void BotonBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscarMouseEntered
        setColor(BotonBuscar);
    }//GEN-LAST:event_BotonBuscarMouseEntered

    private void BotonBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscarMouseExited
        resetColor(BotonBuscar);
    }//GEN-LAST:event_BotonBuscarMouseExited

    private void BotonEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEditarMouseEntered
        setColor(BotonEditar);
    }//GEN-LAST:event_BotonEditarMouseEntered

    private void BotonEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEditarMouseExited
        resetColor(BotonEditar);
    }//GEN-LAST:event_BotonEditarMouseExited

    private void TablaBienesInmueblesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaBienesInmueblesMousePressed
        if (IdProductoObtenidoTxT.getText().equals("") || IdProductoObtenidoTxT.getText() == null || IdProductoObtenidoTxT.getText().equals(" "))
            IdProductoObtenidoTxT.setText("Ingrese el ID del Producto a Buscar");
    }//GEN-LAST:event_TablaBienesInmueblesMousePressed

    //ABRIR SECCIÓN EDITAR
    private void BotonEditarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEditarMousePressed
        int idcell = TablaBienesInmuebles.getSelectedRow();
        if (idcell <= -1) {
            JOptionPane.showMessageDialog(this, "seleccionar el inmueble a editar. \n", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                System.out.println(idcell);
                Integer id_bien= registro.getDao().getListaInmuebles().obtenerDato(idcell).getId_Bien_Inmueble();
                String id_direccion = String.valueOf(registro.getDao().getListaInmuebles().obtenerDato(idcell).getId_direccion());
                String id_descripcion = String.valueOf(registro.getDao().getListaInmuebles().obtenerDato(idcell).getId_descripcion());
                String precio = String.valueOf(registro.getDao().getListaInmuebles().obtenerDato(idcell).getPrecio());
                PanelNuevoBienInmueble pnbi = new PanelNuevoBienInmueble(id_bien,id_direccion, id_descripcion, precio);
                mostrarContenido(pnbi);
            } catch (Exception e) {
            }
        }
//        PanelNuevoBienInmueble pnbi = new PanelNuevoBienInmueble(Boolean.TRUE);
//        mostrarContenido(pnbi);
    }//GEN-LAST:event_BotonEditarMousePressed
    // BUSCAR
    private void BotonBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscarMousePressed

    }//GEN-LAST:event_BotonBuscarMousePressed

    private void IdProductoObtenidoTxTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdProductoObtenidoTxTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdProductoObtenidoTxTActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonBuscar;
    private javax.swing.JPanel BotonEditar;
    private javax.swing.JTextField IdProductoObtenidoTxT;
    private javax.swing.JTable TablaBienesInmuebles;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel body;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
