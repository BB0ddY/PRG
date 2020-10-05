public class pismena {
    public static void main(String[] args) {
        int pocCis = 0;
        String word = "Letecky serzant polivka";
        for (char pismena = 'a'; pismena <= 'z'; pismena++) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == pismena) {
                    pocCis++;
                }
            }
            if (pocCis > 0) {
                System.out.println(pismena + "=" + pocCis);
                pocCis = 0;
            }
        }
    }
}
