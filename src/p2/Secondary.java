package p2;

import java.util.Arrays;

public class Secondary {
    public static void main(String[] jagger) {
        int [] hand = {21,23,5,2,4};
        System.out.println("Largest value in hand is " + max(hand));
        for (int each : hand) {
            System.out.println(each);
        }
    }
    private static int max(int[] hand) {
        int guess = hand[0];
        for (int each : hand){
            if (each > guess) {
                guess = each;
            }
        }
        Arrays.sort(hand);

        return guess;
    }
}
