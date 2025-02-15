package Java.Beginner;

import java.util.Scanner;
public class Bee1008{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num, horas;
        double valor;
        num = s.nextInt();
        horas = s.nextInt();
        valor = s.nextDouble();
        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = U$ %.2f\n", (valor*horas));
        s.close();
    }
}