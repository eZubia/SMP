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
@Table(name = "clientes")
public class Cliente extends BaseModel{
    
    private String nombre;
    
    @Column(name = "apellido_paterno")
    private String apellidoPaterno;
    
    @Column(name = "apellido_materno")
    private String apellidoMaterno;
    
    private String direccion;
    
    private String telefono;

    public Cliente() {
    }

    public Cliente(String nombre, String apellidoPaterno, String apellidoMaterno, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Cliente(String nombre, String apellidoPaterno, String apellidoMaterno, String direccion, String telefono, Long id) {
        super(id);
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
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
