package Java.Beginner;

import java.util.Scanner;
public class Bee1011{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double R, pi, volume;
        pi = 3.14159;
        R = s.nextDouble();
        volume = (4/3) * pi * Math.pow(R,3);
        System.out.printf("VOLUME = %.3f\n", volume);
        s.close();
    }
}
