import java.util.Scanner;
    public class Uri1020{
        public static void main(String args[]){
            Scanner teclado = new Scanner(System.in);
            int ano,meses,dias,ndias;

            //Entrada tem que ser um valor inteiro
            ndias = teclado.nextInt();

            ano = ndias / 365;
            System.out.println(ano + " ano(s)");
            
            meses = (ndias % 365) / 30;
            System.out.println(meses + " mes(es)");
            
            dias = (ndias % 365 % 30);
            System.out.println(dias + " dia(s)");

        }
    }