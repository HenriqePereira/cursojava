import java.util.Scanner;
public class Uri1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        //Váriaveis
        double salario, reajuste;

        //Entrada
        salario = teclado.nextDouble();

        //Processamento e Saída
        if((salario >= 0) && (salario <= 400)){
            reajuste = salario * 0.15;
            salario = salario + reajuste;
            System.out.printf("Novo salario: %.2f%n", salario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.printf("Em percentual: 15 %%%n");
        }
        else if((salario >= 400.01) && (salario <= 800)){
            reajuste = salario * 0.12;
            salario = salario + reajuste;
            System.out.printf("Novo salario: %.2f%n", salario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.printf("Em percentual: 12 %%%n");
        }
        else if((salario >= 800.01) && (salario <= 1200)){
            reajuste = salario * 0.10;
            salario = salario + reajuste;
            System.out.printf("Novo salario: %.2f%n", salario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.printf("Em percentual: 10 %%%n");
        }
        else if((salario >= 1200.01) && (salario <= 2000)){
            reajuste = salario * 0.7;
            salario = salario + reajuste;
            System.out.printf("Novo salario: %.2f%n", salario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.printf("Em percentual: 7 %%%n");
        }
        else if(salario > 2000){
            reajuste = salario * 0.4;
            salario = salario + reajuste;
            System.out.printf("Novo salario: %.2f%n", salario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.printf("Em percentual: 4 %%%n");
        }                                  
    }
}