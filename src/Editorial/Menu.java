package Editorial;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Menu {
    public static void Menu(){
        Scanner teclado = new Scanner(System.in);
        int op = 0;
        while(op==0){
            System.out.println("Seleccione opcion");
            System.out.println("1. Registro de Libros");
            System.out.println("2. Registro de Revistas");
            System.out.println("3. Registro de artículos");
            System.out.println("4. Registro de autores");
            System.out.println("5. Registro de empresas");
            System.out.println("6. Registro de editores");
            int opcn = teclado.nextInt();
            while (opcn > 6) {
                System.out.println("opcion invalida");
                opcn = teclado.nextInt();
            }
            opcn = teclado.nextInt();
            switch (opcn) {
                case 1:
                    System.out.println("Ingrese Nombre del libro");
                    String nombreL = teclado.next();
                    System.out.println("Ingrese 8 digitos del Rut del autor");
                    String RUT = teclado.next();
                    int longi = RUT.length();
                    while (longi > 8) {
                        System.out.println("rut invalido");
                        RUT = teclado.next();
                        longi = RUT.length();

                    }

                    while (longi < 8) {
                        System.out.println("rut invalido");
                        RUT = teclado.next();
                        longi = RUT.length();

                    }
                    int M = 0,
                            S = 1;
                    int T = Integer.parseInt(RUT);
                    for (; T != 0; T /= 10) {
                        S = (S + T % 10 * (9 - M++ % 6)) % 11;
                    }
                    System.out.println(RUT + "-" + (char) (S != 0 ? S + 47 : 75));
                    String Rut = RUT + "-" + (char) (S != 0 ? S + 47 : 75);

                    System.out.println("Ingrese tema");
                    String tema = teclado.next();
                    Libros p1 = new Libros(nombreL, Rut, tema);
                    Date date = new Date();
                    DateFormat hourdateFormat = new SimpleDateFormat("HH.mm.ss dd-MM-yyyy");
                    String historial = hourdateFormat.format(date);
                    String ruta = "Libros/" + historial + ".txt";
                    Path archivo = Paths.get(ruta);
                    String texto = "" + p1;
                    try {
                        Files.write(archivo, texto.getBytes());
                    } catch (IOException e) {
                        System.out.println("");
                    }
                    System.out.println("cuantos contadores tiene?");
                    int contador  = teclado.nextInt();
                    while (contador> 5) {
                        System.out.println("contador invalido");
                        contador = teclado.nextInt();
                    }
                    if(contador== 5){
                        System.out.println("aprobado");
                        ruta = "aprovados.txt";
                        archivo = Paths.get(ruta);
                        texto = "" + historial;
                        try {
                            Files.write(archivo, texto.getBytes());
                        } catch (IOException e) {
                            System.out.println("");
                        }
                    }else
                        System.out.println("no fue aprovado");


                    break;

                case 2:
                    System.out.println("Ingrese Nombre del libro");
                    String nombreR = teclado.next();
                    System.out.println("Ingrese 8 digitos del Rut del autor");
                    RUT = teclado.next();
                    longi = RUT.length();
                    while (longi > 8) {
                        System.out.println("rut invalido");
                        RUT = teclado.next();
                        longi = RUT.length();

                    }

                    while (longi < 8) {
                        System.out.println("rut invalido");
                        RUT = teclado.next();
                        longi = RUT.length();

                    }
                    M = 0;
                    S = 1;
                    T = Integer.parseInt(RUT);
                    for (; T != 0; T /= 10) {
                        S = (S + T % 10 * (9 - M++ % 6)) % 11;
                    }
                    System.out.println(RUT + "-" + (char) (S != 0 ? S + 47 : 75));
                    Rut = RUT + "-" + (char) (S != 0 ? S + 47 : 75);

                    System.out.println("Ingrese tema");
                    tema = teclado.next();
                    Revistas p2 = new Revistas(nombreR, Rut, tema);
                    date = new Date();
                    hourdateFormat = new SimpleDateFormat("HH.mm.ss dd-MM-yyyy");
                    historial = hourdateFormat.format(date);
                    ruta = "Revistas/" + historial + ".txt";
                    archivo = Paths.get(ruta);
                    texto = "" + p2;
                    try {
                        Files.write(archivo, texto.getBytes());
                    } catch (IOException e) {
                        System.out.println("");
                    }
                    System.out.println("cuantos contadores tiene?");
                    contador  = teclado.nextInt();
                    while (contador> 5) {
                        System.out.println("contador invalido");
                        contador = teclado.nextInt();
                    }
                    if(contador== 5){
                        System.out.println("aprobado");
                        ruta = "aprovados.txt";
                        archivo = Paths.get(ruta);
                        texto = "" + historial;
                        try {
                            Files.write(archivo, texto.getBytes());
                        } catch (IOException e) {
                            System.out.println("");
                        }
                    }else
                        System.out.println("no fue aprovado");



                    break;

                case 3:
                    System.out.println("Ingrese Nombre del Articulo");
                    String nombreA = teclado.next();
                    System.out.println("Ingrese 8 digitos del Rut del autor");
                    RUT = teclado.next();
                    longi = RUT.length();
                    while (longi > 8) {
                        System.out.println("rut invalido");
                        RUT = teclado.next();
                        longi = RUT.length();

                    }

                    while (longi < 8) {
                        System.out.println("rut invalido");
                        RUT = teclado.next();
                        longi = RUT.length();

                    }
                    M = 0;
                    S = 1;
                    T = Integer.parseInt(RUT);
                    for (; T != 0; T /= 10) {
                        S = (S + T % 10 * (9 - M++ % 6)) % 11;
                    }
                    System.out.println(RUT + "-" + (char) (S != 0 ? S + 47 : 75));
                    Rut = RUT + "-" + (char) (S != 0 ? S + 47 : 75);

                    Articulos p3 = new Articulos(nombreA, Rut);
                    date = new Date();
                    hourdateFormat = new SimpleDateFormat("HH.mm.ss dd-MM-yyyy");
                    historial = hourdateFormat.format(date);
                    ruta = "Articulos/" + historial + ".txt";
                    archivo = Paths.get(ruta);
                    texto = "" + p3;
                    try {
                        Files.write(archivo, texto.getBytes());
                    } catch (IOException e) {
                        System.out.println("");
                    }
                    System.out.println("cuantos contadores tiene?");
                    contador  = teclado.nextInt();
                    while (contador> 5) {
                        System.out.println("contador invalido");
                        contador = teclado.nextInt();
                    }
                    if(contador== 5){
                        System.out.println("aprobado");
                        ruta = "aprovados.txt";
                        archivo = Paths.get(ruta);
                        texto = "" + historial;
                        try {
                            Files.write(archivo, texto.getBytes());
                        } catch (IOException e) {
                            System.out.println("");
                        }
                    }else
                        System.out.println("no fue aprovado");

                    break;
                case 4:
                    System.out.println("Ingresar nombre del autor");
                    String nombre = teclado.next();
                    System.out.println("Ingrese rut del autor");
                    RUT = teclado.next();
                    longi = RUT.length();
                    while (longi > 8) {
                        System.out.println("rut invalido");
                        RUT = teclado.next();
                        longi = RUT.length();

                    }

                    while (longi < 8) {
                        System.out.println("rut invalido");
                        RUT = teclado.next();
                        longi = RUT.length();

                    }
                    M = 0;
                    S = 1;
                    T = Integer.parseInt(RUT);
                    for (; T != 0; T /= 10) {
                        S = (S + T % 10 * (9 - M++ % 6)) % 11;
                    }
                    System.out.println(RUT + "-" + (char) (S != 0 ? S + 47 : 75));
                    Rut = RUT + "-" + (char) (S != 0 ? S + 47 : 75);
                    Autor p4 = new Autor(nombre, Rut);
                    date = new Date();
                    hourdateFormat = new SimpleDateFormat("HH.mm.ss dd-MM-yyyy");
                    historial = hourdateFormat.format(date);
                    ruta = "" + historial + ".txt";
                    archivo = Paths.get(ruta);
                    texto = "" + p4;
                    try {
                        Files.write(archivo, texto.getBytes());
                    } catch (IOException e) {
                        System.out.println("");
                    }
                    break;

                case 5:
                    System.out.println("Ingrese nombre de la empresa");
                    nombre = teclado.next();
                    System.out.println("ingrese rut de la empresa");
                    RUT = teclado.next();
                    longi = RUT.length();
                    while (longi > 8) {
                        System.out.println("rut invalido");
                        RUT = teclado.next();
                        longi = RUT.length();

                    }

                    while (longi < 8) {
                        System.out.println("rut invalido");
                        RUT = teclado.next();
                        longi = RUT.length();

                    }
                    M = 0;
                    S = 1;
                    T = Integer.parseInt(RUT);
                    for (; T != 0; T /= 10) {
                        S = (S + T % 10 * (9 - M++ % 6)) % 11;
                    }
                    System.out.println(RUT + "-" + (char) (S != 0 ? S + 47 : 75));
                    Rut = RUT + "-" + (char) (S != 0 ? S + 47 : 75);
                    System.out.println("Ingrese 8 digitos del numero de telefono");
                    String telefono = teclado.next();
                    longi = telefono.length();
                    while (longi > 8) {
                        System.out.println("telefono invalido");
                        telefono = teclado.next();
                        longi = telefono.length();

                    }

                    while (longi < 8) {
                        System.out.println("telefono invalido");
                        telefono = teclado.next();
                        longi = telefono.length();
                    }
                    Empresa p5 = new Empresa(telefono, nombre, Rut);

                    date = new Date();
                    hourdateFormat = new SimpleDateFormat("HH.mm.ss dd-MM-yyyy");
                    historial = hourdateFormat.format(date);
                    ruta = "" + historial + ".txt";
                    archivo = Paths.get(ruta);
                    texto = "" + p5 ;
                    try {
                        Files.write(archivo, texto.getBytes());
                    } catch (IOException e) {
                        System.out.println("");
                    }
                    break;
                case 6:
                    System.out.println("Ingrese nombre del editor");
                    nombre = teclado.next();
                    System.out.println("ingrese rut del editor");
                    RUT = teclado.next();
                    longi = RUT.length();
                    while (longi > 8) {
                        System.out.println("rut invalido");
                        RUT = teclado.next();
                        longi = RUT.length();

                    }

                    while (longi < 8) {
                        System.out.println("rut invalido");
                        RUT = teclado.next();
                        longi = RUT.length();

                    }
                    M = 0;
                    S = 1;
                    T = Integer.parseInt(RUT);
                    for (; T != 0; T /= 10) {
                        S = (S + T % 10 * (9 - M++ % 6)) % 11;
                    }
                    System.out.println(RUT + "-" + (char) (S != 0 ? S + 47 : 75));
                    Rut = RUT + "-" + (char) (S != 0 ? S + 47 : 75);

                    System.out.println("ingrese tema del editor");
                    tema = teclado.next();
                    Editor p6 = new Editor(tema, nombre, Rut);date = new Date();
                    hourdateFormat = new SimpleDateFormat("HH.mm.ss dd-MM-yyyy");
                    historial = hourdateFormat.format(date);
                    ruta = "" + historial + ".txt";
                    archivo = Paths.get(ruta);
                    texto = "" + p6;
                    try {
                        Files.write(archivo, texto.getBytes());
                    } catch (IOException e) {
                        System.out.println("");
                    }
                    break;
            }
            System.out.println("¿desea volver al menu principal? 0 para volver.");
            op=teclado.nextInt();

        }
    }
}
