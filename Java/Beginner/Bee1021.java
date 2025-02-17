package Java.Beginner;

import java.util.Scanner;
public class Bee1021{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int nCem, nCinquenta, nVinte, nDez, nCinco, nDois, mUm, mCinquenta, mVinteCinco, mDez, mCinco, mCentavo;
        double valor = s.nextDouble();
        nCem = (int) valor / 100;
        nCinquenta = (int) (valor % 100) / 50;
        nVinte = (int) ((valor % 100) % 50) / 20;
        nDez = (int) (((valor % 100) % 50) % 20) / 10;
        nCinco = (int) ((((valor % 100) % 50) % 20) % 10) / 5;
        nDois = (int) (((((valor % 100) % 50) % 20) % 10) % 5) / 2;
        mUm = (int) ((((((valor % 100) % 50) % 20) % 10) % 5) % 2) / 1;
        mCinquenta = (int) ((((((((valor % 100) % 50) % 20) % 10) % 5) % 2) % 1) * 100) / 50;
        mVinteCinco = (int) (((((((((valor % 100) % 50) % 20) % 10) % 5) % 2) % 1) * 100) % 50) / 25;
        mDez = (int) ((((((((((valor % 100) % 50) % 20) % 10) % 5) % 2) % 1) * 100) % 50) % 25) / 10;
        mCinco = (int) (((((((((((valor % 100) % 50) % 20) % 10) % 5) % 2) % 1) * 100) % 50) % 25) % 10) / 5;
        mCentavo = (int) ((((((((((((valor % 100) % 50) % 20) % 10) % 5) % 2) % 1) * 100) % 50) % 25) % 10) % 5) / 1 ;
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
        s.close();
    }
}