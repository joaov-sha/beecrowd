package Java.Beginner;

import java.util.Scanner;
public class Bee1043{
    public static void main(String[] args){

        // Descrição: Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem: Perimetro = XX.X .Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem: Area = XX.X

        Scanner s = new Scanner(System.in);
        double a,b,c;
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();

        if(a >= (b+c) || b >= (a+c) || c >= (a+b)){
            System.out.printf("Area = %.1f\n", (((a+b)*c)/2));
        }else{
            System.out.printf("Perimetro = %.1f\n", (a+b+c));
        }
        
        s.close();
    }
}