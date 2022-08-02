package modelo;

import modelo.enums.TipoEmpleado;
import modelo.enums.TipoIdentificacion;

/**
 *
 * @author KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
public class Empleado extends Persona{
       
    private TipoEmpleado tipoEmp;
    private Double sueldo;

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

    public Empleado(TipoEmpleado tipoEmp, Double sueldo, Integer id, String nombres, String apellidos, String identificacion, TipoIdentificacion tipo_identificacion) {
        super(id, nombres, apellidos, identificacion, tipo_identificacion);
        this.tipoEmp = tipoEmp;
        this.sueldo = sueldo;
    }

    public Empleado() {
    }    
}