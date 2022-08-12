package modelo;

import java.util.Date;

/**
 *
 * @author KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
public class Venta {
    private Integer id_venta;
    private Integer id_cliente;
    private Integer encargado_Despachador;
    private Date fecha;
    private Integer precio_total_pagar;

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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getPrecio_total_pagar() {
        return precio_total_pagar;
    }

    public void setPrecio_total_pagar(Integer precio_total_pagar) {
        this.precio_total_pagar = precio_total_pagar;
    }

    public Venta(Integer id_venta, Integer encargado_Despachador, Integer id_cliente, Date fecha, Integer precio_total_pagar) {
        this.id_venta = id_venta;
        this.encargado_Despachador = encargado_Despachador;
        this.id_cliente = id_cliente;
        this.fecha = fecha;
        this.precio_total_pagar = precio_total_pagar;
    }

    public Venta() {
    }
}