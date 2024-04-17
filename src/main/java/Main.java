import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("wprowadz liczbe kolumn ");
        int x = scanner.nextInt();

        System.out.print("wprowadz liczbe wierszy");
        int y = scanner.nextInt();

        char znak = '*';
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
              if (j<=i){
                System.out.print(znak + " ");}
            }
            System.out.println();
        }
    }
}