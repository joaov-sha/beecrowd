package Java.Beginner;

import java.util.Scanner;
public class Bee1035{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int A, B, C, D;
        A = s.nextInt();
        B = s.nextInt();
        C = s.nextInt();
        D = s.nextInt();
        if(B > C && D > A && (C+D) > (A+B) && C > 0 && D > 0 && A % 2 != 0){
            System.out.println("Valores nao aceitos");
        }else{
            System.out.println("Valores aceitos");
        }
        s.close();
    }
}