import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double r, pi=3.14159, area;

        r = sc.nextDouble();
        area = pi * (Math.pow(r,2.0));
        System.out.printf("A = %.4f%n", area);
        sc.close();
    }
}
