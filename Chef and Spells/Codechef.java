import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int combo1 = a + b;
            int combo2 = b + c;
            int combo3 = a + c;
            System.out.println(Math.max(Math.max(combo1, combo2), combo3));
        }
        sc.close();
    }
}