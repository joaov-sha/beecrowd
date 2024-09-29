import java.util.Scanner;

public class Bee1011 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("VOLUME = %.3f%n",(4/3.0)*3.14159*Math.pow(s.nextDouble(),3));
        s.close();
    }
}
