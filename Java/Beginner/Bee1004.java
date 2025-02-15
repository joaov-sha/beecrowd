package Java.Beginner;

import java.util.Scanner;

public class Bee1004 {
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a, b, prod;
        a = s.nextInt();
        b = s.nextInt();
        prod = a * b;
        System.out.println("PROD = " + prod);
        s.close();
    }
}
