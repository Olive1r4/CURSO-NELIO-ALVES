import java.util.Locale;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int funcNum, numHoras;
    double valorHora;
    
    System.out.print("Número do funcionário: ");
    funcNum = sc.nextInt();
    System.out.print("Quantidate de horas: ");
    numHoras = sc.nextInt();
    System.out.print("Valor da Hora: ");
    valorHora = sc.nextDouble();

    System.out.printf("NUMBER %2d%nSALARY %.2f%n",funcNum, (numHoras*valorHora));
    sc.close();
    }
}
