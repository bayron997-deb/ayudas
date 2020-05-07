package CuantaBancaria;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("RUT");
        Cuenta cuenta2 = new Cuenta("Cuenta Corriente", 5000);
        Cuenta cuenta3 = new Cuenta("Ahorro niño", 6000, 100);


        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);



    }
    public static void showPersonas(Persona[] p){
        for (int i=0;i<p.length;i++)
            System.out.println("---------------"+i+"-------------");
    }
}
