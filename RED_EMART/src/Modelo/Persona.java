package Modelo;

/**
 *
 * @author KBGR55/Hilary-015-Thaisncp/AdrianArtz/ronaldcuenca19
 */
public class Persona {
    
    private Integer id;
    private String nombres;
    private String apellidos;
    private String identificacion;

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

    public Persona(Integer id, String nombres, String apellidos, String identificacion) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
    }

    public Persona() {
    } 
}
