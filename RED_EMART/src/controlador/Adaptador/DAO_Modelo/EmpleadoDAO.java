package controlador.Adaptador.DAO_Modelo;

import controlador.Adaptador.AdaptadorDao;
import controlador.tda.lista.ListaEnlazada;
import modelo.Cliente;
import modelo.Empleado;
import modelo.enums.EstadoEmpleado;
import modelo.enums.TipoEmpleado;

/**
 *
 * @author KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
public class EmpleadoDAO extends AdaptadorDao<Empleado> {

    private Empleado empleado;

    public Empleado getEmpleado() {
        if (empleado == null) {
            empleado = new Empleado();
        }
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public EmpleadoDAO() {
        super(Empleado.class);
    }

    public Boolean guardar_modificar() {
        try {
            if (getEmpleado().getId() != null) {
                modificar(this.getEmpleado());
            } else {
                guardar(this.getEmpleado());
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error en guadar o modificar");
            return false;
        }
    }

//    public static void main(String[] args) {
//        EmpleadoDAO empleado = new EmpleadoDAO();
//        ListaEnlazada<Empleado> lista = empleado.listar();
//        try {
//            empleado.getEmpleado().setSueldo(40.9);
//            empleado.getEmpleado().setTipoEmp(TipoEmpleado.CAPTADOR);
//            empleado.getEmpleado().setEstado(EstadoEmpleado.CONTRATADO);
//            empleado.guardar(empleado.getEmpleado());
//            System.out.println("EXITO");
//        } catch (Exception e) {
//            System.out.println("ERROR: " + e);
//        }
//    }

}
