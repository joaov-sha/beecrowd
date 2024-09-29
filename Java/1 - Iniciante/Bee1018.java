import java.util.Scanner;

public class Bee1018 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int resto;
        int valor = s.nextInt();
        int nCem = valor / 100;
        resto = valor % 100;
        int nCinquenta = resto / 50;
        resto = resto % 50;
        int nVinte = resto / 20;
        resto = resto % 20;
        int nDez = resto / 10;
        resto = resto % 10;
        int nCinco = resto / 5;
        resto = resto % 5;
        int nDois = resto / 2;
        resto = resto % 2;
        int nUm = resto / 1;
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
