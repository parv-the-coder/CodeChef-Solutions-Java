import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                int x = sc.nextInt();
                sum = sum + x;
            }
            if (sum == 0) {
                System.out.println("Beginner");
            } else if (sum == 1) {
                System.out.println("Junior Developer");

            } else if (sum == 2) {
                System.out.println("Middle Developer");

            } else if (sum == 3) {
                System.out.println("Senior Developer");

            } else if (sum == 4) {
                System.out.println("Hacker");

            } else if (sum == 5) {
                System.out.println("Jeff Dean");

            }

        }
        sc.close();
    }
}
