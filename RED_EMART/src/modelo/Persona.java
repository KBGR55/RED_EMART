package modelo;

import modelo.enums.TipoIdentificacion;

/**
 *
 * @author KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
public class Persona {
    
    private Integer id;
    private String nombres;
    private String apellidos;
    private String identificacion;
    private TipoIdentificacion tipo_identificacion;
 
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public TipoIdentificacion getTipo_identificacion() {
        return tipo_identificacion;
    }

    public void setTipo_identificacion(TipoIdentificacion tipo_identificacion) {
        this.tipo_identificacion = tipo_identificacion;
    }

    public Persona(Integer id, String nombres, String apellidos, String identificacion, TipoIdentificacion tipo_identificacion) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.tipo_identificacion = tipo_identificacion;
    }

    public Persona() {
    } 
}
