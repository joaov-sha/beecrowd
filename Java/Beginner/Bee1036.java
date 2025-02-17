package Java.Beginner;

import java.util.Scanner;
public class Bee1036{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double a, b, c, delta, r1, r2;
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        delta = Math.pow(b,2)-4*a*c;
        if(a == 0 || delta < 0){
            System.out.println("Impossivel calcular");
        }else{
            r1 = (-b + Math.sqrt(delta)) / (2 * a);
            r2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("R1 = %.5f\n", r1);
            System.out.printf("R2 = %.5f\n", r2);
        }
        s.close();
    }
}