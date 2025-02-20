package Java.Beginner;

import java.util.Scanner;
public class Bee1020{
    public static void main(String[] args){

        // Descrição: Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias. Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

        Scanner s = new Scanner(System.in);
        int valor, anos, meses, dias;
        valor = s.nextInt();
        anos = valor / 365;
        meses = valor % 365 / 30;
        dias = valor % 365 % 30;
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
        s.close();
    }
}
