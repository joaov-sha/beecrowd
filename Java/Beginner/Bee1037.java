package Java.Beginner;

import java.util.Scanner;
public class Bee1037{
    public static void main(String[] args){

        // Descrição: Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”. O símbolo ( representa "maior que". Por exemplo: [0,25]  indica valores entre 0 e 25.0000, inclusive eles. (25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000

        Scanner s = new Scanner(System.in);
        double valor = s.nextDouble();
        if(valor >= 0 && valor <= 25.0000){
            System.out.println("Intervalo [0,25]");
        }else if(valor >= 25.00001 && valor <= 50.0000000){
            System.out.println("Intervalo (25,50]");
        }else if(valor >= 50.00000001 && valor <= 75.0000000){
            System.out.println("Intervalo (50,75]");
        }else if(valor >= 75.00000001 && valor <= 100){
            System.out.println("Intervalo (75,100]");
        }else{
            System.out.println("Fora de intervalo");
        }
        s.close();
    }
}