import java.util.Scanner;

public class Prumer {
    public static void main(String[] args) {
        int pocit, i;
        float spoc = 0, prum;
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Vloz pocet cisel:");
        pocit = scanner.nextInt();

        System.out.println("Vloz " + pocit + " Cisla");
        for (i = 0; i < pocit; i++) {
            spoc += scanner.nextInt();
        }

        prum = spoc / pocit;

        System.out.println("Prumer : " + prum);
    }
}