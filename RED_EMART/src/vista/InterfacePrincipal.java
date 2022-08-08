/**
 *
 * @author  KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;
import javax.swing.ImageIcon;

import javax.swing.JPanel;

public class InterfacePrincipal extends javax.swing.JFrame {

    private int xMouse, yMouse;
    private Boolean permiso;
    private String nameUser, rol;

    public InterfacePrincipal() {
        initComponents();
        //EXAMPLE PERMISO
        this.nameUser = "Example";
        this.rol = "Despachador";
        permiso = true;
        verSubtareas();
        setLocationRelativeTo(null);
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", " ;Septiembre", "Octubre", "Noviembre", "Diciemrbre"};
        fecha.setText("Hoy es " + dia + " de " + meses[month - 1] + " del " + year);
        PanelPrincipal p1 = new PanelPrincipal(nameUser);
        mostrarContenido(p1);

    }

    public InterfacePrincipal(Boolean permiso, String nameUser, String rol) {
        initComponents();
        this.nameUser = nameUser;
        this.permiso = permiso;
        this.rol = rol;
        verSubtareas();
        setLocationRelativeTo(null);
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", " ;Septiembre", "Octubre", "Noviembre", "Diciemrbre"};
        fecha.setText("Hoy es " + dia + " de " + meses[month - 1] + " del " + year);
        PanelPrincipal p1 = new PanelPrincipal(nameUser);
        mostrarContenido(p1);

    }

    private void verSubtareas(String rol) {
        ImageIcon icon;

        verSubtareas();
        imageOption.setVisible(true);
        if (rol.equals("Admin")) {
            icon = new ImageIcon("src/vista/imagenes/account-multiple.png");

            SubTarea1Bttn.setVisible(true);
            subTarea1TxT.setText("Datos informativos");
            icon1TxT.setIcon(icon);
            icon = new ImageIcon("src/vista/imagenes/lista.png");
            SubTarea2Bttn.setVisible(true);
            subTarea2TxT.setText("Lista Empleados");
            icon2TxT.setIcon(icon);
        } else if (rol.equals("Despachador")) {
            icon = new ImageIcon("src/vista/imagenes/lista.png");
            SubTarea1Bttn.setVisible(true);
            subTarea1TxT.setText("Lista Clientes");
            icon1TxT.setIcon(icon);
            icon = new ImageIcon("src/vista/imagenes/venta.png");
            SubTarea2Bttn.setVisible(true);
            subTarea2TxT.setText("Realizar Venta");
            icon2TxT.setIcon(icon);
            icon = new ImageIcon("src/vista/imagenes/lista.png");
            SubTarea3Bttn.setVisible(true);
            subTarea3TxT.setText("Lista Ventas");
            icon3TxT.setIcon(icon);
            icon = new ImageIcon("src/vista/imagenes/saldo.png");
            SubTarea4Bttn.setVisible(true);
            subTarea4TxT.setText("Saldo Actual");
            icon4TxT.setIcon(icon);
        } else if (rol.equals("Captador")) {
            icon = new ImageIcon("src/vista/imagenes/saldo.png");
            SubTarea1Bttn.setVisible(true);
            subTarea1TxT.setText("Saldo Actual");
            icon1TxT.setIcon(icon);

        }
    }

    private void verSubtareas() {
        imageOption.setVisible(false);
        SubTarea1Bttn.setVisible(false);
        SubTarea2Bttn.setVisible(false);
        SubTarea3Bttn.setVisible(false);
        SubTarea4Bttn.setVisible(false);
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

        Background = new javax.swing.JPanel();
        Menu1 = new javax.swing.JPanel();
        TareasBttn = new javax.swing.JPanel();
        PrincipalName2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        imageOption = new javax.swing.JLabel();
        SubTarea2Bttn = new javax.swing.JPanel();
        subTarea2TxT = new javax.swing.JLabel();
        icon2TxT = new javax.swing.JLabel();
        SubTarea1Bttn = new javax.swing.JPanel();
        subTarea1TxT = new javax.swing.JLabel();
        icon1TxT = new javax.swing.JLabel();
        SubTarea4Bttn = new javax.swing.JPanel();
        subTarea4TxT = new javax.swing.JLabel();
        icon4TxT = new javax.swing.JLabel();
        SubTarea3Bttn = new javax.swing.JPanel();
        subTarea3TxT = new javax.swing.JLabel();
        icon3TxT = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        app_name1 = new javax.swing.JLabel();
        PrincipalBtn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PrincipalName = new javax.swing.JLabel();
        inmueblesBttn = new javax.swing.JPanel();
        PrincipalName1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        Title = new javax.swing.JPanel();
        SalirBtn = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        slogan = new javax.swing.JLabel();
        Panelcontenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu1.setBackground(new java.awt.Color(6, 24, 60));
        Menu1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TareasBttn.setBackground(new java.awt.Color(5, 23, 58));
        TareasBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TareasBttnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TareasBttnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TareasBttnMousePressed(evt);
            }
        });
        TareasBttn.setLayout(null);

        PrincipalName2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        PrincipalName2.setForeground(new java.awt.Color(255, 255, 255));
        PrincipalName2.setText("Tareas");
        TareasBttn.add(PrincipalName2);
        PrincipalName2.setBounds(60, 20, 60, 30);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/configimage.png"))); // NOI18N
        TareasBttn.add(jLabel11);
        jLabel11.setBounds(20, 20, 30, 30);

        imageOption.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/optionwork.png"))); // NOI18N
        TareasBttn.add(imageOption);
        imageOption.setBounds(220, 20, 40, 30);

        Menu1.add(TareasBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 70));

        SubTarea2Bttn.setBackground(new java.awt.Color(5, 23, 58));
        SubTarea2Bttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SubTarea2BttnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SubTarea2BttnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SubTarea2BttnMousePressed(evt);
            }
        });
        SubTarea2Bttn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subTarea2TxT.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        subTarea2TxT.setForeground(new java.awt.Color(255, 255, 255));
        subTarea2TxT.setText("SubTarea2");
        SubTarea2Bttn.add(subTarea2TxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 180, 30));

        icon2TxT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon2TxT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/configimage.png"))); // NOI18N
        SubTarea2Bttn.add(icon2TxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        Menu1.add(SubTarea2Bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 270, 40));

        SubTarea1Bttn.setBackground(new java.awt.Color(5, 23, 58));
        SubTarea1Bttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SubTarea1BttnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SubTarea1BttnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SubTarea1BttnMousePressed(evt);
            }
        });
        SubTarea1Bttn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subTarea1TxT.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        subTarea1TxT.setForeground(new java.awt.Color(255, 255, 255));
        subTarea1TxT.setText("SubTarea1");
        SubTarea1Bttn.add(subTarea1TxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 190, 30));

        icon1TxT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon1TxT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/configimage.png"))); // NOI18N
        SubTarea1Bttn.add(icon1TxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        Menu1.add(SubTarea1Bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 270, 40));

        SubTarea4Bttn.setBackground(new java.awt.Color(5, 23, 58));
        SubTarea4Bttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SubTarea4BttnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SubTarea4BttnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SubTarea4BttnMousePressed(evt);
            }
        });
        SubTarea4Bttn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subTarea4TxT.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        subTarea4TxT.setForeground(new java.awt.Color(255, 255, 255));
        subTarea4TxT.setText("SubTarea4");
        SubTarea4Bttn.add(subTarea4TxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 190, 30));

        icon4TxT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon4TxT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/configimage.png"))); // NOI18N
        SubTarea4Bttn.add(icon4TxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        Menu1.add(SubTarea4Bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 270, 40));

        SubTarea3Bttn.setBackground(new java.awt.Color(5, 23, 58));
        SubTarea3Bttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SubTarea3BttnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SubTarea3BttnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SubTarea3BttnMousePressed(evt);
            }
        });
        SubTarea3Bttn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subTarea3TxT.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        subTarea3TxT.setForeground(new java.awt.Color(255, 255, 255));
        subTarea3TxT.setText("SubTarea3");
        SubTarea3Bttn.add(subTarea3TxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 190, 30));

        icon3TxT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon3TxT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/configimage.png"))); // NOI18N
        SubTarea3Bttn.add(icon3TxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        Menu1.add(SubTarea3Bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 270, 40));

        Background.add(Menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 270, 240));

        Menu.setBackground(new java.awt.Color(6, 24, 60));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 5));
        Menu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 190, 20));

        app_name1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        app_name1.setForeground(new java.awt.Color(255, 255, 255));
        app_name1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        app_name1.setText("RED - EMART");
        Menu.add(app_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 180, -1));

        PrincipalBtn.setBackground(new java.awt.Color(5, 23, 58));
        PrincipalBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PrincipalBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PrincipalBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PrincipalBtnMousePressed(evt);
            }
        });
        PrincipalBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/home-outline.png"))); // NOI18N
        PrincipalBtn.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, 30));

        PrincipalName.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        PrincipalName.setForeground(new java.awt.Color(255, 255, 255));
        PrincipalName.setText("Principal");
        PrincipalBtn.add(PrincipalName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 100, 30));

        Menu.add(PrincipalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 270, 70));

        inmueblesBttn.setBackground(new java.awt.Color(5, 23, 58));
        inmueblesBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inmueblesBttnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inmueblesBttnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inmueblesBttnMousePressed(evt);
            }
        });
        inmueblesBttn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PrincipalName1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        PrincipalName1.setForeground(new java.awt.Color(255, 255, 255));
        PrincipalName1.setText(" Lista Inmuebles");
        inmueblesBttn.add(PrincipalName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 190, 30));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/inmueble.png"))); // NOI18N
        inmueblesBttn.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, 30));

        Menu.add(inmueblesBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 270, 70));

        Background.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 640));

        Header.setBackground(new java.awt.Color(153, 153, 153));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("COMPRA/ VENTA/ ARRIENDO/ ADMINISTRACIÓN INMUEBLES");
        Header.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 39, 510, 30));

        fecha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setText("Fecha Actual");
        Header.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 87, -1, 30));

        Background.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 750, 150));

        Title.setBackground(new java.awt.Color(255, 255, 255));
        Title.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TitleMouseDragged(evt);
            }
        });
        Title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TitleMousePressed(evt);
            }
        });

        SalirBtn.setBackground(new java.awt.Color(255, 255, 255));
        SalirBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SalirBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalirBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SalirBtnMousePressed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        exit.setForeground(new java.awt.Color(102, 102, 102));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("Cerrar Sesión");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });

        javax.swing.GroupLayout SalirBtnLayout = new javax.swing.GroupLayout(SalirBtn);
        SalirBtn.setLayout(SalirBtnLayout);
        SalirBtnLayout.setHorizontalGroup(
            SalirBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SalirBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SalirBtnLayout.setVerticalGroup(
            SalirBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SalirBtnLayout.createSequentialGroup()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout TitleLayout = new javax.swing.GroupLayout(Title);
        Title.setLayout(TitleLayout);
        TitleLayout.setHorizontalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitleLayout.createSequentialGroup()
                .addGap(0, 871, Short.MAX_VALUE)
                .addComponent(SalirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        TitleLayout.setVerticalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SalirBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Background.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, -1));

        slogan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        slogan.setText("Autores: KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19");
        Background.add(slogan, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 690, 30));

        Panelcontenido.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelcontenidoLayout = new javax.swing.GroupLayout(Panelcontenido);
        Panelcontenido.setLayout(PanelcontenidoLayout);
        PanelcontenidoLayout.setHorizontalGroup(
            PanelcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        PanelcontenidoLayout.setVerticalGroup(
            PanelcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        Background.add(Panelcontenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 750, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TitleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_TitleMousePressed

    private void TitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_TitleMouseDragged

    private void SalirBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirBtnMousePressed
        System.exit(0);
    }//GEN-LAST:event_SalirBtnMousePressed

    private void SalirBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirBtnMouseExited
        SalirBtn.setBackground(new Color(255, 255, 255));
        exit.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_SalirBtnMouseExited

    private void SalirBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirBtnMouseEntered
        SalirBtn.setBackground(new Color(204, 0, 0));
        exit.setForeground(Color.white);
    }//GEN-LAST:event_SalirBtnMouseEntered

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        System.exit(0);
    }//GEN-LAST:event_exitMousePressed

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        SalirBtn.setBackground(new Color(255, 255, 255));
        exit.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_exitMouseExited

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        SalirBtn.setBackground(new Color(204, 0, 0));
        exit.setForeground(Color.white);
    }//GEN-LAST:event_exitMouseEntered

    private void PrincipalBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrincipalBtnMouseEntered
        setColor(PrincipalBtn);
    }//GEN-LAST:event_PrincipalBtnMouseEntered

    private void PrincipalBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrincipalBtnMouseExited
        resetColor(PrincipalBtn);
    }//GEN-LAST:event_PrincipalBtnMouseExited

    private void inmueblesBttnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inmueblesBttnMouseEntered
        setColor(inmueblesBttn);
    }//GEN-LAST:event_inmueblesBttnMouseEntered

    private void inmueblesBttnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inmueblesBttnMouseExited
        resetColor(inmueblesBttn);
    }//GEN-LAST:event_inmueblesBttnMouseExited

    private void TareasBttnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TareasBttnMouseEntered
        setColor(TareasBttn);

        verSubtareas(rol);
    }//GEN-LAST:event_TareasBttnMouseEntered

    private void TareasBttnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TareasBttnMouseExited
        resetColor(TareasBttn);

    }//GEN-LAST:event_TareasBttnMouseExited

    private void PrincipalBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrincipalBtnMousePressed
        PanelPrincipal p2 = new PanelPrincipal(nameUser);
        mostrarContenido(p2);
    }//GEN-LAST:event_PrincipalBtnMousePressed

    private void inmueblesBttnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inmueblesBttnMousePressed
        PanelBienesInmuebles pbi = new PanelBienesInmuebles();
        mostrarContenido(pbi);
    }//GEN-LAST:event_inmueblesBttnMousePressed

    private void TareasBttnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TareasBttnMousePressed

        if (evt.getClickCount() == 2) {
            verSubtareas();

        } else {
            PanelTareas pcA = new PanelTareas(rol);
            mostrarContenido(pcA);
        }

    }//GEN-LAST:event_TareasBttnMousePressed

    private void SubTarea1BttnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubTarea1BttnMouseEntered
        setColor(SubTarea1Bttn);
    }//GEN-LAST:event_SubTarea1BttnMouseEntered

    private void SubTarea1BttnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubTarea1BttnMouseExited
        resetColor(SubTarea1Bttn);
    }//GEN-LAST:event_SubTarea1BttnMouseExited

    private void SubTarea1BttnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubTarea1BttnMousePressed
        if (rol.equals("Admin")) {
            PanelModificarCeo pna = new PanelModificarCeo();
            mostrarContenido(pna);
        } else if (rol.equals("Despachador")) {
            PanelClientes pC = new PanelClientes();
            mostrarContenido(pC);
        } else if (rol.equals("Captador")) {
            PanelSaldo pS = new PanelSaldo();
            mostrarContenido(pS);

        }
    }//GEN-LAST:event_SubTarea1BttnMousePressed

    private void SubTarea2BttnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubTarea2BttnMouseEntered
        setColor(SubTarea2Bttn);
    }//GEN-LAST:event_SubTarea2BttnMouseEntered

    private void SubTarea2BttnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubTarea2BttnMouseExited
        resetColor(SubTarea2Bttn);
    }//GEN-LAST:event_SubTarea2BttnMouseExited

    private void SubTarea2BttnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubTarea2BttnMousePressed
        if (rol.equals("Admin")) {
            PanelEmpleados pEM = new PanelEmpleados();
            mostrarContenido(pEM);
        } else if (rol.equals("Despachador")) {
            PanelServicio pS = new PanelServicio();
            mostrarContenido(pS);
        }
    }//GEN-LAST:event_SubTarea2BttnMousePressed

    private void SubTarea3BttnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubTarea3BttnMouseEntered
        setColor(SubTarea3Bttn);
    }//GEN-LAST:event_SubTarea3BttnMouseEntered

    private void SubTarea3BttnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubTarea3BttnMouseExited
        resetColor(SubTarea3Bttn);
    }//GEN-LAST:event_SubTarea3BttnMouseExited

    private void SubTarea3BttnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubTarea3BttnMousePressed
        if (rol.equals("Despachador")) {

        }
    }//GEN-LAST:event_SubTarea3BttnMousePressed

    private void SubTarea4BttnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubTarea4BttnMouseEntered
        setColor(SubTarea4Bttn);
    }//GEN-LAST:event_SubTarea4BttnMouseEntered

    private void SubTarea4BttnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubTarea4BttnMouseExited
        resetColor(SubTarea4Bttn);
    }//GEN-LAST:event_SubTarea4BttnMouseExited

    private void SubTarea4BttnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubTarea4BttnMousePressed
        if (rol.equals("Despachador")) {
            PanelSaldo pS = new PanelSaldo();
            mostrarContenido(pS);
        }
    }//GEN-LAST:event_SubTarea4BttnMousePressed
    private void setColor(JPanel p) {
        p.setBackground(new Color(153, 153, 153));
    }

    private void resetColor(JPanel p) {
        p.setBackground(new Color(6, 24, 60));
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new InterfacePrincipal().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Menu1;
    public static javax.swing.JPanel Panelcontenido;
    private javax.swing.JPanel PrincipalBtn;
    private javax.swing.JLabel PrincipalName;
    private javax.swing.JLabel PrincipalName1;
    private javax.swing.JLabel PrincipalName2;
    private javax.swing.JPanel SalirBtn;
    private javax.swing.JPanel SubTarea1Bttn;
    private javax.swing.JPanel SubTarea2Bttn;
    private javax.swing.JPanel SubTarea3Bttn;
    private javax.swing.JPanel SubTarea4Bttn;
    private javax.swing.JPanel TareasBttn;
    private javax.swing.JPanel Title;
    private javax.swing.JLabel app_name1;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel icon1TxT;
    private javax.swing.JLabel icon2TxT;
    private javax.swing.JLabel icon3TxT;
    private javax.swing.JLabel icon4TxT;
    private javax.swing.JLabel imageOption;
    private javax.swing.JPanel inmueblesBttn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel slogan;
    private javax.swing.JLabel subTarea1TxT;
    private javax.swing.JLabel subTarea2TxT;
    private javax.swing.JLabel subTarea3TxT;
    private javax.swing.JLabel subTarea4TxT;
    // End of variables declaration//GEN-END:variables
}
