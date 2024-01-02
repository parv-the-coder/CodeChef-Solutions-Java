import java.util.Arrays;
import java.util.Scanner;

public class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int sum = 0;

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            Arrays.sort(a);
            for (int i = n - 1; i > 0; i--) {
                if (a[i] != a[i - 1]) {
                    sum = a[i] + a[i - 1];
                    break;
                }
            }
            System.out.println(sum);
        }
    }
}
