package controlador.Adaptador.DAO_Modelo;

import controlador.Adaptador.AdaptadorDao;
import controlador.tda.lista.ListaEnlazada;
import java.util.Date;
import modelo.Persona;

/**
 *
 * @author KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
public class PersonaDAO extends AdaptadorDao<Persona> {

    private Persona persona;
    private ListaEnlazada<Persona> listaPersonas = new ListaEnlazada<>();

    public Persona getPersona() {
        if (persona == null) {
            persona = new Persona();
        }
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public ListaEnlazada<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ListaEnlazada<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public PersonaDAO() {
        super(Persona.class);
    }

    public Boolean guardar_modificar() {
        try {
            if (getPersona().getId_persona() != null) {
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
    
    public ListaEnlazada<Persona> listado() {
        setListaPersonas(listar());
        return listaPersonas;
    }
    
//    public static void main(String[] args) {
//        PersonaDAO personaDao = new PersonaDAO();
//        ListaEnlazada<Persona> lista = personaDao.listar();       
//        try {
//            personaDao.getPersona().setId_persona(2);
//            personaDao.getPersona().setNombres("Arge");
//            personaDao.getPersona().setApellidos("Ramos");
//            personaDao.getPersona().setId_tipo_identificacion("TI_C");
//            personaDao.getPersona().setIdentificacion("1105966657");
//            personaDao.getPersona().setFecha_Nacimiento(new Date());
//            personaDao.getPersona().setTelefono("9999999999");
//            personaDao.guardar(personaDao.getPersona());
//            System.out.println("EXITO");
//        } catch (Exception e) {
//            System.out.println("ERROR: "+e);
//        }
//    }
}
