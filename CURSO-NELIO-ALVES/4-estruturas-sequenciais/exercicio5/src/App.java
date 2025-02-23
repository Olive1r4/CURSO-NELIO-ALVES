import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int s1, s2, s4, s5;
        double s3,s6;

        s1 = sc.nextInt();
        s2 = sc.nextInt();
        s3 = sc.nextDouble();
        sc.nextLine();
        s4 = sc.nextInt();
        s5 = sc.nextInt();
        s6 = sc.nextDouble();

        System.out.printf("LISTA DE PENÇAS:%nCOD: %d%nCOD: %d%n", s1, s4);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", (s2*s3)+(s5*s6));

        sc.close();
    }
}
