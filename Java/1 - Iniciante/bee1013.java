import java.util.Scanner;

public class bee1013 {
    
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        int a, b, c, maiorAB, maiorC;
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        maiorAB = (a+b+Math.abs(a-b))/2;
        maiorC = (maiorAB+c+Math.abs(maiorAB-c))/2;
        System.out.println(maiorC + " eh o maior");
    }
}
