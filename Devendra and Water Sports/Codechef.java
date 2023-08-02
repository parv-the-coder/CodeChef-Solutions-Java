
/* package codechef; // don't place package name! */
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-- > 0) {
            int money = sc.nextInt();
            int spent = sc.nextInt();
            int saved = money - spent;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int need = a + b + c;
            if (saved >= need) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
