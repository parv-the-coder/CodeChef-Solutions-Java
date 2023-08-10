/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == 1 && b == 1) {
            System.out.println("https://discuss.codechef.com");
        } else if (a == 1) {
            System.out.println("https://www.codechef.com/contests");
        } else {
            System.out.println("https://www.codechef.com/practice");
        }
        sc.close();
    }
}
