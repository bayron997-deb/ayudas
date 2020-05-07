
package Ejemplos_de_1_clase;




import java.util.Scanner;

// entradas:    precio de combustible
//              kilometros que recorre
//              carga
//              (c)rendimiento
//              opción de ejecución
//              ciudades
// proceso:     calcular costo con el rendimiento, 
//              el precio de combustible y kilometros recorridos
// Salida:      dinero utilizado
//              que camion se utiliza
//              total de combustible
//              contador para viajes totales
//              contador para viajes por ciudad
//              gasto total
//              kmtotal
//              contador para camion
//              km por camion
/**
 *
 * @author pacho
 */
public class CAMION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          //declarar entrada por tecladoScanner teclado = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        
        // declaración de variables
        int vCombustible;
        int km;
        int rendimiento = 23;
        int total;
        int carga;
        int opcion;
        int c1, c2, c3;
        int ciudad;
        int totalCombustible;
        int viajeC1 = 0, viajeC2 = 0, viajeC3 = 0;
        int gastoTotal = 0;
        int camion1=0, camion2=0;
        int kmCamion1=0, kmCamion2=0;
        int kmtotal;
        
        //Loop para ingresar valores positivos para el combustible
        do {
            System.out.println("Ingresa el valor del combustible");
            vCombustible = teclado.nextInt();
        } while (vCombustible < 0);

        
        //Loop para ingresar valores positivos para los kilometros a la ciudad 1
        c1 = -1;
        while (c1 < 0) {
            System.out.println("Ingresa los km a Ciudad 1");
            c1 = teclado.nextInt();
        }
        
        //Loop para ingresar valores positivos para los kilometros a la ciudad 2
        c2 = -1;
        while (c2 < 0) {
            System.out.println("Ingresa los km a Ciudad 2");
            c2 = teclado.nextInt();
        }
        
        //Loop para ingresar valores positivos para los kilometros a la ciudad 3
        c3 = -1;
        while (c3 < 0) {
            System.out.println("Ingresa los km a Ciudad 3");
            c3 = teclado.nextInt();
        }
        
        //Loop para ejecutar el programa de forma indefinida
        do {

            
            System.out.println("Ingresa el numero de la ciudad");
            ciudad = teclado.nextInt();

            //selección de ciudad
            switch (ciudad) {
                case 1:
                    km = c1;
                    viajeC1++;
                    break;
                case 2:
                    km = c2;
                    viajeC2++;
                    break;
                case 3:
                    km = c3;
                    viajeC3++;
                    break;
                default:
                    km = 0;
            }

            //Loop para ingresar valores positivos para el peso de la carga
            do {
                System.out.println("Ingresa el peso de la carga");
                carga = teclado.nextInt();
            } while (carga < 0 || carga > 200);
            
            total = vCombustible * km / rendimiento;
            totalCombustible = km / rendimiento;

            //Selección del camión
            if (carga <= 100 && carga > 0) {
                System.out.println("Se utiliza el camion pequeño");
                camion1++;
                kmCamion1+=km;
            } else {
                System.out.println("Se utiliza el camion grande");
                camion2++;
                kmCamion2+=km;
            }

            //resumen de la iteración
            System.out.println("El valor total es: " + total);
            gastoTotal += total;
            System.out.println("El total de combustible es: " + totalCombustible);

            System.out.println("Ingrese 0 para finalizar");
            opcion = teclado.nextInt();

        } while (opcion != 0);

        
        //Reporte de viajes
        System.out.println("\n--------------------------------------\n");
        System.out.println("viajes a c1: " + viajeC1);
        System.out.println("viajes a c2: " + viajeC2);
        System.out.println("viajes a c3: " + viajeC3);
        System.out.println("total viajes: " + viajeC1 + viajeC2 + viajeC3);
        System.out.println("\n--------------------------------------\n");
        System.out.println("El gasto total fue de: "+gastoTotal);
        System.out.println("\n--------------------------------------\n");
        System.out.println("n° viajes camion pequeño: "+camion1);
        System.out.println("n° viajes camion grande: "+camion2);
        
        //mostrar el camion con más recorridos
        if(camion1<camion2){
            System.out.println("El camion grande viajo más veces");
            System.out.println(" km: "+kmCamion2);
        }else if(camion1>camion2){
            System.out.println("El camion pequeño viajo más veces");
            System.out.println(" km: "+kmCamion1);
        }else{
            System.out.println("Ambos camiones viajaron el mismo nuemero de veces");
            System.out.println("camion pequeño km: "+kmCamion1);
            System.out.println("camion grande km: "+kmCamion2);
        }
        kmtotal=kmCamion1+kmCamion2;
        System.out.println("kilometros totales: "+ kmtotal);
        
    }
}
         



   
       
                                
      
    


    

