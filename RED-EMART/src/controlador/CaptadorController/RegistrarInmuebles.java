package controlador.CaptadorController;

import controlador.Adaptador.DAO_Modelo.Bien_InmuebleDAO;
import controlador.Adaptador.DAO_Modelo.DescripcionDAO;
import controlador.Adaptador.DAO_Modelo.DireccionDAO;
import controlador.tda.lista.ListaEnlazada;
import controlador.tda.lista.exception.PosicionException;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.Bien_Inmueble;
import modelo.Descripcion_BienInmueble;
import modelo.Direccion;
import modelo.Persona;

/**
 *
 * @author KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
public class RegistrarInmuebles {

    private Bien_Inmueble bien = new Bien_Inmueble();
    private Bien_InmuebleDAO dao = new Bien_InmuebleDAO();
    private Direccion dic = new Direccion();
    private DireccionDAO daoD = new DireccionDAO();
    private Descripcion_BienInmueble desc = new Descripcion_BienInmueble();
    private DescripcionDAO daoDes = new DescripcionDAO();
    private String lista[][]; private String lista2[][];
    private Integer ID;

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

    public void resgitrarDireccion(String id_lugar, String calleP, String calleS) throws Exception {
        ID = daoD.listar().getSize();
        dic.setId_lugar(id_lugar);
        dic.setCalle_principal(calleP);
        dic.setCalle_secundaria(calleS);
        dic = new Direccion(ID, dic.getId_lugar(), dic.getCalle_principal(), dic.getCalle_secundaria());
        daoD.guardar(dic);
    }

    public void registrarDescripcion(String id_tipo_bien, Double metros_cuadrados, String color, Integer n_pisos, Integer n_cuartos, String amueblado, String ascensor, String piscina) throws Exception {
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
    }

    public void registrarCliente(Integer id_descripcion, Integer id_direccion, Date fecha, Double precio, String estado) throws Exception {
        ID = dao.listar().getSize();
        bien.setFecha_ingreso(fecha);
        bien.setPrecio(precio);
        bien.setEstado(estado);
        bien.setId_descripcion(id_descripcion);
        bien.setId_direccion(id_direccion);
        bien = new Bien_Inmueble(ID, bien.getId_direccion(), bien.getId_descripcion(), ID, bien.getFecha_ingreso(), bien.getPrecio(), bien.getEstado());
        dao.guardar(bien);
    }
    
    public void leer(JTable table, ListaEnlazada<Bien_Inmueble> bienes, ListaEnlazada<Descripcion_BienInmueble> desc, ListaEnlazada<Direccion> dir) {
        DefaultTableModel tabla = new DefaultTableModel();
        try {
            tabla.addColumn("ID");
            tabla.addColumn("ID TIPO INMUEBLE");
            tabla.addColumn("ID LUGAR");
            tabla.addColumn("ID CAPTADOR");
            tabla.addColumn("FECHA INGRESO");
            tabla.addColumn("ESTADO");
            table.setModel(tabla);
            String datos[] = new String[6];

            for (int i = 0; i < bienes.getSize(); i++) {
                datos[0] = "" + bienes.obtenerDato(i).getId_Bien_Inmueble();
                datos[1] = "" + desc.obtenerDato(i).getId_tipo_bien();
                datos[2] = "" + dir.obtenerDato(i).getId_lugar();
                datos[3] = "" + bienes.obtenerDato(i).getEncargado_Captador();
                datos[4] = "" + bienes.obtenerDato(i).getFecha_ingreso();
                datos[5] = "" + bienes.obtenerDato(i).getEstado();
                tabla.addRow(datos);
                table.setModel(tabla);
            }
        } catch (Exception e) {
            System.out.println("ERROR en cargar: " + e);
        }
    }

    public void leerDesc(JTable table, ListaEnlazada<Descripcion_BienInmueble> listaDesc) {
        DefaultTableModel tabla = new DefaultTableModel();
        lista = new String [4][listaDesc.getSize()];
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
        lista2 = new String [4][listaDir.getSize()];
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
