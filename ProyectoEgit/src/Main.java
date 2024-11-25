import java.util.*;
public class Main {
    public static void main(String[] args) {
//Creamos el programa principal main
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, resultado;
        System.out.print("Introduce primer número: ");
        numero1 = sc.nextInt();
        System.out.print("Introduce segundo número: ");
        numero2 = sc.nextInt();
    }
}
//Agregamos el metodo suma
public static int suma(int a, int b) {
    int c;
    c = a + b;
    return c;
}
//Agregamos el metodo resta
public static int resta(int a, int b) {
    int c;
    c = a - b;
    return c;
    }