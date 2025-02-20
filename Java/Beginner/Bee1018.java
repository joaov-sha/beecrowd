package Java.Beginner;

import java.util.Scanner;
public class Bee1018{
    public static void main(String[] args){

        // Descrição: Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.
        
        Scanner s = new Scanner(System.in);
        int valor, nCem, nCinquenta, nVinte, nDez, nCinco, nDois, nUm;
        valor = s.nextInt();
        nCem = valor / 100;
        nCinquenta = (valor % 100) / 50;
        nVinte = ((valor % 100) % 50) / 20;
        nDez = (((valor % 100) % 50) % 20) / 10;
        nCinco = ((((valor % 100) % 50) % 20) % 10) / 5;
        nDois = (((((valor % 100) % 50) % 20) % 10) % 5 ) / 2;
        nUm = ((((((valor % 100) % 50) % 20) % 10) % 5) % 2) / 1;
        System.out.println(valor);
        System.out.println(nCem + " nota(s) de R$ 100,00");
        System.out.println(nCinquenta + " nota(s) de R$ 50,00");
        System.out.println(nVinte + " nota(s) de R$ 20,00");
        System.out.println(nDez + " nota(s) de R$ 10,00");
        System.out.println(nCinco + " nota(s) de R$ 5,00");
        System.out.println(nDois + " nota(s) de R$ 2,00");
        System.out.println(nUm + " nota(s) de R$ 1,00");
        s.close();
    }
}