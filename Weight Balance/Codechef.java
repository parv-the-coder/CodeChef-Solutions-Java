import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int w1 = sc.nextInt();
            int w2 = sc.nextInt();
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int m = sc.nextInt();

            int minWeight = w1 + (x1 * m);
            int maxWeight = w1 + (x2 * m);

            if (w2 >= minWeight && w2 <= maxWeight) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        sc.close();
    }
}