/**
 *
 * @author  KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
package vista;

import controlador.DespachadorController.RegistrarClientes;
import controlador.DespachadorController.Ventas;
import controlador.tda.lista.ListaEnlazada;
import controlador.utiles.TipoOrdenacion;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Persona;

import static vista.InterfacePrincipal.Panelcontenido;
import vista.TablaClientes.Tablas;

public class PanelDescripcionVenta extends javax.swing.JPanel {

    Ventas v = new Ventas();
    PanelServicio ps = new PanelServicio();
    Integer idTraer;
    
    public PanelDescripcionVenta(Integer id) {
        initComponents();
        this.idTraer = id;
        try {
            //v.mostrarDatosTablaInmuebleVenta(tblInmueble, ps.traerDato(id));
            v.mostrarDatosTablaCliente(tblCliente, ps.traerDato(id));
        } catch (Exception ex) {
            Logger.getLogger(PanelDescripcionVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    private void setColor(JPanel p) {
        p.setBackground(new Color(153, 153, 153));
    }

    private void resetColor(JPanel p) {
        p.setBackground(new Color(6, 24, 60));
    }

    public void mostrarContenido(JPanel p) {
        p.setSize(750, 430);
        p.setLocation(0, 0);

        Panelcontenido.removeAll();
        Panelcontenido.add(p, BorderLayout.CENTER);
        Panelcontenido.revalidate();
        Panelcontenido.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInmueble = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        Title1 = new javax.swing.JLabel();
        Title2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        BotonGuardar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Title.setText("Bien inmueble");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        tblInmueble.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tblInmueble.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Direccion", "Captador", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblInmueble.getTableHeader().setReorderingAllowed(false);
        tblInmueble.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblInmuebleMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblInmueble);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 740, 70));

        tblCliente.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombres", "Apellidos", "Identificacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCliente.getTableHeader().setReorderingAllowed(false);
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblClienteMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblCliente);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 740, 80));

        Title1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title1.setText("Detalles Venta");
        add(Title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        Title2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Title2.setText("Cliente");
        add(Title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator2.setPreferredSize(new java.awt.Dimension(250, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 740, 10));

        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator3.setPreferredSize(new java.awt.Dimension(250, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 740, 10));

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
        jLabel1.setText("Volver");
        BotonGuardar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 20));

        add(BotonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 140, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void tblInmuebleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInmuebleMousePressed

    }//GEN-LAST:event_tblInmuebleMousePressed

    private void tblClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblClienteMousePressed

    private void BotonGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMouseEntered
        setColor(BotonGuardar);
    }//GEN-LAST:event_BotonGuardarMouseEntered

    private void BotonGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMouseExited
        resetColor(BotonGuardar);
    }//GEN-LAST:event_BotonGuardarMouseExited

    private void BotonGuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMousePressed
        mostrarContenido(ps);
    }//GEN-LAST:event_BotonGuardarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonGuardar;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Title1;
    private javax.swing.JLabel Title2;
    private javax.swing.JPanel body;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTable tblInmueble;
    // End of variables declaration//GEN-END:variables
}
