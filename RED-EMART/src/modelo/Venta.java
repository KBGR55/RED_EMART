package modelo;

import java.util.Date;

/**
 *
 * @author KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
public class Venta {
    private Integer id_venta;
    private Integer id_cliente;
    private Integer id_bien_inmueble;
    private Integer encargado_Despachador;
    private Date fecha;
    private Double precio_total_pagar;

    public Integer getId_venta() {
        return id_venta;
    }

    public void setId_venta(Integer id_venta) {
        this.id_venta = id_venta;
    }

    public Integer getEncargado_Despachador() {
        return encargado_Despachador;
    }

    public void setEncargado_Despachador(Integer encargado_Despachador) {
        this.encargado_Despachador = encargado_Despachador;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Integer getId_bien_inmueble() {
        return id_bien_inmueble;
    }

    public void setId_bien_inmueble(Integer id_bien_inmueble) {
        this.id_bien_inmueble = id_bien_inmueble;
    }
    

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getPrecio_total_pagar() {
        return precio_total_pagar;
    }

    public void setPrecio_total_pagar(Double precio_total_pagar) {
        this.precio_total_pagar = precio_total_pagar;
    }

    public Venta(Integer id_venta, Integer id_cliente, Integer id_bien_inmueble, Integer encargado_Despachador, Date fecha, Double precio_total_pagar) {
        this.id_venta = id_venta;
        this.id_cliente = id_cliente;
        this.id_bien_inmueble = id_bien_inmueble;
        this.encargado_Despachador = encargado_Despachador;
        this.fecha = fecha;
        this.precio_total_pagar = precio_total_pagar;
    }

    public Venta() {
    }
}