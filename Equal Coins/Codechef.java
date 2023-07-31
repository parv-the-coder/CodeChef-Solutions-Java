import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if ((x % 2 != 0) || (y % 2 != 0 && x == 0)) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

        sc.close();
    }
}