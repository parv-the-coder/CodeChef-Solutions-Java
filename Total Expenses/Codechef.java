import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double a = sc.nextInt();
            double b = sc.nextInt();
            double dis = 0;
            if (a > 1000) {
                dis = a * ((0.1) * b);
            }
            System.out.println((a * b) - dis);
        }
        sc.close();
    }
}