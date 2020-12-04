import java.util.Scanner;

public class Uri1010 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int codPC1, codPC2, numPC1, numPC2;
        double valorPC1, valorPC2, total;

        codPC1 = teclado.nextInt();
        numPC1 = teclado.nextInt();
        valorPC1 = teclado.nextDouble();
        
        codPC2 = teclado.nextInt();
        numPC2 = teclado.nextInt();
        valorPC2 = teclado.nextDouble();

        total = (numPC1 * valorPC1)+(numPC2 * valorPC2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
    }
}    