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

public class PanelDescripcion extends javax.swing.JPanel {

    Ventas v = new Ventas();
    PanelServicio ps = new PanelServicio();
    Integer idTraer;
    
    public PanelDescripcion(Integer id) {
        initComponents();
        this.idTraer = id;
        try {
            v.mostrarDatosTabla(tblDireccion, ps.traerDato(id));
            v.mostrarDatosTablaDescripcion(tblDescripcion, ps.traerDato(id));
        } catch (Exception ex) {
            Logger.getLogger(PanelDescripcion.class.getName()).log(Level.SEVERE, null, ex);
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
        tblDireccion = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDescripcion = new javax.swing.JTable();
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
        Title.setText("Dirección");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        tblDireccion.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tblDireccion.setModel(new javax.swing.table.DefaultTableModel(
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
                "ID", "Lugar", "Calle principal", "Calle secundaria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tblDireccion.getTableHeader().setReorderingAllowed(false);
        tblDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDireccionMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblDireccion);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 740, 70));

        tblDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tblDescripcion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Tipo inmueble", "Metros cuadrados", "Color", "Nro Cuartos", "Nro Pisos", "Amoblado", "Ascensor", "Piscina"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDescripcion.getTableHeader().setReorderingAllowed(false);
        tblDescripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDescripcionMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblDescripcion);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 740, 80));

        Title1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title1.setText("Detalles Bien Inmueble");
        add(Title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        Title2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Title2.setText("Descripcion");
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

    private void tblDireccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDireccionMousePressed

    }//GEN-LAST:event_tblDireccionMousePressed

    private void tblDescripcionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDescripcionMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDescripcionMousePressed

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
    private javax.swing.JTable tblDescripcion;
    private javax.swing.JTable tblDireccion;
    // End of variables declaration//GEN-END:variables
}
