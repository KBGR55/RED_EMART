package controlador.Adaptador.DAO_Modelo;

import controlador.Adaptador.AdaptadorDao;
import modelo.Bien_Inmueble;

/**
 *
 * @author KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
public class Bien_InmuebleDAO extends AdaptadorDao<Bien_Inmueble> {

    private Bien_Inmueble inmueble;

    public Bien_Inmueble getInmueble() {
        if (inmueble == null) {
            inmueble = new Bien_Inmueble();
        }
        return inmueble;
    }

    public void setInmueble(Bien_Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public Bien_InmuebleDAO() {
        super(Bien_Inmueble.class);
    }

    public Boolean guardar_modificar() {
        try {
            if (getInmueble().getId_BienInmueble() != null) {
                modificar(this.getInmueble());
            } else {
                guardar(this.getInmueble());
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error en guadar o modificar");
            return false;
        }
    }
//    public static void main(String[] args) {
//        Bien_InmuebleDAO inmueble = new Bien_InmuebleDAO();
//        ListaEnlazada<Bien_Inmueble> lista = inmueble.listar();
//        try {
//            inmueble.getInmueble().setId(1);
//            inmueble.getInmueble().setEstado(EstadoBienInmueble.VENDIDO);
//            inmueble.getInmueble().setPrecio(15.000);
//            inmueble.getInmueble().setDireccion("El Rosal");
//            inmueble.getInmueble().setServicio(TipoServicio.VENTA);
//            inmueble.guardar(inmueble.getInmueble());
//            System.out.println("EXITO");
//        } catch (Exception e) {
//            System.out.println("ERROR: " + e);
//        }
//    }
}
