import java.util.Scanner;

public class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int count = 0;

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if ((a[i] > (2 * b[i])) || (b[i] > (2 * a[i]))) {
                    continue;
                } else {
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
