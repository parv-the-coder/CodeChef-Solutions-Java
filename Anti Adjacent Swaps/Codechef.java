import java.util.Scanner;

public class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            if (n == 2) {
                if (a[0] > a[1]) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
                continue;
            }
            if (n == 3) {
                if (a[1] < Math.min(a[2], a[0]) || a[1] > Math.max(a[2], a[0])) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
                continue;
            }
            System.out.println("YES");
        }
    }
}
