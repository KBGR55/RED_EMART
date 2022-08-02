package Modelo;

/**
 *
 * @author KBGR55/Hilary-015-Thaisncp/AdrianArtz/ronaldcuenca19
 */
public class Cliente extends Persona{
    private Integer edad;
    private String telefono;

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

    public Cliente(Integer edad, String telefono, Integer id, String nombres, String apellidos, String identificacion) {
        super(id, nombres, apellidos, identificacion);
        this.edad = edad;
        this.telefono = telefono;
    }

    public Cliente(Integer edad, String telefono) {
        this.edad = edad;
        this.telefono = telefono;
    }  
    
}