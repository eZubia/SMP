package mx.uach.smp.models.enums;

/**
 *
 * @author Erik David Zubia Hernández
 */
public enum EEstado {
    
    PEDIDO("Pedido"),
    TERMINADO("Terminado"),
    ENTREGADO("Entregado");
    
    private String descripcion;

    private EEstado(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    
    
}
