package Java.Beginner;

import java.util.Scanner;
public class Bee1001 {
    public static void main(String[] args){
        // Descrição: Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de A e B atribuindo o seu resultado na variável X. Imprima X conforme exemplo apresentado abaixo. Não apresente mensagem alguma além daquilo que está sendo especificado e não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
        Scanner s = new Scanner(System.in);
        int A,B,X;
        A = s.nextInt();
        B = s.nextInt();
        X = A + B;
        System.out.println("X = " + X);
        s.close();
    }
}
