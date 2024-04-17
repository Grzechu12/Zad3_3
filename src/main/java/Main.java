import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("wprowadz liczbe kolumn ");
        int x = scanner.nextInt();

        System.out.print("wprowadz liczbe wierszy");
        int y = scanner.nextInt();
      

       
        for (int i = 0; i < x; i++) {
          for (int j=y; j>i+1; j--){
            System.out.print(" ");
          }
            for (int j = 0; j < i+1; j++) {
              {
                System.out.print("*");}
            }
            System.out.println();
        }
    }
}