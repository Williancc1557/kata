import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        System.out.println(ex());

    }
    public static String ex() {

        String[] deckSteve = {"A", "7", "8"};
        String[] deckJosh = {"K", "5", "9"};

        int stevePoints = 0;
        int joshPoints = 0;
        for (int i = 0; i < deckSteve.length -1; i++) {
            int steveScore = calculatePoints(deckSteve[i]);
            int joshStore = calculatePoints(deckJosh[i]);

            if (steveScore > joshStore) {
                stevePoints += 1;
            } else if (steveScore == joshStore) {
                stevePoints += 0;
                joshPoints += 0;
            } else {
                joshPoints += 1;
            }
        }

        if (stevePoints > joshPoints) {
            return "Steve wins" + Integer.toString(stevePoints) + "to" + Integer.toString(joshPoints);
        } else if (stevePoints == joshPoints) {
            return "Tie";
        } else {
            return "Josh wins" + Integer.toString(joshPoints) + "to" + Integer.toString(stevePoints);
        }
    }

    public static int calculatePoints(String point) {
        String[] rank = {"2","3","4","5","6","7","8","9","T","J","Q","K","A"};

        return Arrays.asList(rank).indexOf(point);
    }
}