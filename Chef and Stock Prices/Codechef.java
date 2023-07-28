import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int price = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int change = sc.nextInt();
            double result = price + (price * (change / 100.0));
            if (result >= a && result <= b) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}