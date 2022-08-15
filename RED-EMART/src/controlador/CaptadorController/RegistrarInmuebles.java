package controlador.CaptadorController;

import controlador.Adaptador.DAO_Modelo.Bien_InmuebleDAO;
import controlador.Adaptador.DAO_Modelo.DescripcionDAO;
import controlador.Adaptador.DAO_Modelo.DireccionDAO;
import controlador.Conexion.SQLclass;
import controlador.tda.lista.ListaEnlazada;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Bien_Inmueble;
import java.sql.Connection;
import modelo.Descripcion_BienInmueble;
import modelo.Direccion;

/**
 *
 * @author KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz
 */
public class RegistrarInmuebles {

    private Bien_Inmueble bien = new Bien_Inmueble();
    private Bien_InmuebleDAO dao = new Bien_InmuebleDAO();
    private Direccion dic = new Direccion();
    private DireccionDAO daoD = new DireccionDAO();
    private Descripcion_BienInmueble desc = new Descripcion_BienInmueble();
    private DescripcionDAO daoDes = new DescripcionDAO();
    private String lista[][];
    private String lista2[][];
    private Integer ID;
    Connection conect = SQLclass.conn();

    public Bien_Inmueble getBien() {
        return bien;
    }

    public void setBien(Bien_Inmueble bien) {
        this.bien = bien;
    }

    public Bien_InmuebleDAO getDao() {
        return dao;
    }

    public void setDao(Bien_InmuebleDAO dao) {
        this.dao = dao;
    }

    public Direccion getDic() {
        return dic;
    }

    public void setDic(Direccion dic) {
        this.dic = dic;
    }

    public DireccionDAO getDaoD() {
        return daoD;
    }

    public void setDaoD(DireccionDAO daoD) {
        this.daoD = daoD;
    }

    public Descripcion_BienInmueble getDesc() {
        return desc;
    }

    public void setDesc(Descripcion_BienInmueble desc) {
        this.desc = desc;
    }

    public DescripcionDAO getDaoDes() {
        return daoDes;
    }

    public void setDaoDes(DescripcionDAO daoDes) {
        this.daoDes = daoDes;
    }

    public Boolean resgitrarDireccion(String id_lugar, String calleP, String calleS) throws Exception {
        try {
            ID = daoD.listar().getSize();
            dic.setId_lugar(id_lugar);
            dic.setCalle_principal(calleP);
            dic.setCalle_secundaria(calleS);
            dic = new Direccion(ID, dic.getId_lugar(), dic.getCalle_principal(), dic.getCalle_secundaria());
            daoD.guardar(dic);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Boolean registrarDescripcion(String id_tipo_bien, Double metros_cuadrados, String color, Integer n_pisos, Integer n_cuartos, String amueblado, String ascensor, String piscina) throws Exception {
        try {
            ID = daoDes.listar().getSize();
            desc.setId_tipo_bien(id_tipo_bien);
            desc.setMetros_cuadrados(metros_cuadrados);
            desc.setColor(color);
            desc.setN_pisos(n_pisos);
            desc.setN_cuartos(n_cuartos);
            desc.setAmueblado(amueblado);
            desc.setAscensor(ascensor);
            desc.setPiscina(piscina);
            desc = new Descripcion_BienInmueble(ID, desc.getId_tipo_bien(), desc.getMetros_cuadrados(), desc.getColor(), desc.getN_pisos(), desc.getN_cuartos(), desc.getAmueblado(), desc.getAscensor(), desc.getPiscina());
            daoDes.guardar(desc);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void registrarInmueble(Integer id_descripcion, Integer id_direccion, Date fecha, Integer empleado, Double precio, String estado) throws Exception {
        ID = dao.listar().getSize();
        bien.setFecha_ingreso(fecha);
        bien.setPrecio(precio);
        bien.setId_estado_b(estado);
        bien.setId_descripcion(id_descripcion);
        bien.setEncargado_Captador(empleado);
        bien.setId_direccion(id_direccion);
        bien = new Bien_Inmueble(ID, bien.getId_direccion(), bien.getId_descripcion(), bien.getId_estado_b(), bien.getEncargado_Captador(), bien.getFecha_ingreso(), bien.getPrecio());
        dao.guardar(bien);
    }

    public Boolean modificarInmueble(Integer id_bien, Integer id_descripcion, Integer id_direccion, Date fecha, Double precio, String estado) throws Exception {
        try {
            ID = id_bien;
            bien.setFecha_ingreso(fecha);
            bien.setPrecio(precio);
            bien.setId_estado_b(estado);
            bien.setId_descripcion(id_descripcion);
            bien.setId_direccion(id_direccion);
            bien = new Bien_Inmueble(ID, bien.getId_direccion(), bien.getId_descripcion(), bien.getId_estado_b(), bien.getEncargado_Captador(), bien.getFecha_ingreso(), bien.getPrecio());
            System.out.println("controlador.CaptadorController.RegistrarInmuebles.modificarInmueble()");
            dao.modificarB(bien);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Integer id_captador(String iden) {
        try {
            PreparedStatement leer = conect.prepareStatement("SELECT id_persona FROM persona WHERE identificacion = '" + iden + "'");
            ResultSet resultado = leer.executeQuery();
            if (resultado.next()) {
                Integer captador = resultado.getInt("id_persona");
                return captador;
            } else {
                JOptionPane.showMessageDialog(null, "Datos no encontrados");
                return null;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta ");
            return null;
        }
    }

    public void leerInmuebles(JTable tableClientes, ListaEnlazada<Bien_Inmueble> clientes) {
        DefaultTableModel tabla = new DefaultTableModel();
        try {
            tabla.addColumn("ID");
            tabla.addColumn("Direcccion");
            tabla.addColumn("Descripcion");
            tabla.addColumn("Captador");
            tabla.addColumn("Fecha ingreso");
            tabla.addColumn("Precio");
            tabla.addColumn("Estado");
            tableClientes.setModel(tabla);
            String datos[] = new String[7];
            for (int i = 0; i < clientes.getSize(); i++) {
                datos[0] = "" + clientes.obtenerDato(i).getId_Bien_Inmueble();
                datos[1] = "" + clientes.obtenerDato(i).getId_descripcion();
                datos[2] = "" + clientes.obtenerDato(i).getId_descripcion();
                datos[3] = "" + clientes.obtenerDato(i).getEncargado_Captador();
                datos[4] = "" + clientes.obtenerDato(i).getFecha_ingreso();
                datos[5] = "" + clientes.obtenerDato(i).getPrecio();
                datos[6] = "" + clientes.obtenerDato(i).getId_estado_b();
                tabla.addRow(datos);
                tableClientes.setModel(tabla);
            }
        } catch (Exception e) {
            System.out.println("ERROR en cargar: " + e);
        }
    }

    public void leerDesc(JTable table, ListaEnlazada<Descripcion_BienInmueble> listaDesc) {
        DefaultTableModel tabla = new DefaultTableModel();
        lista = new String[4][listaDesc.getSize()];
        try {
            tabla.addColumn("ID");
            tabla.addColumn("TIPO INMUEBLE");
            tabla.addColumn("TAMAÑO");
            tabla.addColumn("COLOR");
            table.setModel(tabla);
            String datos[] = new String[4];
            for (int i = 0; i < listaDesc.getSize(); i++) {
                datos[0] = "" + listaDesc.obtenerDato(i).getId_descripcion();
                lista[0][i] = "" + listaDesc.obtenerDato(i).getId_descripcion();
                datos[1] = "" + listaDesc.obtenerDato(i).getId_tipo_bien();
                datos[2] = "" + listaDesc.obtenerDato(i).getMetros_cuadrados();
                datos[3] = "" + listaDesc.obtenerDato(i).getColor();
                tabla.addRow(datos);
                table.setModel(tabla);
            }
        } catch (Exception e) {
            System.out.println("ERROR en cargar: " + e);
        }
    }

    public void leerDir(JTable table, ListaEnlazada<Direccion> listaDir) {
        DefaultTableModel tabla = new DefaultTableModel();
        lista2 = new String[4][listaDir.getSize()];
        try {
            tabla.addColumn("ID");
            tabla.addColumn("ID LUGAR");
            tabla.addColumn("PRINCIPAL");
            tabla.addColumn("SECUNDARIA");
            table.setModel(tabla);
            String datos[] = new String[4];
            for (int i = 0; i < listaDir.getSize(); i++) {
                datos[0] = "" + listaDir.obtenerDato(i).getId_direccion();
                lista2[0][i] = "" + listaDir.obtenerDato(i).getId_direccion();
                datos[1] = "" + listaDir.obtenerDato(i).getId_lugar();
                datos[2] = "" + listaDir.obtenerDato(i).getCalle_principal();
                datos[3] = "" + listaDir.obtenerDato(i).getCalle_secundaria();
                tabla.addRow(datos);
                table.setModel(tabla);
            }
        } catch (Exception e) {
            System.out.println("ERROR en cargar: " + e);
        }
    }

    public String[][] getLista() {
        return lista;
    }

    public void setLista(String[][] lista) {
        this.lista = lista;
    }

    public String[][] getLista2() {
        return lista2;
    }

    public void setLista2(String[][] lista2) {
        this.lista2 = lista2;
    }
}
