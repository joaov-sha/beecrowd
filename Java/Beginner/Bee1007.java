package Java.Beginner;

import java.util.Scanner;
public class Bee1007{
    public static void main(String[] args){
        // Descrição: Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
        Scanner s = new Scanner(System.in);
        int A,B,C,D, diferenca;
        A = s.nextInt();
        B = s.nextInt();
        C = s.nextInt();
        D = s.nextInt();
        diferenca = (A*B-C*D);
        System.out.println("DIFERENCA = " + diferenca);
        s.close();
    }
}
