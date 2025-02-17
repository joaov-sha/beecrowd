package Java.Beginner;

import java.util.Scanner;
public class Bee1009{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        // Descrição: Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.
        String nome;
        double salario, vendas;
        nome = s.nextLine();
        salario = s.nextDouble();
        vendas = s.nextDouble();
        System.out.printf("TOTAL = R$ %.2f\n", (salario + (0.15*vendas)));
        s.close();
    }
}