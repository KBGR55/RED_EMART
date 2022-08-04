package modelo;

import java.util.Date;

/**
 *
 * @author KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
public class Venta {
    private Integer id;
    private Integer encargado_Despachador;
    private Integer encargado_Captador;
    private Integer id_bienInmueble;
    private Date fecha;
    private Integer id_Cliente;

    public Integer getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(Integer id_Cliente) {
        this.id_Cliente = id_Cliente;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getId_bienInmueble() {
        return id_bienInmueble;
    }

    public void setId_bienInmueble(Integer id_bienInmueble) {
        this.id_bienInmueble = id_bienInmueble;
    }

    public Integer getEncargado_Despachador() {
        return encargado_Despachador;
    }

    public void setEncargado_Despachador(Integer encargado_Despachador) {
        this.encargado_Despachador = encargado_Despachador;
    }

    public Integer getEncargado_Captador() {
        return encargado_Captador;
    }

    public void setEncargado_Captador(Integer encargado_Captador) {
        this.encargado_Captador = encargado_Captador;
    }

    public Venta() {
    }

    public Venta(Integer id, Integer encargado_Despachador, Integer encargado_Captador, Integer id_bienInmueble, Date fecha, Integer id_Cliente) {
        this.id = id;
        this.encargado_Despachador = encargado_Despachador;
        this.encargado_Captador = encargado_Captador;
        this.id_bienInmueble = id_bienInmueble;
        this.fecha = fecha;
        this.id_Cliente = id_Cliente;
    }
}
