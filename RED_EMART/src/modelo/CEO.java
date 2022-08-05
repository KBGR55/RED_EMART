package modelo;

import java.util.Date;
import modelo.enums.TipoIdentificacion;

/**
 *
 * @author KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
public class CEO extends Persona{
    private Credenciales credenciales;

    public Credenciales getCredenciales() {
        return credenciales;
    }

    public void setCredenciales(Credenciales credenciales) {
        this.credenciales = credenciales;
    }

    public CEO() {
    }

    public CEO(Credenciales credenciales, Integer id, String nombres, String apellidos, String identificacion, TipoIdentificacion tipo_identificacion, Date fecha_Nacimiento) {
        super(id, nombres, apellidos, identificacion, tipo_identificacion, fecha_Nacimiento);
        this.credenciales = credenciales;
    }
}