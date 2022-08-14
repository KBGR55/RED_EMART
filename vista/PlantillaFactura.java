package vista;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;

/**
 *
 * @author samaelhg
 */
public class PlantillaFactura extends javax.swing.JPanel implements Printable{

    public PlantillaFactura() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombreClienteTxT = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        telefonoClienteTxT = new javax.swing.JLabel();
        numeroFacturaTxT = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fechaEmisionTxT = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        totalTxT = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ivaTxT = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/logo.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 300, 150));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("RED EMART");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 140, 40));

        nombreClienteTxT.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nombreClienteTxT.setForeground(new java.awt.Color(0, 0, 0));
        nombreClienteTxT.setText("nombredelclienteTxT");
        add(nombreClienteTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 420, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Cliente");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 100, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Telefono");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 110, 30));

        telefonoClienteTxT.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        telefonoClienteTxT.setForeground(new java.awt.Color(0, 0, 0));
        telefonoClienteTxT.setText("telefonoClienteTxT");
        add(telefonoClienteTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 170, 30));

        numeroFacturaTxT.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        numeroFacturaTxT.setForeground(new java.awt.Color(0, 0, 0));
        numeroFacturaTxT.setText("numerodeFacturaTxT");
        add(numeroFacturaTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 330, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("NroFactura");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 100, 30));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Fecha Emisión");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 130, 30));

        fechaEmisionTxT.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        fechaEmisionTxT.setForeground(new java.awt.Color(0, 0, 0));
        fechaEmisionTxT.setText("00/00/0000fechaEmisionTxT");
        add(fechaEmisionTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 330, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "DESCRIPCION", "PRECIO", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMaxWidth(1000);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(300);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(300);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 590, 90));

        totalTxT.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        totalTxT.setForeground(new java.awt.Color(0, 0, 0));
        totalTxT.setText("totalTxT");
        add(totalTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, 140, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Total");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, 110, 30));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("IVA 12%");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 110, 30));

        ivaTxT.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        ivaTxT.setForeground(new java.awt.Color(0, 0, 0));
        ivaTxT.setText("ivaTxT");
        add(ivaTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, 140, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 590, 10));

        jLabel3.setText("RED EMART \"Construcción, Compra Venta de Inmuebles y administración hotelera\"");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 460, -1));

        jSeparator3.setBackground(new java.awt.Color(204, 204, 204));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 590, 20));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel11.setText("Elaborado por Adrián Hernández, Karen Gonzaga, Hilary Calva, Thais Cartuche, Ronald Cuenca");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, 460, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fechaEmisionTxT;
    private javax.swing.JLabel ivaTxT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel nombreClienteTxT;
    private javax.swing.JLabel numeroFacturaTxT;
    private javax.swing.JLabel telefonoClienteTxT;
    private javax.swing.JLabel totalTxT;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex == 0) {
            Graphics2D graphics2d = (Graphics2D) graphics;
            graphics2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
            printAll(graphics2d);
            return PAGE_EXISTS;
        }else{
            return NO_SUCH_PAGE;
        }
    }
}
