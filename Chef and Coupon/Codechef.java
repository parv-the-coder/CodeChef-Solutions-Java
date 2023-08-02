
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int delivery = sc.nextInt();
            int coupon = sc.nextInt();
            int A1 = sc.nextInt();
            int A2 = sc.nextInt();
            int A3 = sc.nextInt();
            int B1 = sc.nextInt();
            int B2 = sc.nextInt();
            int B3 = sc.nextInt();
            int day1 = A1 + A2 + A3;
            int day2 = B1 + B2 + B3;
            int sum1c = day1 + day2 + coupon;
            int sum1d = day1 + day2 + 2 * delivery;
            if (day1 < 150) {
                sum1c = sum1c + delivery;
            }
            if (day2 < 150) {
                sum1c = sum1c + delivery;
            }
            if (sum1d > sum1c) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }

}