package Editorial;

public class Main {
    public static void main(String[] args) {
Menu menu = new Menu();
        GestorArchivo.crearLibro();
        GestorArchivo.crearRevistas();
        GestorArchivo.crearArticulos();
        menu.Menu();
    }
}
