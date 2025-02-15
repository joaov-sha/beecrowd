package Java.Beginner;

import java.util.Scanner;
public class Bee1015{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        float x1,y1,x2,y2;
        x1 = s.nextFloat();
        y1 = s.nextFloat();
        x2 = s.nextFloat();
        y2 = s.nextFloat();
        System.out.printf("%.4f\n",(Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2))));
        s.close();
    }
}