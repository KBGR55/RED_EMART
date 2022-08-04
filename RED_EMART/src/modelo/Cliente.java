package modelo;

import java.util.Date;
import modelo.enums.TipoIdentificacion;

/**
 *
 * @author KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
public class Cliente extends Persona{
    private String telefono;
    
    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Cliente(Integer edad, String telefono, Integer id, String nombres, String apellidos, String identificacion, TipoIdentificacion tipo_identificacion, Date fecha_Nacimiento) {
        super(id, nombres, apellidos, identificacion, tipo_identificacion, fecha_Nacimiento);
        this.telefono = telefono;
    }

    public Cliente() {
    }
    
}