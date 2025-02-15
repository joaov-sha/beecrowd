package Java.Beginner;

import java.util.Scanner;
public class Bee1017{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int tempo, velocidadeMedia;
        tempo = s.nextInt();
        velocidadeMedia = s.nextInt();
        double resultado = (double) (tempo * velocidadeMedia)/12;
        System.out.printf("%.3f\n", resultado);
        s.close();
    }
}