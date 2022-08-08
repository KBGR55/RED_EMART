/**
 *
 * @author  KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static vista.InterfacePrincipal.Panelcontenido;

public class PanelTareasEmpleadoDespachador extends javax.swing.JPanel {

    public PanelTareasEmpleadoDespachador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        TitleUserTxT = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        body1 = new javax.swing.JPanel();
        VisualizarVentasTxT = new javax.swing.JLabel();
        ListaClientesTxT = new javax.swing.JLabel();
        RealizarVentaArriendoTxT = new javax.swing.JLabel();
        VisualizarVentasTxT1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        TitleUserTxT.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TitleUserTxT.setText("TAREAS - DESPACHADOR");
        add(TitleUserTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 310, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(750, 430));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 430));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body1.setBackground(new java.awt.Color(255, 255, 255));
        body1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(body1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        VisualizarVentasTxT.setBackground(new java.awt.Color(0, 0, 0));
        VisualizarVentasTxT.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        VisualizarVentasTxT.setForeground(new java.awt.Color(0, 0, 0));
        VisualizarVentasTxT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VisualizarVentasTxT.setText("VISUALIZAR SUELDO ACTUAL");
        VisualizarVentasTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VisualizarVentasTxTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VisualizarVentasTxTMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VisualizarVentasTxTMousePressed(evt);
            }
        });
        jPanel1.add(VisualizarVentasTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 460, 20));

        ListaClientesTxT.setBackground(new java.awt.Color(0, 0, 0));
        ListaClientesTxT.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        ListaClientesTxT.setForeground(new java.awt.Color(0, 0, 0));
        ListaClientesTxT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ListaClientesTxT.setText("VER LISTA DE CLIENTES");
        ListaClientesTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ListaClientesTxTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ListaClientesTxTMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ListaClientesTxTMousePressed(evt);
            }
        });
        jPanel1.add(ListaClientesTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 460, 20));

        RealizarVentaArriendoTxT.setBackground(new java.awt.Color(0, 0, 0));
        RealizarVentaArriendoTxT.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        RealizarVentaArriendoTxT.setForeground(new java.awt.Color(0, 0, 0));
        RealizarVentaArriendoTxT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RealizarVentaArriendoTxT.setText("REALIZAR VENTA / ARRIENDO");
        RealizarVentaArriendoTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RealizarVentaArriendoTxTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RealizarVentaArriendoTxTMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RealizarVentaArriendoTxTMousePressed(evt);
            }
        });
        jPanel1.add(RealizarVentaArriendoTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 460, 20));

        VisualizarVentasTxT1.setBackground(new java.awt.Color(0, 0, 0));
        VisualizarVentasTxT1.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        VisualizarVentasTxT1.setForeground(new java.awt.Color(0, 0, 0));
        VisualizarVentasTxT1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VisualizarVentasTxT1.setText("VISUALIZAR VENTAS");
        VisualizarVentasTxT1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VisualizarVentasTxT1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VisualizarVentasTxT1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VisualizarVentasTxT1MousePressed(evt);
            }
        });
        jPanel1.add(VisualizarVentasTxT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 460, 20));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void VisualizarVentasTxTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VisualizarVentasTxTMouseEntered
        setColor(VisualizarVentasTxT);
    }//GEN-LAST:event_VisualizarVentasTxTMouseEntered

    private void VisualizarVentasTxTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VisualizarVentasTxTMouseExited
        resetColor(VisualizarVentasTxT);
    }//GEN-LAST:event_VisualizarVentasTxTMouseExited

    private void VisualizarVentasTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VisualizarVentasTxTMousePressed
        PanelModificarCeo pna = new PanelModificarCeo(Boolean.TRUE);
        mostrarContenido(pna);
    }//GEN-LAST:event_VisualizarVentasTxTMousePressed

    private void ListaClientesTxTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaClientesTxTMouseEntered
        setColor(ListaClientesTxT);
    }//GEN-LAST:event_ListaClientesTxTMouseEntered

    private void ListaClientesTxTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaClientesTxTMouseExited
        resetColor(ListaClientesTxT);
    }//GEN-LAST:event_ListaClientesTxTMouseExited

    private void ListaClientesTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaClientesTxTMousePressed
        PanelClientes pE = new PanelClientes();
        mostrarContenido(pE);
    }//GEN-LAST:event_ListaClientesTxTMousePressed

    private void RealizarVentaArriendoTxTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RealizarVentaArriendoTxTMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_RealizarVentaArriendoTxTMouseEntered

    private void RealizarVentaArriendoTxTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RealizarVentaArriendoTxTMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_RealizarVentaArriendoTxTMouseExited

    private void RealizarVentaArriendoTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RealizarVentaArriendoTxTMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_RealizarVentaArriendoTxTMousePressed

    private void VisualizarVentasTxT1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VisualizarVentasTxT1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_VisualizarVentasTxT1MouseEntered

    private void VisualizarVentasTxT1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VisualizarVentasTxT1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_VisualizarVentasTxT1MouseExited

    private void VisualizarVentasTxT1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VisualizarVentasTxT1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_VisualizarVentasTxT1MousePressed
    private void mostrarContenido(JPanel p) {
        p.setSize(750, 430);
        p.setLocation(0, 0);

        Panelcontenido.removeAll();
        Panelcontenido.add(p, BorderLayout.CENTER);
        Panelcontenido.revalidate();
        Panelcontenido.repaint();
    }

    private void setColor(JLabel p) {
        p.setForeground(Color.GRAY);
    }

    private void resetColor(JLabel p) {
        p.setForeground(Color.black);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ListaClientesTxT;
    private javax.swing.JLabel RealizarVentaArriendoTxT;
    private javax.swing.JLabel TitleUserTxT;
    private javax.swing.JLabel VisualizarVentasTxT;
    private javax.swing.JLabel VisualizarVentasTxT1;
    private javax.swing.JPanel body;
    private javax.swing.JPanel body1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
