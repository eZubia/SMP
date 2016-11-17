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
@Table(name = "proveedores")
public class Proveedor extends BaseModel {
    
    @Column(name = "razon_social")
    private String razonSocila;
    
    private String rfc;
    
    private String direccion;
    
    private String telefono;

    public Proveedor() {
    }

    public Proveedor(String razonSocila, String rfc, String direccion, String telefono) {
        this.razonSocila = razonSocila;
        this.rfc = rfc;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Proveedor(String razonSocila, String rfc, String direccion, String telefono, Long id) {
        super(id);
        this.razonSocila = razonSocila;
        this.rfc = rfc;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getRazonSocila() {
        return razonSocila;
    }

    public void setRazonSocila(String razonSocila) {
        this.razonSocila = razonSocila;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
