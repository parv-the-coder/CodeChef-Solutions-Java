import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int people = sc.nextInt();
            int infected = sc.nextInt();
            int safe = people - infected;
            int result = Math.min(safe, infected);
            System.out.println(result);
        }
        sc.close();
    }
}