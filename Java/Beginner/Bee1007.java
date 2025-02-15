package Java.Beginner;

import java.util.Scanner;
public class Bee1007{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int A,B,C,D, diferenca;
        A = s.nextInt();
        B = s.nextInt();
        C = s.nextInt();
        D = s.nextInt();
        diferenca = (A*B-C*D);
        System.out.println("DIFERENCA = " + diferenca);
        s.close();
    }
}
