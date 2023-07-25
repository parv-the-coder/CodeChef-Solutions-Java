import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int count = 0;
            for (int i = a; i <= b; i++) {

                int check = i % 10;
                if (check == 2 || check == 3 || check == 9) {
                    count += 1;
                }

            }
            System.out.println(count);
        }
        sc.close();
    }
}
