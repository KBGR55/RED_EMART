package modelo;

import java.util.Date;

/**
 *
 * @author KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
public class Empleado extends Persona{
    private String id_tipo_emp;
    private String id_estado_emp;
    private String usuario;
    private String clave;

    public String getId_tipo_emp() {
        return id_tipo_emp;
    }

    public void setId_tipo_emp(String id_tipo_emp) {
        this.id_tipo_emp = id_tipo_emp;
    }

    public String getId_estado_emp() {
        return id_estado_emp;
    }

    public void setId_estado_emp(String id_estado_emp) {
        this.id_estado_emp = id_estado_emp;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Empleado(String id_tipo_emp, String id_estado_emp, String usuario, String clave, Integer id_persona, String nombres, String apellidos, String identificacion, String id_tipo_identificacion, Date fecha_Nacimiento, String telefono) {
        super(id_persona, nombres, apellidos, identificacion, id_tipo_identificacion, fecha_Nacimiento, telefono);
        this.id_tipo_emp = id_tipo_emp;
        this.id_estado_emp = id_estado_emp;
        this.usuario = usuario;
        this.clave = clave;
    }

    public Empleado() {
    }

}