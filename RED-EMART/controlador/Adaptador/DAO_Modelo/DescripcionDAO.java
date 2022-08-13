package controlador.Adaptador.DAO_Modelo;

import controlador.Adaptador.AdaptadorDao;
import controlador.tda.lista.ListaEnlazada;
import modelo.Descripcion_BienInmueble;
import modelo.Direccion;

/**
 *
 * @author Hilary-Madelein
 */
public class DescripcionDAO extends AdaptadorDao<Descripcion_BienInmueble> {

    private Descripcion_BienInmueble des = new Descripcion_BienInmueble();
    private ListaEnlazada<Descripcion_BienInmueble> listaDes = new ListaEnlazada<>();

    public DescripcionDAO() {
        super(Descripcion_BienInmueble.class);
    }

    public Descripcion_BienInmueble getDes() {
        return des;
    }

    public void setDes(Descripcion_BienInmueble des) {
        this.des = des;
    }

    public ListaEnlazada<Descripcion_BienInmueble> getListaDes() {
        return listaDes;
    }

    public void setListaDes(ListaEnlazada<Descripcion_BienInmueble> listaDes) {
        this.listaDes = listaDes;
    }

    public Boolean guardar_modificar() {
        try {
            if (getDes().getId_descripcion()!= null) {
                modificar(this.getDes());
            } else {
                guardar(this.getDes());
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error en guadar o modificar");
            return false;
        }
    }
    
    public ListaEnlazada<Descripcion_BienInmueble> listado() {
        setListaDes(listar());
        return listaDes;
    } 
//    
//    public static void main(String[] args) {
//        DescripcionDAO des = new DescripcionDAO ();
//        ListaEnlazada<Descripcion_BienInmueble> lista = des.listar();
//        try {
//            des.getDes().setId_descripcion(2);
//            des.getDes().setId_tipo_bien("TB_C");
//            des.getDes().setMetros_cuadrados(300.0);
//            des.getDes().setColor("Blanco");
//            des.getDes().setN_cuartos(8);
//            des.getDes().setN_pisos(2);
//            des.getDes().setAmueblado("No");
//            des.getDes().setAscensor("No");
//            des.getDes().setPiscina("No");
//            des.guardar(des.getDes());
//            System.out.println("EXITO");
//        } catch (Exception e) {
//            System.out.println("ERROR: " + e);
//        }
//    }
}
