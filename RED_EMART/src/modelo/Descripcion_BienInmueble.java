package modelo;

/**
 *
 * @author KBGR55/Hilary-Madelein
 */
public class Descripcion_BienInmueble {
    private Integer id_descripcion;
    private Integer id_tipo_bien;
    private String metros_cuadrados;
    private Integer n_pisos;
    private Integer n_cuartos;
    private Double amueblado;
    private Double ascensor;
    private Double piscina;

    public Integer getId_descripcion() {
        return id_descripcion;
    }

    public void setId_descripcion(Integer id_descripcion) {
        this.id_descripcion = id_descripcion;
    }

    public Integer getId_tipo_bien() {
        return id_tipo_bien;
    }

    public void setId_tipo_bien(Integer id_tipo_bien) {
        this.id_tipo_bien = id_tipo_bien;
    }

    public String getMetros_cuadrados() {
        return metros_cuadrados;
    }

    public void setMetros_cuadrados(String metros_cuadrados) {
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

    public Double getAmueblado() {
        return amueblado;
    }

    public void setAmueblado(Double amueblado) {
        this.amueblado = amueblado;
    }

    public Double getAscensor() {
        return ascensor;
    }

    public void setAscensor(Double ascensor) {
        this.ascensor = ascensor;
    }

    public Double getPiscina() {
        return piscina;
    }

    public void setPiscina(Double piscina) {
        this.piscina = piscina;
    }

    public Descripcion_BienInmueble(Integer id_descripcion, Integer id_tipo_bien, String metros_cuadrados, Integer n_pisos, Integer n_cuartos, Double amueblado, Double ascensor, Double piscina) {
        this.id_descripcion = id_descripcion;
        this.id_tipo_bien = id_tipo_bien;
        this.metros_cuadrados = metros_cuadrados;
        this.n_pisos = n_pisos;
        this.n_cuartos = n_cuartos;
        this.amueblado = amueblado;
        this.ascensor = ascensor;
        this.piscina = piscina;
    }

    public Descripcion_BienInmueble() {
    }
    
}