package modelo;

import modelo.enums.EstadoBienInmueble;
import modelo.enums.TipoServicio;

/**
 *
 * @author  KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
public class BienInmueble {
    private EstadoBienInmueble estado;
    private Double precio;
    private String direccion;
    private TipoServicio servicio;

    public EstadoBienInmueble getEstado() {
        return estado;
    }

    public void setEstado(EstadoBienInmueble estado) {
        this.estado = estado;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public TipoServicio getServicio() {
        return servicio;
    }

    public void setServicio(TipoServicio servicio) {
        this.servicio = servicio;
    }

    public BienInmueble(EstadoBienInmueble estado, Double precio, String direccion, TipoServicio servicio) {
        this.estado = estado;
        this.precio = precio;
        this.direccion = direccion;
        this.servicio = servicio;
    }

    public BienInmueble() {
    }
    
    
}