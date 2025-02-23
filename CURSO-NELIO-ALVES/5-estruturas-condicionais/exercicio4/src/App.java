import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
        começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas*/

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int total;

        if (x < y){
            total = y - x;
            System.out.printf("O Jogo durou %d horas(s)%n", total);
        }
        else if (x > y ) {
            total = (24 - x + y);
            System.out.printf("O Jogo durou %d horas(s)%n", total);
        }
        else {
            System.out.println("Jogo durou 24 hora(s)");
        }
        sc.close();
    }
}
