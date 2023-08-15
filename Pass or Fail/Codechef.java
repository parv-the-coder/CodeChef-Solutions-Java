/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int questions = sc.nextInt();
            int correct = sc.nextInt();
            int pass = sc.nextInt();
            int wrong = questions - correct;
            int total = correct * 3 - wrong;
            if (total >= pass) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }
        }
        sc.close();
    }
}
