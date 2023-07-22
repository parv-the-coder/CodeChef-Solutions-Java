/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y=sc.nextInt();
            int X =sc.nextInt();
            int Y = sc.nextInt();
            int water = X/x;
            int pulp = Y/y;
            System.out.println(water+pulp);
        }
        sc.close();
    }
}