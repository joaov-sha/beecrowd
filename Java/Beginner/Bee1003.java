package Java.Beginner;

import java.util.Scanner;

public class Bee1003 {
    
    public static void main(String[] args){
        // Descrição: Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas e atribua à variável SOMA. A seguir escrever o valor desta variável.
        Scanner s = new Scanner(System.in);
        int A, B, SOMA;
        A = s.nextInt();
        B = s.nextInt();
        SOMA = A + B;
        System.out.println("SOMA = " + SOMA);
        s.close();
    }
}
