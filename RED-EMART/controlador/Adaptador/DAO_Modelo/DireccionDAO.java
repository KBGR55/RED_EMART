package controlador.Adaptador.DAO_Modelo;

import controlador.Adaptador.AdaptadorDao;
import controlador.tda.lista.ListaEnlazada;
import modelo.Direccion;

/**
 *
 * @author KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
public class DireccionDAO extends AdaptadorDao<Direccion> {

    private Direccion direccion;
    private ListaEnlazada<Direccion> listaDirecciones = new ListaEnlazada<>();

    public DireccionDAO() {
        super(Direccion.class);
    }

    public Direccion getDireccion() {
        if (direccion== null) {
            direccion = new Direccion();
        }
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public ListaEnlazada<Direccion> getListaDirecciones() {
        return listaDirecciones;
    }

    public void setListaDirecciones(ListaEnlazada<Direccion> listaDirecciones) {
        this.listaDirecciones = listaDirecciones;
    }

    public Boolean guardar_modificar() {
        try {
            if (getDireccion().getId_direccion()!= null) {
                modificar(this.getDireccion());
            } else {
                guardar(this.getDireccion());
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error en guadar o modificar");
            return false;
        }
    }
    
    public ListaEnlazada<Direccion> listado() {
        setListaDirecciones(listar());
        return listaDirecciones;
    } 
    
//    public static void main(String[] args) {
//        DireccionDAO direccion = new DireccionDAO();
//        ListaEnlazada<Direccion> lista = direccion.listar();
//        try {
//            direccion.getDireccion().setId_direccion(2);
//            direccion.getDireccion().setId_lugar("LL_SUCR");
//            direccion.getDireccion().setCalle_principal("Bernardo");
//            direccion.getDireccion().setCalle_secundaria("Sucre");
//            direccion.guardar(direccion.getDireccion());
//            System.out.println("EXITO");
//        } catch (Exception e) {
//            System.out.println("ERROR: " + e);
//        }
//    }
}
