package Editorial;

public class Revistas {
    private String nombreR;
    private String nombre;
    private String tema;

    public Revistas(String nombreR, String nombre, String tema) {
        this.nombreR = nombreR;
        this.nombre = nombre;
        this.tema = tema;
    }

    public String getNombreR() {
        return nombreR;
    }

    public void setNombreR(String nombreR) {
        this.nombreR = nombreR;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public String toString() {
        return "Revistas{" + "nombreR=" + nombreR + ", nombre=" + nombre + ", tema=" + tema + '}';
    }
}
