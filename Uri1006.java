import java.util.Scanner;

public class Uri1006 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double notaA, notaB, notaC, media;
        
    //entrada - ler os valores A e B
        notaA = teclado.nextDouble();
        notaB = teclado.nextDouble();
        notaC = teclado.nextDouble();

        media = (notaA * 2 + notaB * 3 + notaC * 5)/10;

        System.out.printf("MEDIA = %.1f%n", media);
    }
}    