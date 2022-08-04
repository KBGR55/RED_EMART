package controlador.Adaptador.DAO_Modelo;

import controlador.Adaptador.AdaptadorDao;
import controlador.tda.lista.ListaEnlazada;
import modelo.CEO;
import modelo.Credenciales;

/**
 *
 * @author KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
public class CeoDAO  extends AdaptadorDao<CEO>{
    private CEO ceo;

    public CEO getCeo() {
        if (ceo == null) {
            ceo =  new CEO();
        }
        return ceo;
    }

    public void setCeo(CEO ceo) {
        this.ceo = ceo;
    }

    public CeoDAO() {
        super(CEO.class);
    }
    
    
    public Boolean guardar_modificar() {
        try {
            if (getCeo().getId() != null) {
                modificar(this.getCeo());
            } else {
                guardar(this.getCeo());
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error en guadar o modificar");
            return false;
        }
    }
    
//    public static void main(String[] args) {
//        CeoDAO ceo = new CeoDAO();
//        Credenciales cre = new Credenciales();
//        ListaEnlazada<CEO> lista = ceo.listar();
//        try {
//            ceo.getCeo().setNombres("Hilary");
//            ceo.getCeo().setApellidos("Calva");
//            ceo.getCeo().setFecha_Nacimiento("2002");
//            ceo.getCeo().setId(1509);
//            cre.setUsuario("hilary15");
//            cre.setClave("tupatrona3000");
//            ceo.getCeo().setCredenciales(cre);
//            System.out.println("EXITO");
//        } catch (Exception e) {
//            System.out.println("ERROR: " + e);
//        }
//    }    
}
