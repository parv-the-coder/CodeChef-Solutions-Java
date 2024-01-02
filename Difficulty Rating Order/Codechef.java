import java.util.Scanner;

public class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] d = new int[n];
            int flag = 0;

            for (int i = 0; i < n; i++) {
                d[i] = scanner.nextInt();
            }
            for (int i = 1; i < d.length; i++) {
                if (d[i] < d[i - 1]) {
                    System.out.println("No");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("Yes");
            }
        }
    }
}
