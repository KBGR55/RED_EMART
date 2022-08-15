/**
 *
 * @author  KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
package vista;

import controlador.CaptadorController.RegistrarInmuebles;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static vista.InterfacePrincipal.Panelcontenido;

public class PanelNuevoBienInmueble extends javax.swing.JPanel {

    private boolean edition;
    String origId;
    RegistrarInmuebles registro = new RegistrarInmuebles();
    Integer bien;

    public PanelNuevoBienInmueble() {
        initComponents();
        llenarTabla();
        Text6.setVisible(false);
        estadoComboBox.setVisible(false);
        edition = false;
    }

    public PanelNuevoBienInmueble(Integer bien, String dir, String des, String precio) {
        initComponents();
        llenarTabla();
        this.edition = true;
        Title.setText("Editar Bien Inmueble");
        Text6.setVisible(true);
        Text11.setVisible(false);
        txtCedula.setVisible(false);
        jSeparator21.setVisible(false);
        estadoComboBox.setVisible(true);
        jLabel1.setText("Editar");
        direccionTxT.setText(dir);
        descripcionTxT.setText(des);
        precioTxT1.setText(precio);
        this.bien = bien;
    }

    public void limpiar() {
        txtCedula.setText("Ingresar cedula captador");
        descripcionTxT.setText("Seleccionar ID descripcion");
        direccionTxT.setText("Seleccionar ID direccion");
        precioTxT1.setText("Ingrese el precio");

    }

    public void mostrarContenido(JPanel p) {
        p.setSize(750, 430);
        p.setLocation(0, 0);
        Panelcontenido.removeAll();
        Panelcontenido.add(p, BorderLayout.CENTER);
        Panelcontenido.revalidate();
        Panelcontenido.repaint();
    }

    public void llenarTabla() {
        registro.leerDesc(tblDescripcion, registro.getDaoDes().listar());
        registro.leerDir(tblDireccion, registro.getDaoD().listar());
    }

    public void guardar() throws Exception {
        if (txtCedula.getText().equalsIgnoreCase("Ingresar cedula captador") || txtCedula.getText().trim().length() == 0 || precioTxT1.getText().trim().length() == 0 || precioTxT1.getText().equalsIgnoreCase("Ingrese el precio") || direccionTxT.getText().equalsIgnoreCase("Seleccionar ID direccion") || direccionTxT.getText().trim().length() == 0 || descripcionTxT.getText().equalsIgnoreCase("Seleccionar ID descripcion") || descripcionTxT.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Datos incompletos", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            registro.registrarInmueble(Integer.valueOf(descripcionTxT.getText()), Integer.valueOf(direccionTxT.getText()), DateFecha.getDate(), Integer.valueOf(registro.id_captador(txtCedula.getText())), Double.valueOf(precioTxT1.getText()), "EB_D");
            JOptionPane.showMessageDialog(null, "Datos ingresados correctamente");
            limpiar();
        }
    }

   public void editar() throws Exception {
        if (txtCedula.getText().trim().length() == 0 || precioTxT1.getText().trim().length() == 0 || direccionTxT.getText().trim().length() == 0 || descripcionTxT.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Datos incompletos", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            Boolean correct = false;
            int tipoBien = estadoComboBox.getSelectedIndex();
            try {
                switch (tipoBien) {
                    case 1:
                        correct = registro.modificarInmueble(bien, Integer.valueOf(descripcionTxT.getText()), Integer.valueOf(direccionTxT.getText()), DateFecha.getDate(),Double.valueOf(precioTxT1.getText()), "EE_D");
                        break;
                    case 2:
                        correct = registro.modificarInmueble(bien, Integer.valueOf(descripcionTxT.getText()),Integer.valueOf(direccionTxT.getText()),DateFecha.getDate(), Double.valueOf(precioTxT1.getText()), "EE_V");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Seleccione el estado del inmueble", "Error", JOptionPane.ERROR_MESSAGE);
                        break;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Datos erroneos", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (correct) {
                JOptionPane.showMessageDialog(null, "Datos modificados correctamente", "Modificar", JOptionPane.INFORMATION_MESSAGE);
                //limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo modificar los datos ingresados", "Modificar", JOptionPane.ERROR);
            }
        }
    }

    private void cargarVista() {
        int fila = tblDescripcion.getSelectedRow();

        if (fila <= - 1) {
            JOptionPane.showMessageDialog(null, "Escoja una fila de la tabla");
        } else {
            String id = registro.getLista()[0][fila];
            System.out.println(id);
            try {
                descripcionTxT.setText(id);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "ERROR");
            }
        }
    }

    private void cargarVista2() {
        int fila = tblDireccion.getSelectedRow();
        if (fila <= - 1) {
            JOptionPane.showMessageDialog(null, "Escoja una fila de la tabla");
        } else {
            String id = registro.getLista2()[0][fila];
            System.out.println(id);
            try {
                direccionTxT.setText(id);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "ERROR");
            }
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
        jSeparator3 = new javax.swing.JSeparator();
        BotonGuardar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Text6 = new javax.swing.JLabel();
        Text7 = new javax.swing.JLabel();
        Text16 = new javax.swing.JLabel();
        descripcionTxT = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        estadoComboBox = new javax.swing.JComboBox<>();
        Text8 = new javax.swing.JLabel();
        precioTxT1 = new javax.swing.JTextField();
        jSeparator18 = new javax.swing.JSeparator();
        direccionTxT = new javax.swing.JTextField();
        jSeparator19 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDireccion = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDescripcion = new javax.swing.JTable();
        Text9 = new javax.swing.JLabel();
        Text10 = new javax.swing.JLabel();
        Text17 = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        DateFecha = new com.toedter.calendar.JDateChooser();
        Text11 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jSeparator21 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Nuevo Bien Inmueble");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 330, -1));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 10, 320));

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
        BotonGuardar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, 30));

        add(BotonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 210, 30));

        Text6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text6.setText("Estado del Bien Inmueble");
        add(Text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, -1, -1));

        Text7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text7.setText("Descripcion");
        add(Text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 90, -1));

        Text16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text16.setText("Precio");
        add(Text16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, -1));

        descripcionTxT.setEditable(false);
        descripcionTxT.setBackground(new java.awt.Color(255, 255, 255));
        descripcionTxT.setForeground(new java.awt.Color(102, 102, 102));
        descripcionTxT.setText("Seleccionar ID descripcion");
        descripcionTxT.setBorder(null);
        descripcionTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                descripcionTxTMousePressed(evt);
            }
        });
        add(descripcionTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 260, 30));

        jSeparator17.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator17.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 260, 10));

        estadoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Disponible", "Vendido" }));
        add(estadoComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 260, 30));

        Text8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text8.setText("TABLA DE DIRECCIÓN");
        add(Text8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 170, -1));

        precioTxT1.setForeground(new java.awt.Color(102, 102, 102));
        precioTxT1.setText("Ingrese el precio");
        precioTxT1.setBorder(null);
        precioTxT1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                precioTxT1MousePressed(evt);
            }
        });
        add(precioTxT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 260, 30));

        jSeparator18.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator18.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 260, 10));

        direccionTxT.setEditable(false);
        direccionTxT.setBackground(new java.awt.Color(255, 255, 255));
        direccionTxT.setForeground(new java.awt.Color(102, 102, 102));
        direccionTxT.setText("Seleccionar ID direccion");
        direccionTxT.setBorder(null);
        direccionTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                direccionTxTMousePressed(evt);
            }
        });
        direccionTxT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionTxTActionPerformed(evt);
            }
        });
        add(direccionTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 260, 30));

        jSeparator19.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator19.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 260, 10));

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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDireccionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDireccion);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 300, 100));

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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDescripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDescripcionMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDescripcion);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 300, 100));

        Text9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text9.setText("Dirección");
        add(Text9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 70, 20));

        Text10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text10.setText("TABLA DE DESCRIPCIÓN");
        add(Text10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 170, -1));

        Text17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text17.setText("Fecha");
        add(Text17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, -1));

        jSeparator20.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator20.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 260, 10));

        DateFecha.setDateFormatString("yyyy-MM-dd");
        add(DateFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 260, 30));

        Text11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text11.setText("Cedula");
        add(Text11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 130, -1));

        txtCedula.setForeground(new java.awt.Color(102, 102, 102));
        txtCedula.setText("Ingresar cedula captador");
        txtCedula.setBorder(null);
        txtCedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCedulaMousePressed(evt);
            }
        });
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 300, 30));

        jSeparator21.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator21.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 300, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void BotonGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMouseEntered
        setColor(BotonGuardar);
    }//GEN-LAST:event_BotonGuardarMouseEntered

    private void BotonGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMouseExited
        resetColor(BotonGuardar);
    }//GEN-LAST:event_BotonGuardarMouseExited

    // SUBIR
    private void BotonGuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMousePressed
        if (this.edition == false) {
            try {
                guardar();
            } catch (Exception ex) {
                System.out.println(ex);
            }
        } else {
            try {
                editar();
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_BotonGuardarMousePressed


    private void descripcionTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descripcionTxTMousePressed

    }//GEN-LAST:event_descripcionTxTMousePressed

    private void precioTxT1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_precioTxT1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioTxT1MousePressed

    private void direccionTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_direccionTxTMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionTxTMousePressed

    private void tblDescripcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDescripcionMouseClicked
        cargarVista();
    }//GEN-LAST:event_tblDescripcionMouseClicked

    private void tblDireccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDireccionMouseClicked
        cargarVista2();
    }//GEN-LAST:event_tblDireccionMouseClicked

    private void direccionTxTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionTxTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionTxTActionPerformed

    private void txtCedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCedulaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaMousePressed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonGuardar;
    private com.toedter.calendar.JDateChooser DateFecha;
    private javax.swing.JLabel Text10;
    private javax.swing.JLabel Text11;
    private javax.swing.JLabel Text16;
    private javax.swing.JLabel Text17;
    private javax.swing.JLabel Text6;
    private javax.swing.JLabel Text7;
    private javax.swing.JLabel Text8;
    private javax.swing.JLabel Text9;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel body;
    private javax.swing.JTextField descripcionTxT;
    private javax.swing.JTextField direccionTxT;
    private javax.swing.JComboBox<String> estadoComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField precioTxT1;
    private javax.swing.JTable tblDescripcion;
    private javax.swing.JTable tblDireccion;
    private javax.swing.JTextField txtCedula;
    // End of variables declaration//GEN-END:variables
}
