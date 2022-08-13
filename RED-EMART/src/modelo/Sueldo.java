package modelo;

import java.util.Date;

/**
 *
 * @author KBGR55/Hilary-Madelein
 */
public class Sueldo {
    private Integer id_sueldo;
    private Integer id_empleado;
    private Date fecha_cobro;
    private Double sueldo_mensual;
    private Double monto_comisiones;
    private Double sueldo_mensual_Total;

    public Integer getId_sueldo() {
        return id_sueldo;
    }

    public void setId_sueldo(Integer id_sueldo) {
        this.id_sueldo = id_sueldo;
    }

    public Integer getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(Integer id_empleado) {
        this.id_empleado = id_empleado;
    }

    public Date getFecha_cobro() {
        return fecha_cobro;
    }

    public void setFecha_cobro(Date fecha_cobro) {
        this.fecha_cobro = fecha_cobro;
    }

    public Double getSueldo_mensual() {
        return sueldo_mensual;
    }

    public void setSueldo_mensual(Double sueldo_mensual) {
        this.sueldo_mensual = sueldo_mensual;
    }

    public Double getMonto_comisiones() {
        return monto_comisiones;
    }

    public void setMonto_comisiones(Double monto_comisiones) {
        this.monto_comisiones = monto_comisiones;
    }

    public Double getSueldo_mensualTotal() {
        return sueldo_mensual_Total;
    }

    public void setSueldo_mensual_Total(Double sueldo_mensual_Total) {
        this.sueldo_mensual_Total = sueldo_mensual_Total;
    }

    public Sueldo(Integer id_sueldo, Integer id_empleado, Date fecha_cobro, Double sueldo_mensual, Double monto_comisiones, Double sueldo_mensual_Total) {
        this.id_sueldo = id_sueldo;
        this.id_empleado = id_empleado;
        this.fecha_cobro = fecha_cobro;
        this.sueldo_mensual = sueldo_mensual;
        this.monto_comisiones = monto_comisiones;
        this.sueldo_mensual_Total = sueldo_mensual_Total;
    }

    public Sueldo() {
    }
    
}