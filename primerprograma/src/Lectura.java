import java.util.Scanner;
import java.util.Scanner;
public class Lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu pelicula favorita");
        String pelicula = teclado.nextLine();
        System.out.println("Ahora escribe la fecha de lanzamiento");
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("Por ultimo dinos que nta le das a esta pelicula");
        double notaDeLaPelicula = teclado.nextDouble();
        System.out.println(pelicula + " : " + fechaDeLanzamiento + " : " + notaDeLaPelicula);
        teclado.close();
    }

}
