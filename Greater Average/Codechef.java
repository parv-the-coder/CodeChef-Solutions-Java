import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            float a = sc.nextInt();
            float b = sc.nextInt();
            int c = sc.nextInt();
            if ((a + b) / 2 > c) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
