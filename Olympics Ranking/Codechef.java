import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int G1 = sc.nextInt();
            int S1 = sc.nextInt();
            int B1 = sc.nextInt();
            int G2 = sc.nextInt();
            int S2 = sc.nextInt();
            int B2 = sc.nextInt();
            int country1 = G1 + S1 + B1;
            int country2 = G2 + S2 + B2;
            if (country1 > country2) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
        sc.close();
    }
}