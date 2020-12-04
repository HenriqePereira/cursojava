import java.util.Scanner;

public class Leituras{
    public static void main(String args[]){
        Scanner teclado;    //declaro um componente do tipo Scanner e chamo de teclado
        teclado = new Scanner(System.in); //este componente irá ler dados do dispositivo teclado

        int a;
        float b;
        double c;

        System.out.println("Por favor, digite um valor inteiro");
        a = teclado.nextInt();
        System.out.println("Você digitou " + a);

        System.out.println("Agora digite um valor float ");
        b = teclado.nextFloat();
        System.out.println("Você digitou " + b);

        System.out.println("Agora digite um valor Double ");
        c = teclado.nextDouble();
        System.out.println("Você digitou " + c);

        System.out.printf("%.1f%n", c);
        System.out.printf("%.2f%n", c);
        System.out.printf("%.3f%n", c);

    }
}    
    