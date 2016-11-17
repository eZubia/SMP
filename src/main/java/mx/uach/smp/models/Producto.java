package mx.uach.smp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import mx.uach.smp.models.genericos.BaseModel;

/**
 *
 * @author Erik David Zubia Hernández
 */
@Entity
@Table(name = "productos")
public class Producto extends BaseModel{
    
    @Column(name = "nombre_producto")
    private String nombreProducto;
    
    @Column(name = "precion_unitario")
    private Double precioUnitario;

    public Producto() {
    }

    public Producto(String nombreProducto, Double precioUnitario) {
        this.nombreProducto = nombreProducto;
        this.precioUnitario = precioUnitario;
    }

    public Producto(String nombreProducto, Double precioUnitario, Long id) {
        super(id);
        this.nombreProducto = nombreProducto;
        this.precioUnitario = precioUnitario;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
    
}
