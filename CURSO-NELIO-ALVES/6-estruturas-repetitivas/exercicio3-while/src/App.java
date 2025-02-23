import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
        um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
        4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
        que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
        mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
        exemplo. */

        Scanner sc = new Scanner(System.in);

        int a = 0, g = 0, d = 0;
        int ctipe = sc.nextInt();

        while (ctipe >= 0 && ctipe != 4 ) {
            if (ctipe == 1) {
                a++;
                ctipe = sc.nextInt();
            }
            else if (ctipe == 2) {
                g++;
                ctipe = sc.nextInt();
            }
            else if (ctipe == 3) {
                d++;
                ctipe = sc.nextInt();
            }
            else {
                ctipe = sc.nextInt();
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d%nGasolina: %d%nDiesel: %d%n", a,g,d);
        sc.close();
    }
}
