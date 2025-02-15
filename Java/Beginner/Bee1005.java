package Java.Beginner;

import java.util.Scanner;
public class Bee1005{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double A, B, media;
        A = s.nextDouble();
        B = s.nextDouble();
        media = (A*3.5+B*7.5)/11;
        System.out.printf("MEDIA = %.5f\n", media);
        s.close();
    }
}