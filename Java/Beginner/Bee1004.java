package Java.Beginner;

import java.util.Scanner;

public class Bee1004 {
    
    public static void main(String[] args){
        // Descrição: Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD. A seguir mostre a variável PROD com mensagem correspondente.
        Scanner s = new Scanner(System.in);
        int a, b, prod;
        a = s.nextInt();
        b = s.nextInt();
        prod = a * b;
        System.out.println("PROD = " + prod);
        s.close();
    }
}
