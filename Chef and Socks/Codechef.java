import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int jacket = sc.nextInt();
        int socks = sc.nextInt();
        int money = sc.nextInt();
        money = money - jacket;
        int pair = money / socks;
        if (pair % 2 == 0) {
            System.out.println("Lucky Chef");
        } else {
            System.out.println("Unlucky Chef");
        }
        sc.close();
    }
}
