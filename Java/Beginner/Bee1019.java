package Java.Beginner;

import java.util.Scanner;
public class Bee1019{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N, horas, minutos, segundos;
        N = s.nextInt();
        horas = N / 3600;
        minutos = (N % 3600)/ 60;
        segundos = (N % 3600) % 60;
        System.out.println(horas+":"+minutos+":"+segundos);
        s.close();
    }
}