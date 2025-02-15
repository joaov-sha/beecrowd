package Java.Beginner;

import java.util.Scanner;
public class Bee1012{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double A,B,C;
        A = s.nextDouble();
        B = s.nextDouble();
        C = s.nextDouble();
        System.out.printf("TRIANGULO: %.3f\n", ((A*C)/2));
        System.out.printf("CIRCULO: %.3f\n", (3.14159 * Math.pow(C,2)));
        System.out.printf("TRAPEZIO: %.3f\n", (((A+B)*C)/2));
        System.out.printf("QUADRADO: %.3f\n", (Math.pow(B,2)));
        System.out.printf("RETANGULO: %.3f\n", (A*B));
        s.close();
    }
}