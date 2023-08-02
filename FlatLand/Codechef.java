

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int size = sc.nextInt();
            int n = 0;
            int count = 0;
            while (size > 0) {
                n = (int) Math.floor(Math.sqrt(size));
                size = size - (n * n);
                count += 1;
            }
            System.out.println(count);
        }
        sc.close();
    }

}