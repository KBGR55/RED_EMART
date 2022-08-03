package modelo;

import java.util.Date;
import modelo.enums.EstadoEmpleado;
import modelo.enums.TipoEmpleado;
import modelo.enums.TipoIdentificacion;

/**
 *
 * @author KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
public class Empleado extends Persona{
       
    private TipoEmpleado tipoEmp;
    private Double sueldo;
    private EstadoEmpleado estado;

    public TipoEmpleado getTipoEmp() {
        return tipoEmp;
    }

    public void setTipoEmp(TipoEmpleado tipoEmp) {
        this.tipoEmp = tipoEmp;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public EstadoEmpleado getEstado() {
        return estado;
    }

    public void setEstado(EstadoEmpleado estado) {
        this.estado = estado;
    }


    public Empleado(TipoEmpleado tipoEmp, Double sueldo, EstadoEmpleado estado, Integer id, String nombres, String apellidos, String identificacion, TipoIdentificacion tipo_identificacion, Date fecha_Nacimiento) {
        super(id, nombres, apellidos, identificacion, tipo_identificacion, fecha_Nacimiento);
        this.tipoEmp = tipoEmp;
        this.sueldo = sueldo;
        this.estado = estado;
    }
    
    public Empleado() {
    }    
}