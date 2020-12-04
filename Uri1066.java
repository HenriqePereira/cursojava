import java.util.Scanner;
public class Uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        int valor;
        int qtdePar = 0, qtdeImpar = 0, qtdePositvo = 0, qtdeNegativos = 0;

        for (int cont = 1; cont <=5; cont++){

            valor = teclado.nextInt();

            if((valor % 2) == 0){

                qtdePar++;
                
            }
            else if((valor % 2) != 0){

                qtdePar++;
                
            }
            else if(valor > 0){
                qtdePositvo++;

            }
            else if(valor < 0){
                qtdeNegativos++;
                
            }
            
            
        }
        
        System.out.println(qtdePar +" valor(es) par(es)");
        System.out.println(qtdeImpar +" valor(es) impar(es)");
        System.out.println(qtdePositvo +" valor(es) positivo(s)");
        System.out.println(qtdeNegativos +" valor(es) negativo(s)");        
    }
}