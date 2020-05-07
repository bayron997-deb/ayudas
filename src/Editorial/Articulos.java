package Editorial;

public class Articulos {
    private String nombreA;
    private String RUT;

    public Articulos(String nombreA, String RUT) {
        this.nombreA = nombreA;
        this.RUT = RUT;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public String getRUT() {
        return RUT;
    }

    public void setRUT(String RUT) {
        this.RUT = RUT;
    }

    @Override
    public String toString() {
        return "Articulos{" + "nombreA=" + nombreA + ", RUT=" + RUT + '}';
    }
}
