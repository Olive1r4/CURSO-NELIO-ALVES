import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Digite um número inteiro");
        x = sc.nextInt();

        if (x > 0) {
            System.out.println("POSITIVO");
        } else {
            System.out.println("NÃO NEGATIVO");
        }
        sc.close();
    }
}
