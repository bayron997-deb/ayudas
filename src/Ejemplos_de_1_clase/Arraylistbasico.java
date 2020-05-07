package Ejemplos_de_1_clase;
import java.util.ArrayList;

public class Arraylistbasico {
    public static void main(String[] args) {
        ArrayList <String> palabras = new ArrayList<>();
        imprimirArray(palabras);
        palabras.add("antonela");
        palabras.add("patricio");
        palabras.add("julia");
        palabras.add("andres");
        imprimirArray(palabras);
        palabras.remove(0);
        imprimirArray(palabras);
        palabras.remove(0);
        palabras.remove(0);
        imprimirArray(palabras);
        palabras.add("margarita");
        palabras.add("lucy");
        imprimirArray(palabras);
    }
    public static void imprimirArray(ArrayList<String> palabras){
        for (int i = 0; i < palabras.size(); i++) {
            System.out.println("n°"+(i+1)+": " +palabras.get(i));


        }
        System.out.println("-----------------------------");
    }
}
