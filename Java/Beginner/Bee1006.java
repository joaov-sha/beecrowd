package Java.Beginner;

import java.util.Scanner;
public class Bee1006{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double A, B, C, media;
        A = s.nextDouble();
        B = s.nextDouble();
        C = s.nextDouble();
        media = (A*2+B*3+C*5)/10;
        System.out.printf("MEDIA = %.1f\n", media);
        s.close();
    }
}