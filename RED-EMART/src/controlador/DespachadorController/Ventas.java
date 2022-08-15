package controlador.DespachadorController;

import controlador.Adaptador.DAO_Modelo.Bien_InmuebleDAO;
import controlador.Adaptador.DAO_Modelo.PersonaDAO;
import controlador.Adaptador.DAO_Modelo.VentaDAO;
import controlador.Conexion.SQLclass;
import controlador.tda.lista.ListaEnlazada;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Persona;
import modelo.Venta;

/**
 *
 * @author Hilary-Madelein
 */
public class Ventas {

    Bien_InmuebleDAO daoBien = new Bien_InmuebleDAO();
    PersonaDAO daoPer = new PersonaDAO();
    Venta ventaPrueba = new Venta();
    VentaDAO daoVen = new VentaDAO();
    Connection conect = SQLclass.conn();
    private Integer id;

    public Bien_InmuebleDAO getDaoBien() {
        return daoBien;
    }

    public void setDaoBien(Bien_InmuebleDAO daoBien) {
        this.daoBien = daoBien;
    }

    public PersonaDAO getDaoPer() {
        return daoPer;
    }

    public void setDaoPer(PersonaDAO daoPer) {
        this.daoPer = daoPer;
    }

    public Venta getVentaPrueba() {
        return ventaPrueba;
    }

    public void setVentaPrueba(Venta ventaPrueba) {
        this.ventaPrueba = ventaPrueba;
    }

    public VentaDAO getDaoVen() {
        return daoVen;
    }

    public void setDaoVen(VentaDAO daoVen) {
        this.daoVen = daoVen;
    }

    public void obtenerDisponibles() {

    }

    public void mostrarDatosTablaInmuebles(JTable tableVentas) {
        
        DefaultTableModel tablaCuenta = new DefaultTableModel();
        tablaCuenta.addColumn("ID");
        tablaCuenta.addColumn("Precio");
        tablaCuenta.addColumn("Direccion");
        tablaCuenta.addColumn("Inmueble");
        tableVentas.setModel(tablaCuenta);

        String[] datos = new String[4];

        try {
            Statement leer = conect.createStatement();
            ResultSet resultado = leer.executeQuery("SELECT id_bien_inmueble, precio, id_direccion, id_bien_inmueble FROM bien_inmueble WHERE id_estado_b = 'EB_D' ");
            while (resultado.next()) {
                datos[0] = String.valueOf(resultado.getInt(1));
                datos[1] = String.valueOf(resultado.getDouble(2));
                datos[2] = String.valueOf(resultado.getInt(3));
                datos[3] = String.valueOf(resultado.getInt(4));
                tablaCuenta.addRow(datos);
            }
            tableVentas.setModel(tablaCuenta);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta");
        }
    }

    public void leerClientes(JTable tableClientes, ListaEnlazada<Persona> clientes) {
        DefaultTableModel tabla = new DefaultTableModel();
        try {
            tabla.addColumn("ID");
            tabla.addColumn("Identificacion");
            tabla.addColumn("Nombres");
            tabla.addColumn("Apellidos");
            tableClientes.setModel(tabla);
            String datos[] = new String[4];
            for (int i = 0; i < clientes.getSize(); i++) {
                datos[0] = "" + clientes.obtenerDato(i).getId_persona();
                datos[1] = "" + clientes.obtenerDato(i).getIdentificacion();
                datos[2] = "" + clientes.obtenerDato(i).getNombres();
                datos[3] = "" + clientes.obtenerDato(i).getApellidos();
                tabla.addRow(datos);
                tableClientes.setModel(tabla);
            }
        } catch (Exception e) {
            System.out.println("ERROR en cargar: " + e);
        }
    }

    public void mostrarDatosTabla(JTable tableDes, Integer id_direccion) {

        DefaultTableModel tablaDes = new DefaultTableModel();
        tablaDes.addColumn("ID");
        tablaDes.addColumn("Lugar");
        tablaDes.addColumn("Calle principal");
        tablaDes.addColumn("Calle secundaria");
        tableDes.setModel(tablaDes);

        String[] datos = new String[4];

        try {
            Statement leer = conect.createStatement();
            ResultSet resultado = leer.executeQuery("SELECT * FROM direccion WHERE id_direccion = '" + id_direccion + " ' ");
            while (resultado.next()) {
                datos[0] = String.valueOf(resultado.getInt(1));
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                tablaDes.addRow(datos);
            }
            tableDes.setModel(tablaDes);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta: " + e);
        }
    }

//    public void mostrarDatosTablaDescripcion(JTable tableDes, Integer id_des) {
//
//        DefaultTableModel tablaDes = new DefaultTableModel();
//        tablaDes.addColumn("ID");
//        tablaDes.addColumn("Tipo inmueble");
//        tablaDes.addColumn("Metros cuadrados");
//        tablaDes.addColumn("Color");
//        tablaDes.addColumn("Nro. Pisos");
//        tablaDes.addColumn("Piscina");
//        tablaDes.addColumn("Amoblado");
//        tablaDes.addColumn("Ascensor");
//        tablaDes.addColumn("Nro.Cuartos");
//        tableDes.setModel(tablaDes);
//
//        String[] datos = new String[9];
//
//        try {
//            Statement leer = conect.createStatement();
//            ResultSet resultado = leer.executeQuery("SELECT * FROM descripcion_bieninmueble WHERE id_descripcion = '" + id_des + " ' ");
//            while (resultado.next()) {
//                datos[0] = String.valueOf(resultado.getInt(1));
//                datos[1] = resultado.getString(2);
//                datos[2] = String.valueOf(resultado.getDouble(3));
//                datos[3] = resultado.getString(4);
//                datos[4] = String.valueOf(resultado.getInt(5));
//                datos[5] = resultado.getString(6);
//                datos[6] = resultado.getString(7);
//                datos[7] = resultado.getString(8);
//                datos[8] = String.valueOf(resultado.getInt(9));
//                tablaDes.addRow(datos);
//            }
//            tableDes.setModel(tablaDes);
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Error en la consulta: " + e);
//            e.printStackTrace();
//        }
//    }

    public Integer id_despachador(String iden) {
        try {
            PreparedStatement leer = conect.prepareStatement("SELECT id_persona FROM persona WHERE identificacion = '" + iden + "'");
            ResultSet resultado = leer.executeQuery();
            if (resultado.next()) {
                Integer despachador = resultado.getInt("id_persona");
                return despachador;
            } else {
                JOptionPane.showMessageDialog(null, "Datos no encontrados");
                return null;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta ");
            return null;
        }
    }

    public void generarVenta(Integer id_cliente, Integer inmueble, Integer despachador, Date fecha, Double precio, Integer id_bien) throws Exception {
        id = daoVen.listado().getSize();
        ventaPrueba.setId_venta(id);
        ventaPrueba.setId_cliente(id_cliente);
        ventaPrueba.setId_bien_inmueble(inmueble);
        ventaPrueba.setEncargado_Despachador(despachador);
        ventaPrueba.setFecha(fecha);
        ventaPrueba.setPrecio_total_pagar(precio);
        try {
            daoVen.guardar(ventaPrueba);
            try {
                PreparedStatement leer2 = conect.prepareStatement("UPDATE bien_inmueble SET id_estado_b = ?" + "WHERE id_bien_inmueble = '" + id_bien + "'");
                leer2.setString(1, "EB_V");
                leer2.executeUpdate();
                conect.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Problemas al realizar la transferencia");
            }
            JOptionPane.showMessageDialog(null, "Venta generada con éxito");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de ingreso de datos");
        }
    }

    public void leerVentas(JTable tableClientes, ListaEnlazada<Venta> ventas) {
        DefaultTableModel tabla = new DefaultTableModel();
        try {
            tabla.addColumn("ID");
            tabla.addColumn("Cliente");
            tabla.addColumn("Bien inmueble");
            tabla.addColumn("Vendedor");
            tabla.addColumn("Fecha");
            tabla.addColumn("Precio");
            tableClientes.setModel(tabla);
            String datos[] = new String[6];
            for (int i = 0; i < ventas.getSize(); i++) {
                datos[0] = "" + ventas.obtenerDato(i).getId_venta();
                datos[1] = "" + ventas.obtenerDato(i).getId_cliente();
                datos[2] = "" + ventas.obtenerDato(i).getId_bien_inmueble();
                datos[3] = "" + ventas.obtenerDato(i).getEncargado_Despachador();
                datos[4] = "" + ventas.obtenerDato(i).getFecha();
                datos[5] = "" + ventas.obtenerDato(i).getPrecio_total_pagar();
                tabla.addRow(datos);
                tableClientes.setModel(tabla);
            }
        } catch (Exception e) {
            System.out.println("ERROR en cargar: " + e);
        }
    }

//    public void mostrarDatosTablaCliente(JTable tableDes, Integer id_des) {
//
//        DefaultTableModel tablaDes = new DefaultTableModel();
//        tablaDes.addColumn("ID");
//        tablaDes.addColumn("Nombres");
//        tablaDes.addColumn("Apellidos");
//        tablaDes.addColumn("Identificacion");
//        tableDes.setModel(tablaDes);
//
//        String[] datos = new String[4];
//
//        try {
//            Statement leer = conect.createStatement();
//            ResultSet resultado = leer.executeQuery("SELECT id_persona, nombres, apellidos, identificacion FROM persona WHERE id_persona = '" + id_des + " ' ");
//            while (resultado.next()) {
//                datos[0] = String.valueOf(resultado.getInt(1));
//                datos[1] = resultado.getString(2);
//                datos[2] = resultado.getString(3);
//                datos[3] = resultado.getString(4);
//                tablaDes.addRow(datos);
//            }
//            tableDes.setModel(tablaDes);
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Error en la consulta: " + e);
//            e.printStackTrace();
//        }
//    }

}