import java.util.Scanner;

public class bee1021 {
    
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        double entrada = s.nextDouble();
        int nCem = (int) entrada/100;
        int nCinquenta = (int) (entrada%100)/50;
        int nVinte = (int) ((entrada%100)%50)/20;
        int nDez = (int) (((entrada%100)%50)%20)/10;
        int nCinco = (int) ((((entrada%100)%50)%20)%10)/5;
        int nDois = (int) (((((entrada%100)%50)%20)%10)%5)/2;
        int mUm = (int) ((((((entrada%100)%50)%20)%10)%5)%2)/1;
        int mCinquenta = (int) ((((((((entrada%100)%50)%20)%10)%5)%2)%1)*100)/50;
        int mVinteCinco = (int) (((((((((entrada%100)%50)%20)%10)%5)%2)%1)*100)%50)/25;
        int mDez = (int) ((((((((((entrada%100)%50)%20)%10)%5)%2)%1)*100)%50)%25)/10;
        int mCinco = (int) (((((((((((entrada%100)%50)%20)%10)%5)%2)%1)*100)%50)%25)%10)/5;
        int mCentavo = (int) ((((((((((((entrada%100)%50)%20)%10)%5)%2)%1)*100)%50)%25)%10)%5)/1;
        System.out.println("NOTAS:");
        System.out.println(nCem + " nota(s) de R$ 100.00");
        System.out.println(nCinquenta + " nota(s) de R$ 50.00");
        System.out.println(nVinte + " nota(s) de R$ 20.00");
        System.out.println(nDez + " nota(s) de R$ 10.00");
        System.out.println(nCinco + " nota(s) de R$ 5.00");
        System.out.println(nDois + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(mUm + " moeda(s) de R$ 1.00");
        System.out.println(mCinquenta + " moeda(s) de R$ 0.50");
        System.out.println(mVinteCinco + " moeda(s) de R$ 0.25");
        System.out.println(mDez + " moeda(s) de R$ 0.10");
        System.out.println(mCinco + " moeda(s) de R$ 0.05");
        System.out.println(mCentavo + " moeda(s) de R$ 0.01");
    }
}
