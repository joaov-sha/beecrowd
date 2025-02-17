package Java.Beginner;

import java.util.Scanner;
public class Bee1011{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        // Descrição: Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R). A fórmula para calcular o volume é: (4/3) * pi * R3. Considere (atribua) para pi o valor 3.14159.
        double R, pi, volume;
        pi = 3.14159;
        R = s.nextDouble();
        volume = (4/3.0) * pi * Math.pow(R,3);
        System.out.printf("VOLUME = %.3f\n", volume);
        s.close();
    }
}
