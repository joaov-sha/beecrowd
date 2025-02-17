package Java.Beginner;

import java.util.Scanner;

public class Bee1002 {
    
    public static void main(String[] args){
        /*
            Descrição:
            A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:
            - Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.
        */
        Scanner s = new Scanner(System.in);
        double raio = s.nextDouble();
        double pi = 3.14159;
        double area = pi*Math.pow(raio,2);
        System.out.printf("A=%.4f\n", area);
        s.close();
    }
}
