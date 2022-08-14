/**
 *
 * @author  KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
package vista;
import controlador.CEOController.modificarCEO;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class PanelModificarCeo extends javax.swing.JPanel {
    modificarCEO mc = new modificarCEO();
    
    public PanelModificarCeo() { 
        initComponents();
    }
    
    
    private void setColor(JPanel p) {
        p.setBackground(new Color(153,153,153));
    }

    private void resetColor(JPanel p) {
        p.setBackground(new Color(6,24,60));
    }
    
    private void modificarCEO() throws Exception{
        Integer id_ceo = 0;
        for (int i = 0; i < mc.getEd().listar().getSize(); i++) {
            if (mc.getEd().listar().obtenerDato(i).getId_tipo_emp().equals("A_C")) {
                id_ceo = mc.getEd().listar().obtenerDato(i).getId_persona();
            }
        }
        if (!NombreTxT.getText().equals("")&&!ApellidoTxT1.getText().equals("")&&!TelefonoTxT1.getText().equals("")&&!ident.getText().equals("")&&!UsuarioTxT.getText().equals("")&&!ContraseñaTxT.getText().equals("")&&!ConfirmarContraseñaTxT.getText().equals("")) {
            if (isNumeric(TelefonoTxT1.getText())) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String fechaN = jComboBox2.getSelectedItem().toString()+"/"+jComboBox3.getSelectedItem().toString()+"/"+(Integer.parseInt(jComboBox1.getSelectedItem().toString())-1000);
            Date fn = sdf.parse(fechaN);
            mc.modificarCEO(id_ceo, "EE_A", UsuarioTxT.getText(), ContraseñaTxT.getText(), NombreTxT.getText(), ApellidoTxT1.getText(), IdentificacionTxT.getText(), "TI_C", fn, TelefonoTxT1.getText());
            }else{
                JOptionPane.showMessageDialog(null, "Ingrese Telefono Valido");
            }           
        }else{
            JOptionPane.showMessageDialog(null, "Rellene todos los campos porfavor");
        }
        }
    
    private static boolean isNumeric(String cadena) {
        try {
            Double.parseDouble(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        TitleUserTxT = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        body1 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        BotonGuardar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Text3 = new javax.swing.JLabel();
        NombreTxT = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Text7 = new javax.swing.JLabel();
        ContraseñaTxT = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        Text12 = new javax.swing.JLabel();
        ConfirmarContraseñaTxT = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        UsuarioTxT = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        Text15 = new javax.swing.JLabel();
        Text16 = new javax.swing.JLabel();
        IdentificacionTxT = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        Text17 = new javax.swing.JLabel();
        ApellidoTxT1 = new javax.swing.JTextField();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        Text18 = new javax.swing.JLabel();
        TelefonoTxT1 = new javax.swing.JTextField();
        jSeparator19 = new javax.swing.JSeparator();
        ident = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TitleUserTxT1 = new javax.swing.JLabel();
        datosjlabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        TitleUserTxT.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TitleUserTxT.setText("Datos informativos del CEO");
        add(TitleUserTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 530, -1));

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
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 10, 200));

        BotonGuardar.setBackground(new java.awt.Color(4, 22, 58));
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
        jLabel1.setText("Modificar");
        BotonGuardar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 30));

        jPanel1.add(BotonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 200, 50));

        Text3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text3.setText("Nombre");
        jPanel1.add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        NombreTxT.setForeground(new java.awt.Color(102, 102, 102));
        NombreTxT.setText("Ingresar Nombre");
        NombreTxT.setBorder(null);
        NombreTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NombreTxTMousePressed(evt);
            }
        });
        jPanel1.add(NombreTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 260, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator4.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 260, 10));

        Text7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text7.setText("Contraseña");
        jPanel1.add(Text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, -1, -1));

        ContraseñaTxT.setForeground(new java.awt.Color(102, 102, 102));
        ContraseñaTxT.setText("Ingrese una contraseña");
        ContraseñaTxT.setBorder(null);
        ContraseñaTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ContraseñaTxTMousePressed(evt);
            }
        });
        jPanel1.add(ContraseñaTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 260, 30));

        jSeparator8.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator8.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 260, 10));

        Text12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text12.setText("Confirmar Contraseña");
        jPanel1.add(Text12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, -1, -1));

        ConfirmarContraseñaTxT.setForeground(new java.awt.Color(102, 102, 102));
        ConfirmarContraseñaTxT.setText("Repita la contraseña");
        ConfirmarContraseñaTxT.setBorder(null);
        ConfirmarContraseñaTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ConfirmarContraseñaTxTMousePressed(evt);
            }
        });
        jPanel1.add(ConfirmarContraseñaTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 260, 30));

        jSeparator13.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator13.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 260, 0));

        UsuarioTxT.setForeground(new java.awt.Color(102, 102, 102));
        UsuarioTxT.setText("Ingrese un nombre de usuario");
        UsuarioTxT.setBorder(null);
        UsuarioTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UsuarioTxTMousePressed(evt);
            }
        });
        jPanel1.add(UsuarioTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 260, 30));

        jSeparator16.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator16.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 260, 10));

        Text15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text15.setText("Usuario");
        jPanel1.add(Text15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, -1, -1));

        Text16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text16.setText("Fecha Nacimiento:");
        jPanel1.add(Text16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, -1, -1));

        IdentificacionTxT.setForeground(new java.awt.Color(102, 102, 102));
        IdentificacionTxT.setText("Ingresar Identificacion");
        IdentificacionTxT.setBorder(null);
        IdentificacionTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IdentificacionTxTMousePressed(evt);
            }
        });
        IdentificacionTxT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdentificacionTxTActionPerformed(evt);
            }
        });
        jPanel1.add(IdentificacionTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 260, 30));

        jSeparator17.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator17.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 260, 10));

        Text17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text17.setText("Apellido");
        jPanel1.add(Text17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        ApellidoTxT1.setForeground(new java.awt.Color(102, 102, 102));
        ApellidoTxT1.setText("Ingresar Apellido");
        ApellidoTxT1.setBorder(null);
        ApellidoTxT1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ApellidoTxT1MousePressed(evt);
            }
        });
        jPanel1.add(ApellidoTxT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 260, 30));

        jSeparator18.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator18.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 260, 10));

        jSeparator9.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator9.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 260, 10));

        Text18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text18.setText("Telefono");
        jPanel1.add(Text18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        TelefonoTxT1.setForeground(new java.awt.Color(102, 102, 102));
        TelefonoTxT1.setText("Ingresar Telefono");
        TelefonoTxT1.setBorder(null);
        TelefonoTxT1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TelefonoTxT1MousePressed(evt);
            }
        });
        TelefonoTxT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoTxT1ActionPerformed(evt);
            }
        });
        jPanel1.add(TelefonoTxT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 260, 30));

        jSeparator19.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator19.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 260, 10));

        ident.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ident.setText("Identificacion");
        jPanel1.add(ident, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 50, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 50, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 50, -1));

        jLabel2.setText("Dia:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, -1));

        jLabel3.setText("Mes:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, -1, -1));

        jLabel4.setText("Año:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 410));

        TitleUserTxT1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TitleUserTxT1.setText("Configuración");
        add(TitleUserTxT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        datosjlabel.setForeground(new java.awt.Color(0, 255, 255));
        datosjlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datosjlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/account-multiple.png"))); // NOI18N
        add(datosjlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 50, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void BotonGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMouseEntered
        setColor(BotonGuardar);
    }//GEN-LAST:event_BotonGuardarMouseEntered

    private void BotonGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMouseExited
        resetColor(BotonGuardar);
    }//GEN-LAST:event_BotonGuardarMouseExited

    private void BotonGuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMousePressed
        try {
            modificarCEO();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_BotonGuardarMousePressed

    private void ContraseñaTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContraseñaTxTMousePressed
        if(ContraseñaTxT.getText().equals("Ingrese una contraseña"))
        ContraseñaTxT.setText("");
        if(NombreTxT.getText().equals("") || NombreTxT.getText() == null || NombreTxT.getText().equals(" "))
        NombreTxT.setText("Ingresar Nombre");
        if(IdentificacionTxT.getText().equals("") || IdentificacionTxT.getText() == null || IdentificacionTxT.getText().equals(" "))
        IdentificacionTxT.setText("Ingresar Apellido");
        if(ConfirmarContraseñaTxT.getText().equals("") || ConfirmarContraseñaTxT.getText() == null || ConfirmarContraseñaTxT.getText().equals(" "))
        ConfirmarContraseñaTxT.setText("Repita la contraseña");
        if(UsuarioTxT.getText().equals("") || UsuarioTxT.getText() == null || UsuarioTxT.getText().equals(" "))
        UsuarioTxT.setText("Ingrese un nombre de usuario");

    }//GEN-LAST:event_ContraseñaTxTMousePressed

    private void ConfirmarContraseñaTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmarContraseñaTxTMousePressed
        if(ConfirmarContraseñaTxT.getText().equals("Repita la contraseña"))
        ConfirmarContraseñaTxT.setText("");
        if(NombreTxT.getText().equals("") || NombreTxT.getText() == null || NombreTxT.getText().equals(" "))
        NombreTxT.setText("Ingresar Nombre");
        if(ContraseñaTxT.getText().equals("") || ContraseñaTxT.getText() == null || ContraseñaTxT.getText().equals(" "))
        ContraseñaTxT.setText("Ingrese una contraseña");
        if(IdentificacionTxT.getText().equals("") || IdentificacionTxT.getText() == null || IdentificacionTxT.getText().equals(" "))
        IdentificacionTxT.setText("Ingresar Apellido");
        if(UsuarioTxT.getText().equals("") || UsuarioTxT.getText() == null || UsuarioTxT.getText().equals(" "))
        UsuarioTxT.setText("Ingrese un nombre de usuario");
    }//GEN-LAST:event_ConfirmarContraseñaTxTMousePressed

    private void UsuarioTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuarioTxTMousePressed
        if(UsuarioTxT.getText().equals("Ingrese un nombre de usuario"))
        UsuarioTxT.setText("");
        if(NombreTxT.getText().equals("") || NombreTxT.getText() == null || NombreTxT.getText().equals(" "))
        NombreTxT.setText("Ingresar Nombre");
        if(ContraseñaTxT.getText().equals("") || ContraseñaTxT.getText() == null || ContraseñaTxT.getText().equals(" "))
        ContraseñaTxT.setText("Ingrese una contraseña");
        if(ConfirmarContraseñaTxT.getText().equals("") || ConfirmarContraseñaTxT.getText() == null || ConfirmarContraseñaTxT.getText().equals(" "))
        ConfirmarContraseñaTxT.setText("Repita la contraseña");
        if(IdentificacionTxT.getText().equals("") || IdentificacionTxT.getText() == null || IdentificacionTxT.getText().equals(" "))
        IdentificacionTxT.setText("Ingresar Apellido");

    }//GEN-LAST:event_UsuarioTxTMousePressed

    private void IdentificacionTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IdentificacionTxTMousePressed
        if(IdentificacionTxT.getText().equals("Ingresar Apellido"))
        IdentificacionTxT.setText("");
        if(NombreTxT.getText().equals("") || NombreTxT.getText() == null || NombreTxT.getText().equals(" "))
        NombreTxT.setText("Ingresar Nombre");
        if(ContraseñaTxT.getText().equals("") || ContraseñaTxT.getText() == null || ContraseñaTxT.getText().equals(" "))
        ContraseñaTxT.setText("Ingrese una contraseña");
        if(ConfirmarContraseñaTxT.getText().equals("") || ConfirmarContraseñaTxT.getText() == null || ConfirmarContraseñaTxT.getText().equals(" "))
        ConfirmarContraseñaTxT.setText("Ingrese la descripción del Producto");
        if(UsuarioTxT.getText().equals("") || UsuarioTxT.getText() == null || UsuarioTxT.getText().equals(" "))
        UsuarioTxT.setText("Ingrese un nombre de usuario");
    }//GEN-LAST:event_IdentificacionTxTMousePressed

    private void NombreTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreTxTMousePressed
        if(NombreTxT.getText().equals("Ingresar Nombre"))
        NombreTxT.setText("");
        if(ContraseñaTxT.getText().equals("") || ContraseñaTxT.getText() == null || ContraseñaTxT.getText().equals(" "))
        ContraseñaTxT.setText("Ingrese una contraseña");
        if(IdentificacionTxT.getText().equals("") || IdentificacionTxT.getText() == null || IdentificacionTxT.getText().equals(" "))
        IdentificacionTxT.setText("Ingresar Apellido");
        if(ConfirmarContraseñaTxT.getText().equals("") || ConfirmarContraseñaTxT.getText() == null || ConfirmarContraseñaTxT.getText().equals(" "))
        ConfirmarContraseñaTxT.setText("Repita la contraseña");
        if(UsuarioTxT.getText().equals("") || UsuarioTxT.getText() == null || UsuarioTxT.getText().equals(" "))
        UsuarioTxT.setText("Ingrese un nombre de usuario");
    }//GEN-LAST:event_NombreTxTMousePressed

    private void ApellidoTxT1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApellidoTxT1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoTxT1MousePressed

    private void IdentificacionTxTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdentificacionTxTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdentificacionTxTActionPerformed

    private void TelefonoTxT1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelefonoTxT1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonoTxT1MousePressed

    private void TelefonoTxT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoTxT1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonoTxT1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoTxT1;
    private javax.swing.JPanel BotonGuardar;
    private javax.swing.JTextField ConfirmarContraseñaTxT;
    private javax.swing.JTextField ContraseñaTxT;
    private javax.swing.JTextField IdentificacionTxT;
    private javax.swing.JTextField NombreTxT;
    private javax.swing.JTextField TelefonoTxT1;
    private javax.swing.JLabel Text12;
    private javax.swing.JLabel Text15;
    private javax.swing.JLabel Text16;
    private javax.swing.JLabel Text17;
    private javax.swing.JLabel Text18;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text7;
    private javax.swing.JLabel TitleUserTxT;
    private javax.swing.JLabel TitleUserTxT1;
    private javax.swing.JTextField UsuarioTxT;
    private javax.swing.JPanel body;
    private javax.swing.JPanel body1;
    private javax.swing.JLabel datosjlabel;
    private javax.swing.JLabel ident;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
