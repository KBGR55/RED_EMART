package modelo;

import java.util.Date;

/**
 *
 * @author  KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
public class Bien_Inmueble {
    private Integer id_Bien_Inmueble;
    private Integer id_direccion;
    private Integer id_descripcion;
    private Integer encargado_Captador;
    private Date fecha_ingreso;
    private Double precio;

    public Integer getId_Bien_Inmueble() {
        return id_Bien_Inmueble;
    }

    public void setId_Bien_Inmueble(Integer id_Bien_Inmueble) {
        this.id_Bien_Inmueble = id_Bien_Inmueble;
    }

    public Integer getId_direccion() {
        return id_direccion;
    }

    public void setId_direccion(Integer id_direccion) {
        this.id_direccion = id_direccion;
    }

    public Integer getId_descripcion() {
        return id_descripcion;
    }

    public void setId_descripcion(Integer id_descripcion) {
        this.id_descripcion = id_descripcion;
    }

    public Integer getEncargado_Captador() {
        return encargado_Captador;
    }

    public void setEncargado_Captador(Integer encargado_Captador) {
        this.encargado_Captador = encargado_Captador;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Bien_Inmueble(Integer id_Bien_Inmueble, Integer id_direccion, Integer id_descripcion, Integer encargado_Captador, Date fecha_ingreso, Double precio) {
        this.id_Bien_Inmueble = id_Bien_Inmueble;
        this.id_direccion = id_direccion;
        this.id_descripcion = id_descripcion;
        this.encargado_Captador = encargado_Captador;
        this.fecha_ingreso = fecha_ingreso;
        this.precio = precio;
    }

    public Bien_Inmueble() {
    }

}