import java.util.Scanner;

public class bee1042 {
    
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        int a,b,c;
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        if(a > b && b > c){
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }else if(a > c && c > b){
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        }else if(b > a && a > c){
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        }else if(b > c && c > a){
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        }else if(c > a && a > b){
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        }else if(c > b && b > a){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
