import java.util.Scanner;

public class Ukol1 {
    public static void  main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Vloz vetu:");

        String userSentence = myObj.nextLine();
        String[] slova = userSentence.split(" ");
        System.out.println(slova[slova.length - 2]);
    }
}
