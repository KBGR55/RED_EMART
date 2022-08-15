package controlador.Adaptador.DAO_Modelo;

import controlador.Adaptador.AdaptadorDao;
import controlador.tda.lista.ListaEnlazada;
import java.sql.PreparedStatement;
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
                modificarB(this.getInmueble());
            } else {
                guardar(this.getInmueble());
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error en guadar o modificar");
            return false;
        }
    }
    
    public void modificarB(Bien_Inmueble dato) throws Exception {
        String[] columnas = columnas();
        String comando = "update  BIEN_INMUEBLE  SET ";
        String datos = "";
        for (int i = 0; i < columnas.length; i++) {
            System.out.println("controlador.Adaptador.DAO_Modelo.Bien_InmuebleDAO.modificarB()");
            if (!columnas[i].equalsIgnoreCase("ID_BIEN_INMUEBLE")&&!columnas[i].equalsIgnoreCase("ENCARGADO_CAPTADOR")) {
                if (i == columnas.length - 1) {
                    //variables += columnas[i];//id, nombres, external_id, ...
                    datos += columnas[i] + "=" + tipoDato(columnas[i], dato);//0, "casa", "343-545
                } else {
                    //variables += columnas[i] + " , ";
                    datos += columnas[i] + "=" + tipoDato(columnas[i], dato) + " , ";//0, "casa", "343-545
                }
            }
        }
        comando += datos + " where ID_BIEN_INMUEBLE = " + dato.getId_Bien_Inmueble();
        try {
            PreparedStatement stmt = getConexion().prepareStatement(comando);
            stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error en modificar" + e);
        }
        System.out.println(comando);
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
