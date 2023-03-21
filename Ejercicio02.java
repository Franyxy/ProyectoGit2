
import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in); 
    double radio,area;
        System.out.println("Escribe el radio.");
        radio=teclado.nextDouble();
        area=(radio*Math.PI*radio);
        System.out.println("El area del círculo es: "+area+"m^2");
        System.out.println("Java2V3RamaMaster" );
    } 
}
