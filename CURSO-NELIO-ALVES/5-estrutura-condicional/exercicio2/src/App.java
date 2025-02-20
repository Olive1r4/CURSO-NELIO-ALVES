import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int x = sc.nextInt();
        if (x % 2 == 0 ){
            System.out.printf("O número %d é PAR.", x);
        }
        else {
            System.out.printf("O número %d é IMPAR.", x);
        }
        sc.close();
    }
}
