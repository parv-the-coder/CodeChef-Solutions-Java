import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int ans = 0;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < 22; i++) {
                int score = 0;
                int run = sc.nextInt();
                int wicket = sc.nextInt();
                score = run + (wicket * 20);
                if (score > max) {
                    ans = i + 1;
                    max = score;
                }
            }
            System.out.println(ans);
        }

    }
}
