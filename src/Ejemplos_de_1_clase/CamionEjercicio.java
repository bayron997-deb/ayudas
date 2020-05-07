package Ejemplos_de_1_clase;

import java.util.Scanner;

public class CamionEjercicio {
    public static void main(String[] args) {

        int precio;
        int km;
        int rendimiento = 23;
        int carga;
        int ejecucion;
        int ciudad1, ciudad2, ciudad3;
        int ciudad;
        int viajeC1 = 0, viajeC2 = 0, viajeC3 = 0;
        int gastototal = 0;
        int camion1 = 0, camion2 = 0;
        int vcamion1 = 0, vcamion2 = 0;

        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Ingresa los kilometros de ciudad1");
            ciudad1 = teclado.nextInt();
            if (ciudad1 < 0) {
                System.out.println("¡Ingrese un valor valido!");
            }
        } while (ciudad1 < 0);

        do {
            System.out.println("Ingresa los kilometros de ciudad2");
            ciudad2 = teclado.nextInt();
            if (ciudad2 < 0) {
                System.out.println("¡Ingrese un valor valido!");
            }
        } while (ciudad2 < 0);

        do {
            System.out.println("Ingresa los kilometros de ciudad3");
            ciudad3 = teclado.nextInt();
            if (ciudad3 < 0) {
                System.out.println("¡Ingrese un valor valido!");
            }
        } while (ciudad3 < 0);

        precio = -1;
        while (precio <= 0) {
            System.out.println("Ingresa el precio del combustible");
            precio = teclado.nextInt();
            if (precio < 0) {
                System.out.println("¡Ingrese un valor valido!");
            }
        }

        do {
            System.out.println("Ingrese numero de la ciudad");
            ciudad = teclado.nextInt();
            switch (ciudad) {
                case 1:
                    km = ciudad1;
                    viajeC1++;
                    break;
                case 2:
                    km = ciudad2;
                    viajeC2++;
                    break;
                case 3:
                    km = ciudad3;
                    viajeC3++;
                    break;
                default:
                    System.out.println("Ciudad seleccionada invalida");
                    km = 0;

            }

            do {
                System.out.println("Ingresa peso de la carga");
                carga = teclado.nextInt();
                if (carga < 0 || carga > 200) {
                    System.out.println("¡Ingrese un valor entre 1 y 200!");
                }
            } while (carga < 0 || carga > 200);

            if (carga >= 0 && carga <= 100) {
                System.out.println("Se utilizará el camion pequeño");
                camion1 += km;
                vcamion1++;
            } else if (carga >= 101 && carga <= 200) {
                System.out.println("Se utilizará el camion grande");
                camion2 += km;
                vcamion2++;
            } else {
                System.out.println("Valor de carga invalido");
            }

            int total = precio * km / rendimiento;
            gastototal += total;

            int totalcombustible = km / rendimiento;
            System.out.println("El total es: $" + total);

            System.out.println("ingrese 0 para finalizar el programa o ingrese otro valor para realizar otro calculo");
            ejecucion = teclado.nextInt();

        } while (ejecucion != 0);

        System.out.println("\n-------------\n");
        System.out.println("viajes Ciudad 1: " + viajeC1);
        System.out.println("viajes Ciudad 2: " + viajeC2);
        System.out.println("viajes Ciudad 3: " + viajeC3);
        System.out.println("viajes totales: " + (viajeC1 + viajeC2 + viajeC3));
        System.out.println("n---------------\n");
        System.out.println("Gasto toal: " + gastototal);
        System.out.println("n---------------\n");
        System.out.println("Kilometraje total: " + camion1 + camion2);
        if (vcamion1 > vcamion2) {
            System.out.println("Camion pequeño viajo " + vcamion1 + "veces.");
            System.out.println("recorrio " + camion1);
        } else if (vcamion1 < vcamion2) {
            System.out.println("Camion grande viajo " + vcamion2 + "veces.");
            System.out.println("recorrio " + camion2 + "km");
        } else {
            System.out.println("Ambos recorrieron " + vcamion1 + " veces.");
            System.out.println("camion pequeño recorrio " + camion1 + " km");
            System.out.println("camion grande recorrio " + camion2 + " km");
        }
        System.out.println("\n---------------\n");
    }

}

