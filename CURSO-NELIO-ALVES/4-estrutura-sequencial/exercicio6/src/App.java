import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, tri, cir, tra, qua, ret;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        tri = (a*c)/2;
        cir = Math.pow(c, 2)*3.14159;
        tra = ((a+b)*c)/2;
        qua = b*b;
        ret = a*b;

        System.out.printf("TRIANGULO: %.3f%n",tri);
        System.out.printf("CIRCULO: %.3f%n",cir);
        System.out.printf("TRAPEZIO: %.3f%n",tra);
        System.out.printf("QUADRADO: %.3f%n",qua);
        System.out.printf("RETANGULO: %.3f%n",ret);

        sc.close();
    }
}
