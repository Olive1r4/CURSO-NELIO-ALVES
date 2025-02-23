import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Troca a virgula por ponto em números
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int x, y, soma;
        x = sc.nextInt();
        y = sc.nextInt();
        soma = x+y;

        System.out.println("Soma = "+ soma);
        
        sc.close();
    }
}
