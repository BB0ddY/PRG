public class ukol1o3 {
    public static void main(String[] args) {
        int a = 11;
        boolean jePrvo = true;

        for (int j = 2; j < a;j++) {
            if (a % j == 0) {
                jePrvo = false;
            }
        }
        if (jePrvo) {
            System.out.println("je prvocislo");
        }
    }
}
