/**
 *
 * @author  KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
package vista;

import controlador.CaptadorController.RegistrarInmuebles;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import static vista.InterfacePrincipal.Panelcontenido;

public class PanelNuevoBienInmueble extends javax.swing.JPanel {

    private boolean edition;
    String origId;
    RegistrarInmuebles registro = new RegistrarInmuebles();

    public PanelNuevoBienInmueble() {
        initComponents();
        llenarTabla();
        Text6.setVisible(false);
        estadoComboBox.setVisible(false);
        edition = false;
    }
     public void mostrarContenido(JPanel p) {
        p.setSize(750, 430);
        p.setLocation(0, 0);
        Panelcontenido.removeAll();
        Panelcontenido.add(p, BorderLayout.CENTER);
        Panelcontenido.revalidate();
        Panelcontenido.repaint();
    }
     
    public void llenarTabla(){
        registro.leerDesc(tblDescripcion, registro.getDaoDes().listar());
        registro.leerDir(tblDireccion, registro.getDaoD().listar());
    }
    
    
    
    public PanelNuevoBienInmueble(Boolean edition) {
        initComponents();
        this.edition = edition;
        Title.setText("Editar Bien Inmueble");
        Text6.setVisible(true);
        estadoComboBox.setVisible(true);
        jLabel1.setText("Guardar");
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
        jSeparator3 = new javax.swing.JSeparator();
        BotonGuardar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Text6 = new javax.swing.JLabel();
        Text7 = new javax.swing.JLabel();
        Text16 = new javax.swing.JLabel();
        precioTxT = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        estadoComboBox = new javax.swing.JComboBox<>();
        Text8 = new javax.swing.JLabel();
        precioTxT1 = new javax.swing.JTextField();
        jSeparator18 = new javax.swing.JSeparator();
        precioTxT2 = new javax.swing.JTextField();
        jSeparator19 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDireccion = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDescripcion = new javax.swing.JTable();
        Text9 = new javax.swing.JLabel();
        Text10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Nuevo Bien Inmueble");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 330, -1));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 10, 200));

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
        jLabel1.setText("Subir");
        BotonGuardar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 30));

        add(BotonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 180, 50));

        Text6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text6.setText("Estado del Bien Inmueble");
        add(Text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, -1, -1));

        Text7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text7.setText("Descripcion");
        add(Text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 90, -1));

        Text16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text16.setText("Precio");
        add(Text16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, -1));

        precioTxT.setForeground(new java.awt.Color(102, 102, 102));
        precioTxT.setText("Ingrese ID descripcion");
        precioTxT.setBorder(null);
        precioTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                precioTxTMousePressed(evt);
            }
        });
        add(precioTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 260, 30));

        jSeparator17.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator17.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 260, 10));

        estadoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Disponible", "Vendido" }));
        add(estadoComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 260, 30));

        Text8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text8.setText("TABLA DE DIRECCIÓN");
        add(Text8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 170, -1));

        precioTxT1.setForeground(new java.awt.Color(102, 102, 102));
        precioTxT1.setText("Ingrese el precio");
        precioTxT1.setBorder(null);
        precioTxT1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                precioTxT1MousePressed(evt);
            }
        });
        add(precioTxT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 260, 30));

        jSeparator18.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator18.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 260, 10));

        precioTxT2.setForeground(new java.awt.Color(102, 102, 102));
        precioTxT2.setText("Ingrese ID direccion");
        precioTxT2.setBorder(null);
        precioTxT2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                precioTxT2MousePressed(evt);
            }
        });
        add(precioTxT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 260, 30));

        jSeparator19.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator19.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 260, 10));

        tblDireccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblDireccion);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 300, 100));

        tblDescripcion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblDescripcion);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 300, 100));

        Text9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text9.setText("Dirección");
        add(Text9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 70, -1));

        Text10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text10.setText("TABLA DE DESCRIPCIÓN");
        add(Text10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 170, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BotonGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMouseEntered
        setColor(BotonGuardar);
    }//GEN-LAST:event_BotonGuardarMouseEntered

    private void BotonGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMouseExited
        resetColor(BotonGuardar);
    }//GEN-LAST:event_BotonGuardarMouseExited

    // SUBIR
    private void BotonGuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMousePressed

    }//GEN-LAST:event_BotonGuardarMousePressed

    private void precioTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_precioTxTMousePressed

    }//GEN-LAST:event_precioTxTMousePressed

    private void precioTxT1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_precioTxT1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioTxT1MousePressed

    private void precioTxT2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_precioTxT2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioTxT2MousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonGuardar;
    private javax.swing.JLabel Text10;
    private javax.swing.JLabel Text16;
    private javax.swing.JLabel Text6;
    private javax.swing.JLabel Text7;
    private javax.swing.JLabel Text8;
    private javax.swing.JLabel Text9;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel body;
    private javax.swing.JComboBox<String> estadoComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField precioTxT;
    private javax.swing.JTextField precioTxT1;
    private javax.swing.JTextField precioTxT2;
    private javax.swing.JTable tblDescripcion;
    private javax.swing.JTable tblDireccion;
    // End of variables declaration//GEN-END:variables
}
