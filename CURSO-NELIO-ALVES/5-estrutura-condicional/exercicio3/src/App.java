import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
        Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
        ordem crescente ou decrescente */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x >= y) {
            if (x % y == 0) {
                System.out.print("São Multiplos");
            }
            else {
                System.out.print("Nao sao Multiplos");
            }
        }
        else {
            if (y % x == 0) {
                System.out.print("São Multiplos");
            }
            else {
                System.out.print("Nao sao Multiplos");
            }
        }
        sc.close();
    }
}
