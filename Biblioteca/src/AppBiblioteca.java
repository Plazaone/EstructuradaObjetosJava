import java.util.Scanner;

import com.biblioteca.mantener.*;   

public class AppBiblioteca {
    Libro libro ;
    public static void main(String[] args) throws Exception {
        AppBiblioteca appBiblioteca = new AppBiblioteca();
        appBiblioteca.cargarLibro();
        appBiblioteca.imprimir(); 
    }

    public void cargarLibro(){
        libro= new Libro();
        Scanner sc= new Scanner(System.in);
        System.out.println(" Ingrese el codigo del libro: ");
        libro.setCodigo(sc.nextInt());
        sc.nextLine();
        System.out.println("Ingrese el nombre del libro: ");
        libro.setNombre(sc.nextLine());
        System.out.println(" Ingrese el codigo de la edicion ");
        libro.setEdicion(sc.nextInt());
        System.out.println("Ingrese el año de publicacion:");
        libro.setanioPublicacion(sc.nextInt());
        
        Autor autor= new Autor();

        System.out.println("Ingrese el codigo del autor");
        autor.setCodigo(sc.nextInt());
        System.out.println("Ingrese el nombre del autor");
        sc.nextLine();
        autor.setNombre(sc.nextLine());
        
        libro.setAutor(autor);
    }

    public void imprimir(){
        System.out.println(libro);
    }
}
