package Java.Beginner;

import java.util.Scanner;
public class Bee1012{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        /* Descrição:
            Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
            a) a área do triângulo retângulo que tem A por base e C por altura.
            b) a área do círculo de raio C. (pi = 3.14159)
            c) a área do trapézio que tem A e B por bases e C por altura.
            d) a área do quadrado que tem lado B.
            e) a área do retângulo que tem lados A e B. 
        */
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