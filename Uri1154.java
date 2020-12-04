import java.util.Scanner;
public class Uri1154{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N;
        double media=0, cont=0;
        
        do{
            N = teclado.nextInt();
            if(N > 0){
                media = media + N;
            }
        }
        while(N > 0);
        System.out.printf("%.2f%n", media/cont);
    }
}