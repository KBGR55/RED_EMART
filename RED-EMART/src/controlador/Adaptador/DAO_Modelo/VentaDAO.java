package controlador.Adaptador.DAO_Modelo;

import controlador.Adaptador.AdaptadorDao;
import controlador.tda.lista.ListaEnlazada;
import modelo.Venta;

/**
 *
 * @author  KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
public class VentaDAO extends AdaptadorDao<Venta>{
    private Venta venta;
    private ListaEnlazada<Venta> listaVentas = new ListaEnlazada<>();

    public Venta getVenta() {
        if (venta == null) {
            venta = new Venta();
        }
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public VentaDAO() {
        super(Venta.class);
    }

    public ListaEnlazada<Venta> getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(ListaEnlazada<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }

    public Boolean guardar_modificar() {
        try {
            if (getVenta().getId_venta() != null) {
                modificar(this.getVenta());
            } else {
                guardar(this.getVenta());
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error en guadar o modificar");
            return false;
        }
    }
    
    public ListaEnlazada<Venta> listado() {
        setListaVentas(listar());
        return listaVentas;
    }
    
//    public static void main(String[] args) {
//        VentaDAO venta = new VentaDAO();
//        ListaEnlazada<Venta> lista = venta.listar();
//        try {
//            venta.getVenta().setId(1257);
//            venta.getVenta().setEncargado_Captador(1509);
//            venta.getVenta().setEncargado_Despachador(1509);
//            venta.getVenta().setId_Cliente(4520);
//            venta.getVenta().setId_bienInmueble(1254);
//            System.out.println("EXITO");
//        } catch (Exception e) {
//            System.out.println("ERROR: " + e);
//        }
//    }
}
