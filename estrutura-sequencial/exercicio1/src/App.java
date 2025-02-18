import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        mensagem explicativa, conforme exemplos. */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.printf("SOMA = %d%n",x+y);

        sc.close();
    }
}
