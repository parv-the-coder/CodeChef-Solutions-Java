/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            double z = n - n * 0.1;
            if (m > z) {
                System.out.println("ONLINE");
            } else if (m < z) {
                System.out.println("DINING");
            } else {
                System.out.println("EITHER");
            }
        }
        sc.close();
    }
}
