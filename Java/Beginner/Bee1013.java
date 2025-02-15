package Java.Beginner;

import java.util.Scanner;
public class Bee1013{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int A,B,C, maiorAB, maiorC;
        A = s.nextInt();
        B = s.nextInt();
        C = s.nextInt();
        maiorAB = (A+B+Math.abs(A-B))/2;
        maiorC = (maiorAB+C+Math.abs(maiorAB-C))/2;
        System.out.println(maiorC + " eh o maior");
        s.close();
    }
}