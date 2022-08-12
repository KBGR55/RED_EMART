package modelo;

/**
 *
 * @author  KBGR55/Hilary-Madelein
 */
public class Direccion {
    private Integer id_direccion;
    private Integer id_lugar;
    private String calle_principal;
    private String calle_secundaria;

    public Integer getId_direccion() {
        return id_direccion;
    }

    public void setId_direccion(Integer id_direccion) {
        this.id_direccion = id_direccion;
    }

    public Integer getId_lugar() {
        return id_lugar;
    }

    public void setId_lugar(Integer id_lugar) {
        this.id_lugar = id_lugar;
    }

    public String getCalle_principal() {
        return calle_principal;
    }

    public void setCalle_principal(String calle_principal) {
        this.calle_principal = calle_principal;
    }

    public String getCalle_secundaria() {
        return calle_secundaria;
    }

    public void setCalle_secundaria(String calle_secundaria) {
        this.calle_secundaria = calle_secundaria;
    }

    public Direccion(Integer id_direccion, Integer id_lugar, String calle_principal, String calle_secundaria) {
        this.id_direccion = id_direccion;
        this.id_lugar = id_lugar;
        this.calle_principal = calle_principal;
        this.calle_secundaria = calle_secundaria;
    }

    public Direccion() {
    }

}