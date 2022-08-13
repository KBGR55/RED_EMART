/**
 *
 * @author  KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
package vista;

import controlador.DespachadorController.RegistrarClientes;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelNuevoCliente extends javax.swing.JPanel {

    private boolean edit;
    RegistrarClientes cliente = new RegistrarClientes();

    public PanelNuevoCliente() {
        initComponents();
        edit = false;
    }

    public PanelNuevoCliente(Boolean edit) {
        initComponents();
        this.edit = edit;
        jLabel1.setText(" Editar ");
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
        jPanel1 = new javax.swing.JPanel();
        body1 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        BotonGuardar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Text3 = new javax.swing.JLabel();
        NombreTxT = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Text7 = new javax.swing.JLabel();
        TelefonoTxT = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        Text15 = new javax.swing.JLabel();
        Text16 = new javax.swing.JLabel();
        ApellidoTxT = new javax.swing.JTextField();
        datosjlabel = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        Text4 = new javax.swing.JLabel();
        IndentificacionTxt = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        TitleUserTxT1 = new javax.swing.JLabel();
        Text8 = new javax.swing.JLabel();
        TipoIdentificacionComboBox = new javax.swing.JComboBox<>();
        jSeparator19 = new javax.swing.JSeparator();
        DateFecha = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(750, 430));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 430));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body1.setBackground(new java.awt.Color(255, 255, 255));
        body1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(body1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 10, 180));

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
        jLabel1.setText("Subir");
        BotonGuardar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 30));

        jPanel1.add(BotonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 200, 50));

        Text3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text3.setText("Nombre");
        jPanel1.add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        NombreTxT.setForeground(new java.awt.Color(102, 102, 102));
        NombreTxT.setText("Ingresar Nombre");
        NombreTxT.setBorder(null);
        NombreTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NombreTxTMousePressed(evt);
            }
        });
        jPanel1.add(NombreTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 260, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator4.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 260, 10));

        Text7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text7.setText("Nro. telefono");
        jPanel1.add(Text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 110, -1));

        TelefonoTxT.setForeground(new java.awt.Color(102, 102, 102));
        TelefonoTxT.setText("Ingrese una numero de telefono");
        TelefonoTxT.setBorder(null);
        TelefonoTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TelefonoTxTMousePressed(evt);
            }
        });
        jPanel1.add(TelefonoTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 260, 30));

        jSeparator8.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator8.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 260, 10));

        jSeparator16.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator16.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 260, 10));

        Text15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text15.setText("Fecha nacimiento");
        jPanel1.add(Text15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 140, -1));

        Text16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text16.setText("Apellido");
        jPanel1.add(Text16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        ApellidoTxT.setForeground(new java.awt.Color(102, 102, 102));
        ApellidoTxT.setText("Ingresar Apellido");
        ApellidoTxT.setBorder(null);
        ApellidoTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ApellidoTxTMousePressed(evt);
            }
        });
        jPanel1.add(ApellidoTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 260, 30));

        datosjlabel.setText("Datos informativos del Cliente");
        jPanel1.add(datosjlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 330, 20));

        jSeparator18.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator18.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 260, 10));

        Text4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text4.setText("Identificacion");
        jPanel1.add(Text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        IndentificacionTxt.setForeground(new java.awt.Color(102, 102, 102));
        IndentificacionTxt.setText("Ingresar Identificacion");
        IndentificacionTxt.setBorder(null);
        IndentificacionTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IndentificacionTxtMousePressed(evt);
            }
        });
        jPanel1.add(IndentificacionTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 260, 30));

        jSeparator5.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator5.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 260, 10));

        TitleUserTxT1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TitleUserTxT1.setText("Nuevo Cliente");
        jPanel1.add(TitleUserTxT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 190, -1));

        Text8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text8.setText("Tipo Idenficacion");
        jPanel1.add(Text8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 150, -1));

        TipoIdentificacionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "CEDULA", "PASAPORTE", "RUC", "VISA" }));
        jPanel1.add(TipoIdentificacionComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 260, 30));

        jSeparator19.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator19.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 260, 10));

        DateFecha.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(DateFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 260, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void BotonGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMouseEntered
        setColor(BotonGuardar);
    }//GEN-LAST:event_BotonGuardarMouseEntered

    private void BotonGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMouseExited
        resetColor(BotonGuardar);
    }//GEN-LAST:event_BotonGuardarMouseExited

    private void BotonGuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMousePressed

    }//GEN-LAST:event_BotonGuardarMousePressed

    private void TelefonoTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelefonoTxTMousePressed

    }//GEN-LAST:event_TelefonoTxTMousePressed

    private void ApellidoTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApellidoTxTMousePressed

    }//GEN-LAST:event_ApellidoTxTMousePressed

    private void NombreTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreTxTMousePressed

    }//GEN-LAST:event_NombreTxTMousePressed

    private void IndentificacionTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IndentificacionTxtMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_IndentificacionTxtMousePressed

    private void BotonGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMouseClicked
        registro();        
    }//GEN-LAST:event_BotonGuardarMouseClicked

    private void registro(){
        if (NombreTxT.getText().isEmpty() || ApellidoTxT.getText().isEmpty() || IndentificacionTxt.getText().isEmpty()
                || TelefonoTxT.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Datos incompletos");
        } else {
            try {
                if (cliente.registrarCliente(NombreTxT.getText(), ApellidoTxT.getText(), IndentificacionTxt.getText(), tipo_identificacion(), DateFecha.getDate(), TelefonoTxT.getText()) == true) {
                    JOptionPane.showMessageDialog(null, "Cliente registrado con éxito");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo registrar cliente");
                }
            } catch (Exception ex) {
                System.out.println("ERROR EN INGRESO CLIENTE: " + ex);
            }
        }
    }
    private String tipo_identificacion(){
        int seleccion = TipoIdentificacionComboBox.getSelectedIndex();
        String clave="";
        switch (seleccion) {
            case 1:
                clave = "TI_C";
                break;
            case 2:
                clave = "TI_P";
                break;
            case 3:
                clave = "TI_R";
                break;
            case 4:
                clave = "TI_V";
                break;
            default:
                JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna opcion");
        }
        return clave;
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoTxT;
    private javax.swing.JPanel BotonGuardar;
    private com.toedter.calendar.JDateChooser DateFecha;
    private javax.swing.JTextField IndentificacionTxt;
    private javax.swing.JTextField NombreTxT;
    private javax.swing.JTextField TelefonoTxT;
    private javax.swing.JLabel Text15;
    private javax.swing.JLabel Text16;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text4;
    private javax.swing.JLabel Text7;
    private javax.swing.JLabel Text8;
    private javax.swing.JComboBox<String> TipoIdentificacionComboBox;
    private javax.swing.JLabel TitleUserTxT1;
    private javax.swing.JPanel body;
    private javax.swing.JPanel body1;
    private javax.swing.JLabel datosjlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator8;
    // End of variables declaration//GEN-END:variables
}
