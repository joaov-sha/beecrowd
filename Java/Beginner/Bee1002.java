package Java.Beginner;

import java.util.Scanner;

public class Bee1002 {
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double raio = s.nextDouble();
        double area = Math.PI*Math.pow(raio,2);
        System.out.printf("A=%.4f\n", area);
        s.close();
    }
}
