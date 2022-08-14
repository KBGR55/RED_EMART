/**
 *
 * @author  KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
package vista;

import controlador.DespachadorController.RegistrarClientes;
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

public class PanelClientes extends javax.swing.JPanel {

    RegistrarClientes rc = new RegistrarClientes();
    Tablas tO = new Tablas();

    public PanelClientes() {
        initComponents();
        rc.leer(TablaUsuarioContenido, rc.getDao().listado());
    }

    private void buscarAtributo(ListaEnlazada lista, String txt) {
        try {
            rc.getDao().listado().metodoShell("IDENTIFICACION", TipoOrdenacion.ASCENDENTE);
            try {
                lista = rc.getDao().listado().buscar("IDENTIFICACION", txt);
                tO.setListaCliente(lista);
                TablaUsuarioContenido.setModel(tO);
                TablaUsuarioContenido.updateUI();
            } catch (Exception ex) {
                System.out.println("ERROR EN TABLA: " + ex);
            }
        } catch (Exception ex) {
            System.out.println("ERROR EN BUSCAR: " + ex);
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
        jSeparator2 = new javax.swing.JSeparator();
        UsuarioObtenidoTxT = new javax.swing.JTextField();
        BotonBuscar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BotonNuevo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        BotonEditar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaUsuarioContenido = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Lista de Clientes");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator2.setPreferredSize(new java.awt.Dimension(250, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 610, 10));

        UsuarioObtenidoTxT.setForeground(new java.awt.Color(102, 102, 102));
        UsuarioObtenidoTxT.setText("Ingrese el identificacion a buscar");
        UsuarioObtenidoTxT.setBorder(null);
        UsuarioObtenidoTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UsuarioObtenidoTxTMousePressed(evt);
            }
        });
        UsuarioObtenidoTxT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioObtenidoTxTActionPerformed(evt);
            }
        });
        add(UsuarioObtenidoTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 610, 30));

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
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        BotonBuscar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        add(BotonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 80, 30));

        BotonNuevo.setBackground(new java.awt.Color(5, 23, 58));
        BotonNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonNuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonNuevoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonNuevoMousePressed(evt);
            }
        });
        BotonNuevo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nuevo");
        BotonNuevo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, -1));

        add(BotonNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 395, 200, 30));

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
        BotonEditar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, -1));

        add(BotonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 395, 170, 30));

        TablaUsuarioContenido.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        TablaUsuarioContenido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido", "Identificacion", "Tipo", "Fecha nacimiento", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaUsuarioContenido.getTableHeader().setReorderingAllowed(false);
        TablaUsuarioContenido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablaUsuarioContenidoMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TablaUsuarioContenido);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 740, 300));
    }// </editor-fold>//GEN-END:initComponents

    private void UsuarioObtenidoTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuarioObtenidoTxTMousePressed
        if (UsuarioObtenidoTxT.getText().equals("Ingrese el Usuario a buscar"))
            UsuarioObtenidoTxT.setText("");
    }//GEN-LAST:event_UsuarioObtenidoTxTMousePressed

    private void BotonBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscarMouseEntered
        setColor(BotonBuscar);
    }//GEN-LAST:event_BotonBuscarMouseEntered

    private void BotonBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscarMouseExited
        resetColor(BotonBuscar);
    }//GEN-LAST:event_BotonBuscarMouseExited

    private void BotonNuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonNuevoMouseEntered
        setColor(BotonNuevo);
    }//GEN-LAST:event_BotonNuevoMouseEntered

    private void BotonNuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonNuevoMouseExited
        resetColor(BotonNuevo);
    }//GEN-LAST:event_BotonNuevoMouseExited

    private void BotonNuevoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonNuevoMousePressed
        PanelNuevoCliente pnE = new PanelNuevoCliente();
        mostrarContenido(pnE);
    }//GEN-LAST:event_BotonNuevoMousePressed

    private void BotonEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEditarMouseEntered
        setColor(BotonEditar);
    }//GEN-LAST:event_BotonEditarMouseEntered

    private void BotonEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEditarMouseExited
        resetColor(BotonEditar);
    }//GEN-LAST:event_BotonEditarMouseExited

    private void TablaUsuarioContenidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaUsuarioContenidoMousePressed
        if (UsuarioObtenidoTxT.getText().equals("") || UsuarioObtenidoTxT.getText() == null || UsuarioObtenidoTxT.getText().equals(" "))
            UsuarioObtenidoTxT.setText("Ingrese el Nombre de Usuario a Buscar");
    }//GEN-LAST:event_TablaUsuarioContenidoMousePressed


    private void BotonEditarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEditarMousePressed
        PanelNuevoEmpleado pnE = new PanelNuevoEmpleado(Boolean.TRUE);
        mostrarContenido(pnE);
    }//GEN-LAST:event_BotonEditarMousePressed
    // BUSCAR
    private void BotonBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscarMousePressed

    }//GEN-LAST:event_BotonBuscarMousePressed

    private void UsuarioObtenidoTxTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioObtenidoTxTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioObtenidoTxTActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        ListaEnlazada<Persona> clientes = new ListaEnlazada<>();
        buscarAtributo(clientes, UsuarioObtenidoTxT.getText());
    }//GEN-LAST:event_jLabel1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonBuscar;
    private javax.swing.JPanel BotonEditar;
    private javax.swing.JPanel BotonNuevo;
    private javax.swing.JTable TablaUsuarioContenido;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField UsuarioObtenidoTxT;
    private javax.swing.JPanel body;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
