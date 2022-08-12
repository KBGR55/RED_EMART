package modelo;

import java.util.Date;

/**
 *
 * @author KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
public class Persona {
    private Integer id_persona;
    private String nombres;
    private String apellidos;
    private String identificacion;
    private String id_tipo_identificacion;
    private Date fecha_Nacimiento;
    private String telefono;

    public Integer getId_persona() {
        return id_persona;
    }

    public void setId_persona(Integer id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getId_tipo_identificacion() {
        return id_tipo_identificacion;
    }

    public void setId_tipo_identificacion(String id_tipo_identificacion) {
        this.id_tipo_identificacion = id_tipo_identificacion;
    }

    public Date getFecha_Nacimiento() {
        return fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(Date fecha_Nacimiento) {
        this.fecha_Nacimiento = fecha_Nacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Persona(Integer id_persona, String nombres, String apellidos, String identificacion, String id_tipo_identificacion, Date fecha_Nacimiento, String telefono) {
        this.id_persona = id_persona;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.id_tipo_identificacion = id_tipo_identificacion;
        this.fecha_Nacimiento = fecha_Nacimiento;
        this.telefono = telefono;
    }

    public Persona() {
    }

}