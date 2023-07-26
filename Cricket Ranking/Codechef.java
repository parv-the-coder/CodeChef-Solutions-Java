import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int r1 = sc.nextInt();
            int w1 = sc.nextInt();
            int c1 = sc.nextInt();
            int r2 = sc.nextInt();
            int w2 = sc.nextInt();
            int c2 = sc.nextInt();
            int a = 0;
            int b = 0;
            if (r1 > r2) {
                a++;
            } else {
                b++;
            }
            if (w1 > w2) {
                a++;
            } else {
                b++;
            }
            if (c1 > c2) {
                a++;
            } else {
                b++;
            }
            if (a > b) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
            sc.close();
        }
    }
}
