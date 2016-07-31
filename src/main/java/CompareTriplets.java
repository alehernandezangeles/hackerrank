import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CompareTriplets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();

        int[] res = new int[2];
        calc(a0, b0, res);
        calc(a1, b1, res);
        calc(a2, b2, res);

        System.out.println(res[0] + " " + res[1]);
    }

    private static void calc(int a, int b, int[] res) {
        if (a > b) { res[0]++; }
        else if (a < b) { res[1]++; }
    }

}

