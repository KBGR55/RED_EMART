package modelo;

/**
 *
 * @author  KBGR55/Hilary-Madelein
 */
public class Factura_Venta {
    private Integer id_venta;
    private byte[] documento;
    private String nombre_documento;

    public Integer getId_venta() {
        return id_venta;
    }

    public void setId_venta(Integer id_venta) {
        this.id_venta = id_venta;
    }

    public byte[] getDocumento() {
        return documento;
    }

    public void setDocumento(byte[] documento) {
        this.documento = documento;
    }

    public String getNombre_documento() {
        return nombre_documento;
    }

    public void setNombre_documento(String nombre_documento) {
        this.nombre_documento = nombre_documento;
    }

    public Factura_Venta(Integer id_venta, byte[] documento, String nombre_documento) {
        this.id_venta = id_venta;
        this.documento = documento;
        this.nombre_documento = nombre_documento;
    }

    public Factura_Venta() {
    }
    
}