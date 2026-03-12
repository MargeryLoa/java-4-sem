import java.util.Scanner;

public class Inout {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)) {
            //rest of the code
            String name = scan.next();
            // Вывод текста в консоль
            System.out.println("Привет, " + name);
        }
    }
}