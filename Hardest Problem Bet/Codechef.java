/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int SA = sc.nextInt();
            int SB = sc.nextInt();
            int SC = sc.nextInt();
            int result = Math.min(SA, Math.min(SB, SC));
            if (result == SA) {
                System.out.println("Draw");
            } else if (result == SB) {
                System.out.println("Bob");
            } else {
                System.out.println("Alice");
            }
        }
        sc.close();
    }
}
