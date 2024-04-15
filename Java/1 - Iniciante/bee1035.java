import java.util.Scanner;

public class bee1035 {
    
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        int a,b,c,d;

        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        d = s.nextInt();

        if(!(b > c && d > a && (c+d) > (a+b) && c > 0 && d > 0 && a % 2 == 0)){
            System.out.println("Valores nao aceitos");
        }else{
            System.out.println("Valores aceitos");
        }
    }
}
