package modelo;

/**
 *
 * @author K.G
 */
public class Cliente {
    private Integer id;
    private String nombres;
    private String apellidos;
    private Integer edad;
    private String telefono;
    private String dni;

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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Cliente{" +"id='" +id+ '\'' +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +"telefono='" + telefono + '\'' +
                ", dni='" + dni+ '\'' +
                '}';
    }
}