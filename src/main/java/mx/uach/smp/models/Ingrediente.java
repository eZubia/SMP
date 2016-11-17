package mx.uach.smp.models;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import mx.uach.smp.models.genericos.BaseModel;

/**
 *
 * @author Erik David Zubia Hernández
 */
@Entity
@Table(name = "ingredientes")
public class Ingrediente extends BaseModel {
    
    @Column(name = "nombre_ingrediente")
    private String nombreIngrediente;
    
    private Double existencia;
    
    private String unidad;
    
    @Column(name = "costo_unidad")
    private Double costoUnidad;
    
    @ManyToOne
    private Proveedor proveedor;
    

    public Ingrediente() {
    }

    public Ingrediente(String nombreIngrediente, Double existencia, String unidad, Double costoUnidad, Proveedor proveedor) {
        this.nombreIngrediente = nombreIngrediente;
        this.existencia = existencia;
        this.unidad = unidad;
        this.costoUnidad = costoUnidad;
        this.proveedor = proveedor;
    }

    public Ingrediente(String nombreIngrediente, Double existencia, String unidad, Double costoUnidad, Proveedor proveedor, Long id) {
        super(id);
        this.nombreIngrediente = nombreIngrediente;
        this.existencia = existencia;
        this.unidad = unidad;
        this.costoUnidad = costoUnidad;
        this.proveedor = proveedor;
    }

    public String getNombreIngrediente() {
        return nombreIngrediente;
    }

    public void setNombreIngrediente(String nombreIngrediente) {
        this.nombreIngrediente = nombreIngrediente;
    }

    public Double getExistencia() {
        return existencia;
    }

    public void setExistencia(Double existencia) {
        this.existencia = existencia;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public Double getCostoUnidad() {
        return costoUnidad;
    }

    public void setCostoUnidad(Double costoUnidad) {
        this.costoUnidad = costoUnidad;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    
    
}
