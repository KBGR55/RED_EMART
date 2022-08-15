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
    private String rol;

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

    public Boolean iniciarSesion(String usuario, String password) throws PosicionException {
        for (int i = 0; i < listaEmpleados.getSize(); i++) {
            if (listaEmpleados.obtenerDato(i).getUsuario().equals(usuario) && listaEmpleados.obtenerDato(i).getClave().equals(password)) {
                System.out.println("El rol es: " + rol(i));
                setEmp(new Empleado(listaEmpleados.obtenerDato(i).getId_tipo_emp(), listaEmpleados.obtenerDato(i).getId_estado_emp(),
                        listaEmpleados.obtenerDato(i).getUsuario(), listaEmpleados.obtenerDato(i).getClave(), listaEmpleados.obtenerDato(i).getId_persona(),
                        personaDAO.listar().obtenerDato(i).getNombres(), personaDAO.listar().obtenerDato(i).getApellidos(),
                        personaDAO.listar().obtenerDato(i).getIdentificacion(), personaDAO.listar().obtenerDato(i).getId_tipo_identificacion(),
                        personaDAO.listar().obtenerDato(i).getFecha_Nacimiento(), personaDAO.listar().obtenerDato(i).getTelefono()));
                return true;
            }
        }
        return false;
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

    public String getRol() {
        return rol;
    }

    private String rol(int i) throws PosicionException {
        this.rol = "";
        return switch (listaEmpleados.obtenerDato(i).getId_tipo_emp()) {
            case "A_C" ->
                this.rol = "CEO";
            case "E_C" ->
                this.rol = "CAPTADOR";
            case "E_D" ->
                this.rol = "DESPACHADOR";
            default ->
                this.rol;
        };
    }

    //TEST
//        public static void main(String[] args) throws PosicionException {
//            EmpleadoDAO empleadoDao = new EmpleadoDAO();
//            empleadoDao.iniciarSesion("samaelhg", "admin30");
//            System.out.println(empleadoDao.getEmp().getNombres() + " "+ empleadoDao.getEmp().getApellidos());
//        }
}
