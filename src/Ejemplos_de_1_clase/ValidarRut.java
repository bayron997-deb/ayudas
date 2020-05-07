package Ejemplos_de_1_clase;

import java.util.Scanner;

public class ValidarRut {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String rut = "";
        boolean valido = false;
        System.out.println("Ingresa un rut");
        rut = teclado.next();
        valido = validarRut(rut);
        if (valido) {
            System.out.println("rut valido");
        } else {
            System.out.println("rut invalido");
        }
    }

    private static boolean validarRut(String rut) {
        boolean valido = false;
        try {
            rut = rut.toUpperCase();
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));
            char dv = rut.charAt(rut.length() - 1);
            int m = 0, s = 1;
            for (; rutAux != 0; rutAux /= 10) {
                s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;

            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                valido = true;
            }
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Formato incorrecto");
        } catch (Exception e) {
            System.out.println("");
        }

        return valido;
    }
}
