
package control;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.validation.constraints.NotNull;

@Named(value = "cCarro") @RequestScoped
public class CtrlCarro {
    @NotNull(message = "{seleccioneUno}")
    private Carro carro;
    private String imagen;
    private String nombre;
    public Carro getCarro() {
        return carro;
    }
    public void setCarro(Carro carro) {
        this.carro = carro;
    }
    public String getImagen() {
        return imagen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void muestra(){
        switch (carro) {
            case JETTA:
                imagen="resources/imagenes/jetta.jpg";
                
            break;
            case SONIC:
                imagen="resources/imagenes/sonic.png";
                
            break;
            case VOCHO:
                imagen="resources/imagenes/VOCHO.jpg";
                
            break;
            case ASTONMARTIN:
                imagen="resources/imagenes/ASTONMARTIN.gif";
                
            break;
            case FERRARI:
                imagen="resources/imagenes/ferrari.jpg";
                
            break;
            case SENTRA:
                imagen="resources/imagenes/sentra.jpg";
                
            break;
            case LINCOLN:
                imagen="resources/imagenes/lincoln.jpg";
                
            break;
        }
    }
}
