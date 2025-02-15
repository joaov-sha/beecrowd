package Java.Beginner;

import java.util.Scanner;
public class Bee1016{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int distancia = s.nextInt();
        System.out.printf("%.0f minutos\n", (distancia/0.5));
        s.close();
    }
}