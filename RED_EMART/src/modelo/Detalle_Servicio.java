package modelo;

/**
 *
 * @author  KBGR55/Hilary-Madelein
 */
public class Detalle_Servicio {
    private Integer id_servicio;
    private Integer id_BienInmueble;
    private Integer id_venta;
    private Integer cantidad;
    private double precio_unitario;
    private double precio_total;

    public Integer getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(Integer id_servicio) {
        this.id_servicio = id_servicio;
    }

    public Integer getId_BienInmueble() {
        return id_BienInmueble;
    }

    public void setId_BienInmueble(Integer id_BienInmueble) {
        this.id_BienInmueble = id_BienInmueble;
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

    public double getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(double precio_total) {
        this.precio_total = precio_total;
    }

    public Detalle_Servicio(Integer id_servicio, Integer id_BienInmueble, Integer id_venta, Integer cantidad, double precio_unitario, double precio_total) {
        this.id_servicio = id_servicio;
        this.id_BienInmueble = id_BienInmueble;
        this.id_venta = id_venta;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
        this.precio_total = precio_total;
    }

    public Detalle_Servicio() {
    }
}