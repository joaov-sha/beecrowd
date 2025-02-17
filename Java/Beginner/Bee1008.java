package Java.Beginner;

import java.util.Scanner;
public class Bee1008{
    public static void main(String[] args){
        // Descrição: Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
        Scanner s = new Scanner(System.in);
        int num, horas;
        double valor;
        num = s.nextInt();
        horas = s.nextInt();
        valor = s.nextDouble();
        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = U$ %.2f\n", (valor*horas));
        s.close();
    }
}