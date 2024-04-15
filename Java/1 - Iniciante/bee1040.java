import java.util.Scanner;

public class bee1040 {
    
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        float n1, n2, n3, n4, media;
        n1 = s.nextFloat();
        n2 = s.nextFloat();
        n3 = s.nextFloat();
        n4 = s.nextFloat();
        media = ((n1*2)+(n2*3)+(n3*4)+(n4*1))/10;
        if(media >= 7.0){
            System.out.printf("Media: %.1f\n", media);
            System.out.printf("Aluno aprovado.\n");
        }else if(media >= 5.0 && media <= 6.9){
            System.out.printf("Media: %.1f\n", media);
            System.out.printf("Aluno em exame.\n");
            float notaExame = s.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", notaExame);
            float novaMedia = (media+notaExame)/2;
            if(novaMedia >= 5.0){
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n", novaMedia);
            }else{
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f\n", novaMedia);
            }
        }else if(media <= 4.9){
            System.out.printf("Media: %.1f\n", media);
            System.out.printf("Aluno reprovado.\n");
        }
    }
}
