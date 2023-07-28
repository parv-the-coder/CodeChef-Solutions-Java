import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int rupees = sc.nextInt();
            int pizza = sc.nextInt();
            int burger = sc.nextInt();
            if (pizza <= rupees) {
                System.out.println("PIZZA");
            } else if (burger <= rupees) {
                System.out.println("BURGER");
            } else {
                System.out.println("NOTHING");
            }
        }
        sc.close();
    }
}
