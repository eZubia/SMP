package mx.uach.smp.models.genericos;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Estructura de un modelo general para el sistema.
 * 
 * @author Erik David Zubia Hernández
 * @since 15/11/2016
 */
@MappedSuperclass
public abstract class BaseModel implements Serializable {

    @Id
    
    private Long id;

    /**
     * Constructor vacío.
     */
    public BaseModel() {
    }

    /**
     * Constructor con los parámetros necesarios.
     * 
     * @param id  {@code Integer} identificador del objeto
     */
    public BaseModel(Long id) {
        this.id = id;
    }

    /**
     * Consigue el identificador del objeto.
     */
    public Long getId() {
        return id;
    }

    /**
     * Asigna un identificador al objeto.
     * 
     * @param id {@code Integer} identificador del objeto 
     */
    public void setId(Long id) {
        this.id = id;
    }
    
}
