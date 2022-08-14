package controlador.Adaptador.DAO_Modelo;

import controlador.Adaptador.AdaptadorDao;
import controlador.tda.lista.ListaEnlazada;
import java.time.LocalDate;
import java.time.temporal.TemporalQueries;
import java.util.Date;
import modelo.Bien_Inmueble;
import modelo.Venta;

/**
 *
 * @author KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
public class Bien_InmuebleDAO extends AdaptadorDao<Bien_Inmueble> {

    private Bien_Inmueble inmueble;
    private ListaEnlazada<Bien_Inmueble> listaInmuebles = new ListaEnlazada<>();

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

    public ListaEnlazada<Bien_Inmueble> getListaInmuebles() {
        return listaInmuebles;
    }

    public void setListaInmuebles(ListaEnlazada<Bien_Inmueble> listaInmuebles) {
        this.listaInmuebles = listaInmuebles;
    }


    public Boolean guardar_modificar() {
        try {
            if (getInmueble().getId_Bien_Inmueble() != null) {
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
    
    public ListaEnlazada<Bien_Inmueble> listado() {
        setListaInmuebles(listar());
        return listaInmuebles;
    }
    
//    public static void main(String[] args) {
//     Bien_InmuebleDAO inmueble = new Bien_InmuebleDAO();
//    ListaEnlazada<Bien_Inmueble> lista = inmueble.listar();
//        try {
//           inmueble.getInmueble().setId_Bien_Inmueble(0);
//            inmueble.getInmueble().setId_direccion(0);
//            inmueble.getInmueble().setId_estado_b("EB_D");
//            inmueble.getInmueble().setId_descripcion(0);
//            inmueble.getInmueble().setEncargado_Captador(2);
//            inmueble.getInmueble().setFecha_ingreso(new Date());
//            inmueble.getInmueble().setPrecio(150.000);
//            inmueble.guardar(inmueble.getInmueble());
//            System.out.println("EXITO");
//        } catch (Exception e) {
//            System.out.println("ERROR: " + e);
//        }
//    }
}
