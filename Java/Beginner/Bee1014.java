package Java.Beginner;

import java.util.Scanner;
public class Bee1014{
    public static void main(String[] args){
        // Descrição: Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida em KM e o gasto de combustível em litros
        Scanner s = new Scanner(System.in);
        int X = s.nextInt();
        double Y = s.nextDouble();
        System.out.printf("%.3f km/l\n", (X/Y));
        s.close();
    }
}