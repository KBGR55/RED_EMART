/**
 * @Author: Adrián Hernández  || 2A || POO
 * TRABAJO FINAL DE ASIGNATURA|| SISTEMA DE GESTION DE INVENTARIO
 */
package vista;
import java.awt.Color;

import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    private int xMouse, yMouse;
    private InterfacePrincipal nuevaVentana;
    
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoIngresarContraseña = new javax.swing.JPanel();
        IngresarPanel = new javax.swing.JPanel();
        LogoUnl = new javax.swing.JLabel();
        IngresarTXT = new javax.swing.JLabel();
        IngresarUsuarioTxT = new javax.swing.JLabel();
        IngresarContraseñaTxT = new javax.swing.JLabel();
        CajaPassword = new javax.swing.JPasswordField();
        CajaUsuario = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        EntrarBtn = new javax.swing.JPanel();
        EntrarTxT = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        CerrarBtn = new javax.swing.JPanel();
        CerrarTxT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Facturacion.exe");
        setUndecorated(true);
        setResizable(false);

        FondoIngresarContraseña.setBackground(new java.awt.Color(255, 255, 255));
        FondoIngresarContraseña.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IngresarPanel.setBackground(new java.awt.Color(255, 255, 255));
        IngresarPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        IngresarPanel.setPreferredSize(new java.awt.Dimension(400, 360));
        IngresarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoUnl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/UNL3.jpg"))); // NOI18N
        IngresarPanel.add(LogoUnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 15, 90, 90));

        IngresarTXT.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        IngresarTXT.setText("INGRESAR SISTEMA");
        IngresarPanel.add(IngresarTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 67, 230, -1));

        IngresarUsuarioTxT.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        IngresarUsuarioTxT.setText("USUARIO");
        IngresarPanel.add(IngresarUsuarioTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 114, 90, 30));

        IngresarContraseñaTxT.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        IngresarContraseñaTxT.setText("CONTRASEÑA");
        IngresarPanel.add(IngresarContraseñaTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 201, -1, -1));

        CajaPassword.setForeground(new java.awt.Color(204, 204, 204));
        CajaPassword.setText("EJEMPLOCONTRASEÑA");
        CajaPassword.setBorder(null);
        CajaPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CajaPasswordMouseClicked(evt);
            }
        });
        IngresarPanel.add(CajaPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 229, 330, -1));

        CajaUsuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CajaUsuario.setForeground(new java.awt.Color(204, 204, 204));
        CajaUsuario.setText("Ingrese su usuario");
        CajaUsuario.setBorder(null);
        CajaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CajaUsuarioMouseClicked(evt);
            }
        });
        IngresarPanel.add(CajaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 150, 330, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        IngresarPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 248, 330, 20));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        IngresarPanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 170, 330, 10));

        EntrarBtn.setBackground(new java.awt.Color(153, 153, 153));

        EntrarTxT.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        EntrarTxT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EntrarTxT.setText("ENTRAR");
        EntrarTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EntrarTxTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EntrarTxTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EntrarTxTMouseExited(evt);
            }
        });

        javax.swing.GroupLayout EntrarBtnLayout = new javax.swing.GroupLayout(EntrarBtn);
        EntrarBtn.setLayout(EntrarBtnLayout);
        EntrarBtnLayout.setHorizontalGroup(
            EntrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EntrarTxT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        EntrarBtnLayout.setVerticalGroup(
            EntrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EntrarTxT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        IngresarPanel.add(EntrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 335, -1, -1));

        FondoIngresarContraseña.add(IngresarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 410));

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderMouseDragged(evt);
            }
        });
        Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderMousePressed(evt);
            }
        });

        CerrarBtn.setBackground(new java.awt.Color(255, 255, 255));

        CerrarTxT.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        CerrarTxT.setText("   X");
        CerrarTxT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CerrarTxT.setPreferredSize(new java.awt.Dimension(50, 50));
        CerrarTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarTxTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CerrarTxTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CerrarTxTMouseExited(evt);
            }
        });

        javax.swing.GroupLayout CerrarBtnLayout = new javax.swing.GroupLayout(CerrarBtn);
        CerrarBtn.setLayout(CerrarBtnLayout);
        CerrarBtnLayout.setHorizontalGroup(
            CerrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CerrarTxT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CerrarBtnLayout.setVerticalGroup(
            CerrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CerrarTxT, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(0, 340, Short.MAX_VALUE)
                .addComponent(CerrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CerrarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        FondoIngresarContraseña.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 390, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(FondoIngresarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(FondoIngresarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x- xMouse, y- yMouse);
    }//GEN-LAST:event_HeaderMouseDragged

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void CerrarTxTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarTxTMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CerrarTxTMouseClicked

    private void CerrarTxTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarTxTMouseEntered
        CerrarBtn.setBackground(Color.red);
        CerrarTxT.setForeground(Color.white);
    }//GEN-LAST:event_CerrarTxTMouseEntered

    private void CerrarTxTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarTxTMouseExited
        CerrarBtn.setBackground(Color.white);
        CerrarTxT.setForeground(Color.black);
    }//GEN-LAST:event_CerrarTxTMouseExited

    private void CajaPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajaPasswordMouseClicked
        if (String.valueOf(CajaPassword.getPassword()).equals("EJEMPLOCONTRASEÑA")) {
            CajaPassword.setText("");
            CajaPassword.setForeground(Color.black);
        }
        if (CajaUsuario.getText().isEmpty()) {
            CajaUsuario.setText("Ingrese su usuario");
            CajaUsuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_CajaPasswordMouseClicked

    private void CajaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajaUsuarioMouseClicked
        if (CajaUsuario.getText().equals("Ingrese su usuario")) {
            CajaUsuario.setText("");
            CajaUsuario.setForeground(Color.black);
        }
        if (String.valueOf(CajaPassword.getPassword()).isEmpty()) {
            CajaPassword.setText("EJEMPLOCONTRASEÑA");
            CajaPassword.setForeground(Color.gray);
        }
    }//GEN-LAST:event_CajaUsuarioMouseClicked

    private void EntrarTxTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarTxTMouseClicked
        String nameExample = CajaUsuario.getText();
        String passExample = String.valueOf(CajaPassword.getPassword());
        if(nameExample.equals("Admin") && passExample.equals("admin")){
            nuevaVentana = new InterfacePrincipal(Boolean.TRUE, nameExample);
            nuevaVentana.setVisible(true);
            this.dispose();
        }else if (nameExample.equals("Hilary") && passExample.equals("123")) {
            nuevaVentana = new InterfacePrincipal(Boolean.FALSE, nameExample);
            nuevaVentana.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(IngresarPanel, "Usuario y/o Contrasena incorrectos");
            CajaUsuario.setText("");
            CajaPassword.setText(""); 
        }
        
    }//GEN-LAST:event_EntrarTxTMouseClicked

    private void EntrarTxTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarTxTMouseEntered
        EntrarBtn.setBackground(Color.darkGray);
        EntrarTxT.setForeground(Color.white);
    }//GEN-LAST:event_EntrarTxTMouseEntered

    private void EntrarTxTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarTxTMouseExited
        EntrarBtn.setBackground(Color.gray);
        EntrarTxT.setForeground(Color.black);
    }//GEN-LAST:event_EntrarTxTMouseExited

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CajaPassword;
    private javax.swing.JTextField CajaUsuario;
    private javax.swing.JPanel CerrarBtn;
    private javax.swing.JLabel CerrarTxT;
    private javax.swing.JPanel EntrarBtn;
    private javax.swing.JLabel EntrarTxT;
    private javax.swing.JPanel FondoIngresarContraseña;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel IngresarContraseñaTxT;
    private javax.swing.JPanel IngresarPanel;
    private javax.swing.JLabel IngresarTXT;
    private javax.swing.JLabel IngresarUsuarioTxT;
    private javax.swing.JLabel LogoUnl;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
