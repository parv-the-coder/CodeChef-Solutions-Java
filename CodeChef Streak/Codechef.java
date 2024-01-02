import java.util.Scanner;

public class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
            int count_Om = 0;
            int count_Addy = 0;
            int max_Om = 0;
            int max_Addy = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] != 0) {
                    count_Om++;
                }
                max_Om = Math.max(max_Om, count_Om);
                if (a[i] == 0) {
                    count_Om = 0;
                }
                if (b[i] != 0) {
                    count_Addy++;
                }
                max_Addy = Math.max(max_Addy, count_Addy);
                if (b[i] == 0) {
                    count_Addy = 0;
                }

            }
            if (max_Addy > max_Om) {
                System.out.println("Addy");
            } else if (max_Addy < max_Om) {
                System.out.println("Om");
            } else {
                System.out.println("Draw");
            }
        }
    }
}
