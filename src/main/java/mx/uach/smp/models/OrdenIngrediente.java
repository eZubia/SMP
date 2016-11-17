package mx.uach.smp.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import jdk.management.resource.internal.TotalResourceContext;
import mx.uach.smp.models.genericos.BaseModel;

/**
 *
 * @author Erik David Zubia Hernández
 */
@Entity
@Table(name = "ordenes_ingredientes")
public class OrdenIngrediente extends BaseModel {
    
    @Column(name = "cantidad_pedida")
    private Double cantidadPedida;
    
    @Column(name = "fecha_pedido")
    private Date fechaPedido;
    
    @Column(name = "total_pedido")
    private Double totalPedido;

    public OrdenIngrediente() {
    }

    public OrdenIngrediente(Double cantidadPedida, Date fechaPedido, Double totalPedido) {
        this.cantidadPedida = cantidadPedida;
        this.fechaPedido = fechaPedido;
        this.totalPedido = totalPedido;
    }

    public OrdenIngrediente(Double cantidadPedida, Date fechaPedido, Double totalPedido, Long id) {
        super(id);
        this.cantidadPedida = cantidadPedida;
        this.fechaPedido = fechaPedido;
        this.totalPedido = totalPedido;
    }

    public Double getCantidadPedida() {
        return cantidadPedida;
    }

    public void setCantidadPedida(Double cantidadPedida) {
        this.cantidadPedida = cantidadPedida;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Double getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(Double totalPedido) {
        this.totalPedido = totalPedido;
    }
    
    
    
}
