package Java.Beginner;

import java.util.Scanner;
public class Bee1020{
    public static void main(String[] args){
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
