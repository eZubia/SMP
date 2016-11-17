package mx.uach.smp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import mx.uach.smp.models.genericos.BaseModel;

/**
 * Estructura de un usuario dentro del sistema.
 * 
 * @author Erik David Zubia Hernández
 * @version 1.0
 * @since 15/11/2016
 */
@Entity
@Table(name = "usuarios")
public class Usuario extends BaseModel{
    
    @Column(name = "nombre_usuario")
    private String nombreUsuario;
    private String contrasena;

    public Usuario() {
    }

    public Usuario(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    public Usuario(String nombreUsuario, String contrasena, Long id) {
        super(id);
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    
    
}
