import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
        que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
        qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
        Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
        mostre o valor que esta pessoa deve pagar de Imposto de Renda */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();

        if (salario <= 2000.00) {
            System.out.println("Isento");
        }
        else if (salario > 2000.00 && salario <= 3000.00) {
            System.out.printf("R$ %.2f%n", ((salario - 2000) * 0.08));
        }
        else if (salario > 3000.00 && salario <= 4500.00) {
            System.out.printf("R$ %.2f%n", ((salario - 3000) * 0.18) + (1000 * 0.08));
        }
        else if (salario > 4500.00) {
            System.out.printf("R$ %.2f%n", ((salario-4500.00) * 0.28) + (1500 * 0.18) + (1000 * 0.08));
        }
        else {
            System.out.println("Valor invalido");
        }
        sc.close();
    }
}
