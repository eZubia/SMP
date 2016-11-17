package mx.uach.smp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import mx.uach.smp.models.genericos.BaseModel;

/**
 *
 * @author Erik David Zubia Hernández
 */
@Entity
@Table(name = "recetas")
public class Receta extends BaseModel {
    
    @Column(name = "tiempo_coccion")
    private Integer tiempoCoccion;
    
    private Integer producidos;
    
    private String descripcion;
    
    @OneToOne
    private Producto producto;

    public Receta() {
    }

    public Receta(Integer tiempoCoccion, Integer producidos, String descripcion, Producto producto) {
        this.tiempoCoccion = tiempoCoccion;
        this.producidos = producidos;
        this.descripcion = descripcion;
        this.producto = producto;
    }

    public Receta(Integer tiempoCoccion, Integer producidos, String descripcion, Producto producto, Long id) {
        super(id);
        this.tiempoCoccion = tiempoCoccion;
        this.producidos = producidos;
        this.descripcion = descripcion;
        this.producto = producto;
    }

    public Integer getTiempoCoccion() {
        return tiempoCoccion;
    }

    public void setTiempoCoccion(Integer tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }

    public Integer getProducidos() {
        return producidos;
    }

    public void setProducidos(Integer producidos) {
        this.producidos = producidos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    
}
