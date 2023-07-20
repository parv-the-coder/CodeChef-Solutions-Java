/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            // Read correct answers
            int A1 = sc.nextInt();
            int A2 = sc.nextInt();
            int A3 = sc.nextInt();

            // Read hero's responses
            int B1 = sc.nextInt();
            int B2 = sc.nextInt();
            int B3 = sc.nextInt();

            // Calculate the count of 'Yes' and 'No' in correct answers
            int yesCountCorrect = A1 + A2 + A3;
            int noCountCorrect = 3 - yesCountCorrect;

            // Calculate the count of 'Yes' and 'No' in hero's responses
            int yesCountResponse = B1 + B2 + B3;
            int noCountResponse = 3 - yesCountResponse;

            // Check if counts of 'Yes' and 'No' are the same for both correct answers and
            // responses
            if (yesCountCorrect == yesCountResponse && noCountCorrect == noCountResponse) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        }
        sc.close();
    }
}