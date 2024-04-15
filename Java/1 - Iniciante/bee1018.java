import java.util.Scanner;

public class bee1018 {
    
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args){

        int valor, nCem, nCinquenta, nVinte, nDez, nCinco, nDois, nUm;
        valor = s.nextInt();
        nCem = valor/100;
        nCinquenta = (valor%100)/50;
        nVinte = ((valor%100)%50)/20;
        nDez = (((valor%100)%50)%20)/10;
        nCinco = ((((valor%100)%50)%20)%10)/5;
        nDois = (((((valor%100)%50)%20)%10)%5)/2;
        nUm = ((((((valor%100)%50)%20)%10)%5)%2)/1;
        System.out.println(valor+"\n"+nCem + " nota(s) de R$ 100,00\n" +nCinquenta + " nota(s) de R$ 50,00\n" + nVinte +" nota(s) de R$ 20,00\n"+nDez+" nota(s) de R$ 10,00\n"+nCinco+" nota(s) de R$ 5,00\n"+nDois+" nota(s) de R$ 2,00\n"+nUm+" nota(s) de R$ 1,00");
    }
}
