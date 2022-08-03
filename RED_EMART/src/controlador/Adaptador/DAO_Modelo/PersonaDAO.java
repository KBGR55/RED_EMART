package controlador.Adaptador.DAO_Modelo;

import controlador.Adaptador.AdaptadorDao;
import controlador.tda.lista.ListaEnlazada;
import modelo.Persona;
import modelo.enums.TipoIdentificacion;

/**
 *
 * @author KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
public class PersonaDAO extends AdaptadorDao<Persona> {

    private Persona persona;

    public Persona getPersona() {
        if (persona == null) {
            persona = new Persona();
        }
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public PersonaDAO() {
        super(Persona.class);
    }

    public Boolean guardar_modificar() {
        try {
            if (getPersona().getId() != null) {
                modificar(this.getPersona());
            } else {
                guardar(this.getPersona());
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error en guadar o modificar");
            return false;
        }
    }
//    
//    public static void main(String[] args) {
//        PersonaDAO personaDao = new PersonaDAO();
//        ListaEnlazada<Persona> lista = personaDao.listar();       
//        try {
//            personaDao.getPersona().setId(1);
//            personaDao.getPersona().setNombres("Hilary");
//            personaDao.getPersona().setApellidos("Calva");
//            personaDao.getPersona().setTipo_identificacion(TipoIdentificacion.CEDULA);
//            personaDao.getPersona().setIdentificacion("1104792682");
//            personaDao.getPersona().setFecha_Nacimiento("15/09/2002");
//            personaDao.guardar(personaDao.getPersona());
//            System.out.println("EXITO");
//        } catch (Exception e) {
//            System.out.println("ERROR: "+e);
//        }
//    }


}
