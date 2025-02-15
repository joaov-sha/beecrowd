package Java.Beginner;

import java.util.Scanner;

public class Bee1003 {
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int A, B, SOMA;
        A = s.nextInt();
        B = s.nextInt();
        SOMA = A + B;
        System.out.println("SOMA = " + SOMA);
        s.close();
    }
}
