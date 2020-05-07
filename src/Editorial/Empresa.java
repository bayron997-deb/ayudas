package Editorial;

public class Empresa {
    private String telefono;

    public Empresa(String telefono, String nombre, String RUT) {
        super(nombre, RUT);
        this.telefono = telefono;
    }

    public Empresa(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Empresa{" + "telefono=" + telefono + getNombre() + getRUT() + '}';
    }
}
