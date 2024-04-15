import java.util.Scanner;

public class bee1044 {
    
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        int a, b;
        a = s.nextInt();
        b = s.nextInt();
        if(b % a == 0 || a % b == 0){
            System.out.println("Sao Multiplos");
        }else{
            System.out.println("Nao sao Multiplos");
        }
    }
}
