package modelo;

/**
 *
 * @author KBGR55/Hilary-Madelein
 */
public class Descripcion_BienInmueble {
    private Integer id_descripcion;
    private String id_tipo_bien;
    private Double metros_cuadrados;
    private String color;
    private Integer n_pisos;
    private Integer n_cuartos;
    private String amueblado;
    private String ascensor;
    private String piscina;

    public Integer getId_descripcion() {
        return id_descripcion;
    }

    public void setId_descripcion(Integer id_descripcion) {
        this.id_descripcion = id_descripcion;
    }

    public String getId_tipo_bien() {
        return id_tipo_bien;
    }

    public void setId_tipo_bien(String id_tipo_bien) {
        this.id_tipo_bien = id_tipo_bien;
    }

    public Double getMetros_cuadrados() {
        return metros_cuadrados;
    }

    public void setMetros_cuadrados(Double metros_cuadrados) {
        this.metros_cuadrados = metros_cuadrados;
    }

    public Integer getN_pisos() {
        return n_pisos;
    }

    public void setN_pisos(Integer n_pisos) {
        this.n_pisos = n_pisos;
    }

    public Integer getN_cuartos() {
        return n_cuartos;
    }

    public void setN_cuartos(Integer n_cuartos) {
        this.n_cuartos = n_cuartos;
    }

    public String getAmueblado() {
        return amueblado;
    }

    public void setAmueblado(String amueblado) {
        this.amueblado = amueblado;
    }

    public String getAscensor() {
        return ascensor;
    }

    public void setAscensor(String ascensor) {
        this.ascensor = ascensor;
    }

    public String getPiscina() {
        return piscina;
    }

    public void setPiscina(String piscina) {
        this.piscina = piscina;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Descripcion_BienInmueble(Integer id_descripcion, String id_tipo_bien, Double metros_cuadrados, String color, Integer n_pisos, Integer n_cuartos, String amueblado, String ascensor, String piscina) {
        this.id_descripcion = id_descripcion;
        this.id_tipo_bien = id_tipo_bien;
        this.metros_cuadrados = metros_cuadrados;
        this.color = color;
        this.n_pisos = n_pisos;
        this.n_cuartos = n_cuartos;
        this.amueblado = amueblado;
        this.ascensor = ascensor;
        this.piscina = piscina;
    }

    public Descripcion_BienInmueble() {
    }
    
}