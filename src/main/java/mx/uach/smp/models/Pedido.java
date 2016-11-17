package mx.uach.smp.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import mx.uach.smp.models.enums.EEstado;
import mx.uach.smp.models.genericos.BaseModel;

/**
 *
 * @author Erik David Zubia Hernández
 */
@Entity
@Table(name = "pedidos")
public class Pedido extends BaseModel{
    
    private Integer cantidad;
    
    @Column(name = "fecha_pedido")
    private Date fechaPedido;
    
    @Column(name = "fecha_entrega")
    private Date fechaEntrega;
    
    @Column(name = "costo_total")
    private Double costoTotal;
    
    private EEstado estado;
    
    @ManyToOne
    private Producto producto;
    
    @ManyToOne
    private Cliente cliente;

    public Pedido() {
    }

    public Pedido(Integer cantidad, 
            Date fechaPedido, 
            Date fechaEntrega, 
            Double costoTotal, 
            EEstado estado, 
            Producto producto, 
            Cliente cliente) {
        this.cantidad = cantidad;
        this.fechaPedido = fechaPedido;
        this.fechaEntrega = fechaEntrega;
        this.costoTotal = costoTotal;
        this.estado = estado;
        this.producto = producto;
        this.cliente = cliente;
    }

    public Pedido(Integer cantidad, 
            Date fechaPedido, 
            Date fechaEntrega, 
            Double costoTotal, 
            EEstado estado, 
            Producto producto, 
            Cliente cliente, 
            Long id) {
        super(id);
        this.cantidad = cantidad;
        this.fechaPedido = fechaPedido;
        this.fechaEntrega = fechaEntrega;
        this.costoTotal = costoTotal;
        this.estado = estado;
        this.producto = producto;
        this.cliente = cliente;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public EEstado getEstado() {
        return estado;
    }

    public void setEstado(EEstado estado) {
        this.estado = estado;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
}
