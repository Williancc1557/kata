// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(solution("world"));
    }

    public static String solution(String str) {
        return invert(str);
    }

    private static String invert(String word) {
        String inverseWord = "";

        for (char str : word.toCharArray()) {
            inverseWord = str + inverseWord;
        }

        return inverseWord;
    }
}