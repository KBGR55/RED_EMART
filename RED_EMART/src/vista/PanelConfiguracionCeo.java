/**
 *
 * @author  KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
package vista;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import static vista.InterfacePrincipal.Panelcontenido;
public class PanelConfiguracionCeo extends javax.swing.JPanel {
    public PanelConfiguracionCeo() { 
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        TitleUserTxT = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        body1 = new javax.swing.JPanel();
        EditDatosLabelTxT = new javax.swing.JLabel();
        ListaUsuariosTxT = new javax.swing.JLabel();
        CrearNuevoAdminTxT = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        TitleUserTxT.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TitleUserTxT.setText("Configuración");
        add(TitleUserTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(750, 430));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 430));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body1.setBackground(new java.awt.Color(255, 255, 255));
        body1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(body1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        EditDatosLabelTxT.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        EditDatosLabelTxT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EditDatosLabelTxT.setText("EDITAR DATOS INFORMATIVOS DEL ADMIN");
        EditDatosLabelTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EditDatosLabelTxTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EditDatosLabelTxTMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EditDatosLabelTxTMousePressed(evt);
            }
        });
        jPanel1.add(EditDatosLabelTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 400, 20));

        ListaUsuariosTxT.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        ListaUsuariosTxT.setText("VER LISTA DE EMPLEADOS CON ACESSO AL PROGRAMA");
        ListaUsuariosTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ListaUsuariosTxTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ListaUsuariosTxTMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ListaUsuariosTxTMousePressed(evt);
            }
        });
        jPanel1.add(ListaUsuariosTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 430, 20));

        CrearNuevoAdminTxT.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        CrearNuevoAdminTxT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CrearNuevoAdminTxT.setText("MODIFICAR DATOS");
        CrearNuevoAdminTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CrearNuevoAdminTxTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CrearNuevoAdminTxTMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CrearNuevoAdminTxTMousePressed(evt);
            }
        });
        jPanel1.add(CrearNuevoAdminTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 400, 20));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void EditDatosLabelTxTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditDatosLabelTxTMouseEntered
        EditDatosLabelTxT.setForeground(Color.blue);
    }//GEN-LAST:event_EditDatosLabelTxTMouseEntered

    private void EditDatosLabelTxTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditDatosLabelTxTMouseExited
        EditDatosLabelTxT.setForeground(Color.black);
    }//GEN-LAST:event_EditDatosLabelTxTMouseExited

    private void EditDatosLabelTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditDatosLabelTxTMousePressed
        PanelModificarCeo pna = new PanelModificarCeo(Boolean.TRUE);
        mostrarContenido(pna);
    }//GEN-LAST:event_EditDatosLabelTxTMousePressed

    private void ListaUsuariosTxTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaUsuariosTxTMouseEntered
        ListaUsuariosTxT.setForeground(Color.blue);
    }//GEN-LAST:event_ListaUsuariosTxTMouseEntered

    private void ListaUsuariosTxTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaUsuariosTxTMouseExited
        ListaUsuariosTxT.setForeground(Color.black);
    }//GEN-LAST:event_ListaUsuariosTxTMouseExited

    private void ListaUsuariosTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaUsuariosTxTMousePressed
        PanelEmpleados pE = new PanelEmpleados();
        mostrarContenido(pE);
    }//GEN-LAST:event_ListaUsuariosTxTMousePressed

    private void CrearNuevoAdminTxTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearNuevoAdminTxTMouseEntered
        CrearNuevoAdminTxT.setForeground(Color.blue);
    }//GEN-LAST:event_CrearNuevoAdminTxTMouseEntered

    private void CrearNuevoAdminTxTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearNuevoAdminTxTMouseExited
        CrearNuevoAdminTxT.setForeground(Color.black);
    }//GEN-LAST:event_CrearNuevoAdminTxTMouseExited

    private void CrearNuevoAdminTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearNuevoAdminTxTMousePressed
        
        PanelModificarCeo pna = new PanelModificarCeo();
        mostrarContenido(pna);
        
    }//GEN-LAST:event_CrearNuevoAdminTxTMousePressed
    private void mostrarContenido(JPanel p){
        p.setSize(750, 430);
        p.setLocation(0,0);
        
        Panelcontenido.removeAll();
        Panelcontenido.add(p, BorderLayout.CENTER);
        Panelcontenido.revalidate();
        Panelcontenido.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CrearNuevoAdminTxT;
    private javax.swing.JLabel EditDatosLabelTxT;
    private javax.swing.JLabel ListaUsuariosTxT;
    private javax.swing.JLabel TitleUserTxT;
    private javax.swing.JPanel body;
    private javax.swing.JPanel body1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
