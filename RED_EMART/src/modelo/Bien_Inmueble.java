package modelo;

import controlador.tda.lista.ListaEnlazada;
import modelo.enums.EstadoBienInmueble;
import modelo.enums.TipoServicio;

/**
 *
 * @author  KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
public class Bien_Inmueble {
    private String descripcion;
    private Integer id;
    private Integer id_cliente;
    private EstadoBienInmueble estado;
    private Double precio;
    private String direccion;
    private TipoServicio servicio;

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Bien_Inmueble(String descripcion, Integer id, Integer id_cliente, EstadoBienInmueble estado, Double precio, String direccion, TipoServicio servicio) {
        this.descripcion = descripcion;
        this.id = id;
        this.id_cliente = id_cliente;
        this.estado = estado;
        this.precio = precio;
        this.direccion = direccion;
        this.servicio = servicio;
    }
}