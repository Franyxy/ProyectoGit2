


import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        String a;
        System.out.println("Introduzaca el número");
        a=teclado.next();
        numero=a.length();
        System.out.println("El número "+a+" tiene "+numero+" caracteres." );   
    } 
}
