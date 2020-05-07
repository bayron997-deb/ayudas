package Editorial;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GestorArchivo {
    public static void crearLibro(){
        String ruta = "Libro";
        Path directorio = Paths.get(ruta);
        if(Files.exists(directorio)){
            System.out.println("");

        }else{
            try{
                Files.createDirectories(directorio);

            }catch(IOException e){
            }


        }
    }
    public static void crearArticulos(){
        String ruta = "Articulos";
        Path directorio = Paths.get(ruta);
        if(Files.exists(directorio)){
            System.out.println("");

        }else{
            try{
                Files.createDirectories(directorio);

            }catch(IOException e){
            }


        }
    }
    public static void crearRevistas(){
        String ruta = "Revistas";
        Path directorio = Paths.get(ruta);
        if(Files.exists(directorio)){
            System.out.println("");

        }else{
            try{
                Files.createDirectories(directorio);

            }catch(IOException e){
            }


        }
    }
}
