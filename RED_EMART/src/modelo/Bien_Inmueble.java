package modelo;

import modelo.enums.EstadoBienInmueble;
import modelo.enums.TipoServicio;

/**
 *
 * @author  KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
public class Bien_Inmueble {
    private Integer id;
    private String descripcion;
    private EstadoBienInmueble estado;
    private Double precio;
    private String direccion;
    private TipoServicio servicio;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
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

    public Bien_Inmueble() {
    }

    public Bien_Inmueble(Integer id,String descripcion, EstadoBienInmueble estado, Double precio, String direccion, TipoServicio servicio) {
        this.descripcion = descripcion;
        this.id = id;
        this.estado = estado;
        this.precio = precio;
        this.direccion = direccion;
        this.servicio = servicio;
    }
    
}