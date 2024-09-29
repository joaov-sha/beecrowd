import java.util.Scanner;

public class Bee1013 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b,c,maiorab,maiorc;
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        maiorab = ((a+b+Math.abs(a-b))/2);
        maiorc = ((maiorab+c+Math.abs(maiorab-c))/2);
        System.out.println(maiorc + " eh o maior");
        s.close();
    }
}
