package Java.Beginner;

import java.util.Scanner;
public class Bee1042{
    public static void main(String[] args){

        // Descrição: Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.

        Scanner s = new Scanner(System.in);
        int a, b, c;
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        if(a > b && b > c){
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }else if(a > b && a > c && c > b){
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        }else if(b > a && a > c){
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        }else if(b > a && c > a && b > c){
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        }else if(c > a && a > b){
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        }else if(c > b && b > a){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        s.close();
    }
}