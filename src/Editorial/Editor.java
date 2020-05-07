package Editorial;

public class Editor {
    private String tematica;

    public Editor(String tematica) {
        this.tematica = tematica;
    }

    public Editor(String tematica, String nombre, String RUT) {
        super(nombre, RUT);
        this.tematica = tematica;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    @Override
    public String toString() {
        return "Editor{" + "tematica=" + tematica + '}';
    }
}
