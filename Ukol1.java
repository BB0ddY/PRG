import java.util.Scanner;

public class Ukol1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vloz: ");
        char[] slova = scanner.nextLine().toCharArray();
        System.out.print("Obratene: ");
        for (int i = slova.length - 1; i >= 0; i--) {
            System.out.print(slova[i]);
        }
        System.out.print("\n");
    }
}