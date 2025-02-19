import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /* 
            Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.
            Fórmula da área: area = π . raio2
            Considere o valor de π = 3.14159
        */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma valor para o raio: ");
        double raio = sc.nextDouble();

        double area = 3.14159*(Math.pow(raio,2));
        System.out.printf("AREA = %.4f%n", area);
        sc.close();
    }
}
