import java.util.Scanner;

public class Ukol3 {
    private static Scanner sc;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vloz slovo: ");
        String str = sc.nextLine();

        if (str.startsWith("auto")) {
            System.out.println("true");
        }
        else {
            System.out.println("nope");
        }
    }
}