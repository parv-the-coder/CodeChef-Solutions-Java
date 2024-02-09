import java.util.*;

public class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            int max = 1;
            int curr = 1;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] == arr[i - 1]) {
                    curr++;
                } else {
                    max = Math.max(max, curr);
                    curr = 1;
                }
            }

            max = Math.max(max, curr);
            int ans = n - max;
            System.out.println(ans);
        }
        sc.close();
    }
}
