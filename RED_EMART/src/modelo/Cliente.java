package modelo;

import java.util.Date;
import modelo.enums.TipoIdentificacion;

/**
 *
 * @author KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
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

    public Cliente(Integer edad, String telefono, Integer id, String nombres, String apellidos, String identificacion, TipoIdentificacion tipo_identificacion, Date fecha_Nacimiento) {
        super(id, nombres, apellidos, identificacion, tipo_identificacion, fecha_Nacimiento);
        this.edad = edad;
        this.telefono = telefono;
    }

    public Cliente() {
    }
    
}