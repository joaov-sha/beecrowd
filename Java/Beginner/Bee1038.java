package Java.Beginner;

import java.util.Scanner;
public class Bee1038{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int codigo, quantidade;
        double valor, total;
        valor = 0.0;
        codigo = s.nextInt();
        switch(codigo){
            case 1:
            valor = 4.00;
            break;
            case 2:
            valor = 4.50;
            break;
            case 3:
            valor = 5.00;
            break;
            case 4:
            valor = 2.00;
            break;
            case 5:
            valor = 1.50;
            break;
        }
        quantidade = s.nextInt();
        total = quantidade * valor;
        System.out.printf("Total: R$ %.2f\n", total);
        s.close();
    }
}