package controlador.Adaptador.DAO_Modelo;

// @author: KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
import controlador.Adaptador.AdaptadorDao;
import controlador.tda.lista.ListaEnlazada;
import controlador.tda.lista.exception.PosicionException;
import modelo.Empleado;

public class EmpleadoDAO extends AdaptadorDao<Empleado> {

    private Empleado emp;
    private PersonaDAO personaDAO = new PersonaDAO();
    private ListaEnlazada<Empleado> listaEmpleados = listar();

    public EmpleadoDAO() {
        super(Empleado.class);
    }

    public Empleado getEmp() {
        if (emp == null) {
            emp = new Empleado();
        }
        return emp;
    }

    public void setEmp(Empleado emp) {
        this.emp = emp;
    }

    public Object[] iniciarSesion(String usuario, String password) throws PosicionException {
        Object[] datos = {Boolean.FALSE, "", ""};
        for (int i = 0; i < listaEmpleados.getSize(); i++) {
            if (listaEmpleados.obtenerDato(i).getUsuario().equals(usuario) && listaEmpleados.obtenerDato(i).getClave().equals(password)) {
                System.out.println("El rol es: " + rol(i));
                datos[0] = Boolean.TRUE;
                datos[1] = personaDAO.listar().obtenerDato(i).getNombres() + " " + personaDAO.listar().obtenerDato(i).getApellidos();
                datos[2] = rol(i);
                return datos;
            }
        }
        return datos;
    }

    private String rol(int i) throws PosicionException {
        String rol = "";
        return switch (listaEmpleados.obtenerDato(i).getId_tipo_emp()) {
            case "A_C" ->
                rol = "CEO";
            case "E_C" ->
                rol = "CAPTADOR";
            case "E_D" ->
                rol = "DESPACHADOR";
            default ->
                rol;
        };
    }

    public Boolean guardar_modificar() {
        try {
            if (getEmp().getId_persona() != null) {
                modificar(this.getEmp());
            } else {
                guardar(this.getEmp());
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error en guadar o modificar");
            return false;
        }
    }
    
    //TEST
    //    public static void main(String[] args) throws PosicionException {
    //        EmpleadoDAO empleadoDao = new EmpleadoDAO();
    //        //test
    //        System.out.println(empleadoDao.iniciarSesion("samaelhg", "admin30"));
    //        System.out.println(empleadoDao.iniciarSesion("karencat", "noche30"));
    //        System.out.println(empleadoDao.iniciarSesion("thaisxd", "cantaclaro"));
    //        System.out.println(empleadoDao.iniciarSesion("jordy", "tarado"));
    //
    //        PersonaDAO personaDao = new PersonaDAO();
    //        personaDao.listar();
    //
    //    }
    
}
