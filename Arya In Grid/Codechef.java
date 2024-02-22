import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            long n = scanner.nextInt();
            long m = scanner.nextInt();
            long x = scanner.nextInt();
            long y = scanner.nextInt();
            long l = scanner.nextInt();

            long total = n * m;
            long ans = 1;

            long row = 1;
            long right = m - y;
            right = right / l;
            row = row + right;
            long left = y - 1;
            left = left / l;
            row = row + left;

            long cols = 1 + (n - x) / l + (x - 1) / l;
            ans = row * cols;
            System.out.println(ans);
        }
        scanner.close();

    }
}
