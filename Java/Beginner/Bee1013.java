package Java.Beginner;

import java.util.Scanner;
public class Bee1013{
    public static void main(String[] args){
        // Descrição: Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. 
        Scanner s = new Scanner(System.in);
        int A,B,C, maiorAB, maiorC;
        A = s.nextInt();
        B = s.nextInt();
        C = s.nextInt();
        maiorAB = (A+B+Math.abs(A-B))/2;
        maiorC = (maiorAB+C+Math.abs(maiorAB-C))/2;
        System.out.println(maiorC + " eh o maior");
        s.close();
    }
}