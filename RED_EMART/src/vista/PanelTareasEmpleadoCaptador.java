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

public class PanelTareasEmpleadoCaptador extends javax.swing.JPanel {

    public PanelTareasEmpleadoCaptador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        TitleUserTxT = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        body1 = new javax.swing.JPanel();
        SueldoActualTxT = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        TitleUserTxT.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TitleUserTxT.setText("TAREAS - CAPTADOR");
        add(TitleUserTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 250, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(750, 430));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 430));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body1.setBackground(new java.awt.Color(255, 255, 255));
        body1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(body1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        SueldoActualTxT.setBackground(new java.awt.Color(0, 0, 0));
        SueldoActualTxT.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        SueldoActualTxT.setForeground(new java.awt.Color(0, 0, 0));
        SueldoActualTxT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SueldoActualTxT.setText("VISUALIZAR SUELDO ACTUAL");
        SueldoActualTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SueldoActualTxTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SueldoActualTxTMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SueldoActualTxTMousePressed(evt);
            }
        });
        jPanel1.add(SueldoActualTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 430, 20));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void SueldoActualTxTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SueldoActualTxTMouseEntered
        setColor(SueldoActualTxT);
    }//GEN-LAST:event_SueldoActualTxTMouseEntered

    private void SueldoActualTxTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SueldoActualTxTMouseExited
        resetColor(SueldoActualTxT);
    }//GEN-LAST:event_SueldoActualTxTMouseExited

    private void SueldoActualTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SueldoActualTxTMousePressed
        PanelClientes pE = new PanelClientes();
        mostrarContenido(pE);
    }//GEN-LAST:event_SueldoActualTxTMousePressed
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
    private javax.swing.JLabel SueldoActualTxT;
    private javax.swing.JLabel TitleUserTxT;
    private javax.swing.JPanel body;
    private javax.swing.JPanel body1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
