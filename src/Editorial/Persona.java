package Editorial;

public class Persona {
    private String nombre;
    private String RUT;

    public Persona(String nombre, String RUT) {
        this.nombre = nombre;
        this.RUT = RUT;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRUT() {
        return RUT;
    }

    public void setRUT(String RUT) {
        this.RUT = RUT;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", RUT=" + RUT + '}';
    }
}
