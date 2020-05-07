package Editorial;

public class Libros {
    private String nombreL;
    private String RUT;
    private String tema;

    public Libros(String nombreL, String RUT, String tema) {
        this.nombreL = nombreL;
        this.RUT = RUT;
        this.tema = tema;
    }

    public String getNombreL() {
        return nombreL;
    }

    public void setNombreL(String nombreL) {
        this.nombreL = nombreL;
    }

    public String getRUT() {
        return RUT;
    }

    public void setRUT(String RUT) {
        this.RUT = RUT;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public String toString() {
        return "Libros{" + "nombreL=" + nombreL + ", RUT=" + RUT + ", tema=" + tema + '}';
    }
}
