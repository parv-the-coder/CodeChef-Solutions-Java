import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int x = sc.nextInt();
            if (x > 100) {
                x -= 10;
                System.out.println(x);
            } else {
                System.out.println(x);
            }
        }
        sc.close();
    }
}
