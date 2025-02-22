import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
        seguir, calcule e mostre o valor da conta a pagar. */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod = sc.nextInt();
        int qtd = sc.nextInt();

        if (cod == 1) {
            System.out.printf("Total: R$ %.2f%n",(4.00*qtd));
        }
        else if (cod == 2) {
            System.out.printf("Total: R$ %.2f%n",(4.50*qtd));
        }
        else if (cod == 3) {
            System.out.printf("Total: R$ %.2f%n",(5.00*qtd));
        }
        else if (cod == 4) {
            System.out.printf("Total: R$ %.2f%n",(2.00*qtd));
        }
        else if (cod == 5) {
            System.out.printf("Total: R$ %.2f%n",(1.5*qtd));
        }
        else {
            System.out.println("Valor Invalido");
        }
        sc.close();
    }
}
