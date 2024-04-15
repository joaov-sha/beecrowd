import java.util.Scanner;

public class bee1019 {
    
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        int n = s.nextInt();
        System.out.printf("%d:%d:%d\n",(n/3600),((n%3600)/60),((n%3600)%60));
    }
}
