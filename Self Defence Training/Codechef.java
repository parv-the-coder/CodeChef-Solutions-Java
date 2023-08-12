
/* package codechef; // don't place package name! */
import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int count = 0;
            for (int j = 0; j < a; j++) {
                int b = sc.nextInt();
                if (b >= 10 && b <= 60) {
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
