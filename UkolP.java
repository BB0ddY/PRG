import java.util.Scanner;

class Palindrome {
    public static void main(String args[]) {
        String pov, obr = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Vloz slovo:");
        pov = in.nextLine();

        int length = pov.length();
        for (int i = length - 1; i >= 0; i--) {
            obr = obr + pov.charAt(i);
        }
        if (pov.equals(obr)) {
            System.out.println("Slovo je palindrom");
        }
        else {
            System.out.println("Slovo neni palindrom.");
        }
    }
}
