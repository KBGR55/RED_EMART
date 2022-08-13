package modelo;

/**
 *
 * @author  KBGR55/Hilary-Madelein
 */
public class Detalle_Servicio {
    private Integer id_servicio;
    private Integer id_Bien_Inmueble;
    private Integer id_venta;
    private Integer cantidad;
    private double precio_unitario;

    public Integer getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(Integer id_servicio) {
        this.id_servicio = id_servicio;
    }

    public Integer getId_Bien_Inmueble() {
        return id_Bien_Inmueble;
    }

    public void setId_Bien_Inmueble(Integer id_Bien_Inmueble) {
        this.id_Bien_Inmueble = id_Bien_Inmueble;
    }

    public Integer getId_venta() {
        return id_venta;
    }

    public void setId_venta(Integer id_venta) {
        this.id_venta = id_venta;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public Detalle_Servicio(Integer id_servicio, Integer id_Bien_Inmueble, Integer id_venta, Integer cantidad, double precio_unitario) {
        this.id_servicio = id_servicio;
        this.id_Bien_Inmueble = id_Bien_Inmueble;
        this.id_venta = id_venta;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
    }

    public Detalle_Servicio() {
    }
    
}