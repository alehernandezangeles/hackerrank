import java.util.*;

/**
 * Created by alejandro on 7/31/16.
 * LoveLetterMystery
 */
public class LoveLetterMystery {

    private String[] words;

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named LoveLetterMystery. */
        String[] words = readInput();

        LoveLetterMystery llm = new LoveLetterMystery(words);
        int[] numOps = llm.calc();
        for (int numOp : numOps) {
            System.out.println(numOp);
        }
    }

    private int[] calc() {
        int[] numOps = new int[words.length];

        for (int i=0; i < numOps.length; i++) {
            numOps[i] = calc(words[i]);
        }

        return numOps;
    }

    private int calc(String word) {
        int numOps = 0;
        int wl = word.length();
        if (wl > 1) {
            for (int i = 0; i < wl / 2; i++) {
                numOps += Math.abs(word.charAt(i) - word.charAt(wl - i - 1));
            }
        }

        return numOps;
    }

    public LoveLetterMystery(String[] words) {
        this.words = words;
    }

    private static String[] readInput() {
        Scanner sc = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(sc.nextLine());

        String[] words = new String[numberOfLines];
        for (int i=0; i < numberOfLines; i++) {
            words[i] = sc.nextLine();
        }
        return words;
    }

}
