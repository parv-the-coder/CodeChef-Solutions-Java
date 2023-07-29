/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static String findWinner(int A, int B) {
        int limakCandies = 1;
        int bobCandies = 2;

        while (true) {
            // Limak's turn
            if (limakCandies <= A) {
                A -= limakCandies;
            } else {
                return "Bob";
            }

            // Bob's turn
            if (bobCandies <= B) {
                B -= bobCandies;
            } else {
                return "Limak";
            }

            // Update candies for the next round
            limakCandies += 2;
            bobCandies += 2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            String winner = findWinner(A, B);
            System.out.println(winner);
        }
        scanner.close();
    }
}
