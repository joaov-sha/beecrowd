import java.util.Scanner;

public class Bee1020 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.printf("%d ano(s)%n%d mes(es)%n%d dia(s)%n",(n/365),(n%365)/30,(n%365)%30);
        s.close();
    }
}
