
import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double h1,h2,a,b,c,h;
        System.out.println("Ingrese a");
        a=teclado.nextDouble();
        System.out.println("Ingrese b");
        b=teclado.nextDouble();
        System.out.println("Ingrese c");
        c=teclado.nextDouble();
        h=(b*b)-4*a*c;
        if(h<0){
            System.out.println("No existen soluciones.");}
        else {    
        h1=(-b+Math.sqrt(h))/(2*a);
        h2=(-b-Math.sqrt(h))/(2*a);
        System.out.println("x= "+h1);
        System.out.println("x= "+h2);
        System.out.println("Java3V2RamaMaster" );
        }
    } 
}





