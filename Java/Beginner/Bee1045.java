package Java.Beginner;

import java.util.Scanner;
public class Bee1045{
    public static void main(String[] args){
        /*
            Descrição:
            Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o maior dos 3 lados. A seguir, determine o tipo de triângulo que estes três lados formam, com base nos seguintes casos, sempre escrevendo uma mensagem adequada:
        
            se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
            se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
            se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
            se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
            se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
            se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
        */
        Scanner s = new Scanner(System.in);
        double a,b,c;
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        if(b > a && a > c){
            double temp = a;
            a = b;
            b = temp;
        }else if(c > b && b > a){
            double temp = c;
            c = a;
            a = temp;
        }
        if(a >= (b+c) || b >= (a+c) || c >= (a+b)){
            System.out.println("NAO FORMA TRIANGULO");
        }else if(Math.pow(a,2) == (Math.pow(b,2) + Math.pow(c,2)) || Math.pow(b,2) == (Math.pow(a,2) + Math.pow(c,2)) || Math.pow(c,2) == (Math.pow(a,2) + Math.pow(b,2))){
            System.out.println("TRIANGULO RETANGULO");
        }else if(Math.pow(a,2) > (Math.pow(b,2) + Math.pow(c,2)) || Math.pow(b,2) > (Math.pow(a,2) + Math.pow(c,2)) || Math.pow(c,2) > (Math.pow(a,2) + Math.pow(b,2))){
            System.out.println("TRIANGULO OBTUSANGULO");
            if(a == b && a != c || a == c && a != b){
                System.out.println("TRIANGULO ISOSCELES");
            }
        }else if(Math.pow(a,2) < (Math.pow(b,2) + Math.pow(c,2)) || Math.pow(b,2) < (Math.pow(a,2) + Math.pow(c,2)) || Math.pow(c,2) < (Math.pow(a,2) + Math.pow(b,2))){
            System.out.println("TRIANGULO ACUTANGULO");
            if(a == b && a != c || a == c && a != b || b == c && b != a){
                System.out.println("TRIANGULO ISOSCELES");
            }else if(a == b && a == c){
                System.out.println("TRIANGULO EQUILATERO");
            }
        }
        s.close();
    }
}