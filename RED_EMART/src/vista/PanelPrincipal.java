/**
 * @Author: Adrián Hernández  || 2A || POO
 * TRABAJO FINAL DE ASIGNATURA|| SISTEMA DE GESTION DE INVENTARIO
 */
package vista;

public class PanelPrincipal extends javax.swing.JPanel {
    
    public PanelPrincipal() {
        
        initComponents();

    }
    
    String MayuscUser(String n){
        return Character.toUpperCase(n.charAt(0)) + n.substring(1);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        TitleUserTxT = new javax.swing.JLabel();
        ImageLabel = new javax.swing.JLabel();
        Text2 = new javax.swing.JLabel();
        Text3 = new javax.swing.JLabel();
        Text4 = new javax.swing.JLabel();
        Text5 = new javax.swing.JLabel();
        Text6 = new javax.swing.JLabel();
        Text7 = new javax.swing.JLabel();
        Text8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        TitleUserTxT.setBackground(new java.awt.Color(0, 0, 0));
        TitleUserTxT.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TitleUserTxT.setText("Bienvenido Usuario/Admin");
        add(TitleUserTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 450, -1));
        add(ImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 290, 170));

        Text2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text2.setText("comunidad.");
        Text2.setDoubleBuffered(true);
        add(Text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 700, 30));

        Text3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text3.setText("Acerca de nosotros...");
        Text3.setDoubleBuffered(true);
        add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 160, 20));

        Text4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text4.setText("Prestar excelentes productos y servicios en el ramo inmobiliario mediante la administración de contrato de ");
        Text4.setDoubleBuffered(true);
        add(Text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 700, 30));

        Text5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text5.setText("arrendamientos, ventas y avalúos de inmueble, contando para ello con personal competente y con tecnología");
        Text5.setDoubleBuffered(true);
        add(Text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 700, 30));

        Text6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text6.setText("que facilite y garantice una gestión efectiva y satisfactoria a los clientes., haciendo de la empresa un negocio ");
        Text6.setDoubleBuffered(true);
        add(Text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 700, 30));

        Text7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text7.setText("rentable para nuestros socios y empleados, con alto sentido de la responsabilidad social, con el estado y con la");
        Text7.setDoubleBuffered(true);
        add(Text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 700, 30));

        Text8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text8.setText("MISIÓN");
        Text8.setDoubleBuffered(true);
        add(Text8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 160, 20));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JLabel Text2;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text4;
    private javax.swing.JLabel Text5;
    private javax.swing.JLabel Text6;
    private javax.swing.JLabel Text7;
    private javax.swing.JLabel Text8;
    private javax.swing.JLabel TitleUserTxT;
    private javax.swing.JPanel body;
    // End of variables declaration//GEN-END:variables
}
