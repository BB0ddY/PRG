public class delitelnost {

    public static void main(String[] args) {

        int i;
        int num = 0;
        int juj = 100; 
        boolean ej = true;

        String eh = "";

        for (i = 1; i <= juj; i++) {
            ej = kontrola(i);
            if (ej) {
                eh = eh + i + " ";
            }
        }
        System.out.println("Cisla delitelne 7 su:");
        System.out.println(eh);
    }
    public static boolean kontrola(int ciselnaKontrola) {
        int uh;
        for (int i = 2; i <= ciselnaKontrola / 2; i++) {
            uh = ciselnaKontrola % i;
            if (uh == 0) {
                return false;
            }
        }
        return true;

    }

}