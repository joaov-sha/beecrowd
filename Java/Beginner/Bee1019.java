package Java.Beginner;

import java.util.Scanner;
public class Bee1019{
    public static void main(String[] args){

        // Descrição: Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

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