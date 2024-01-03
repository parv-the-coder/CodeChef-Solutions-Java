import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases-- > 0) {
            int friends = sc.nextInt();
            int arr[] = new int[friends];
            int saved = 1;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] != arr[i + 1]) {
                    saved++;
                }
            }
            System.out.println(saved);
        }
    }
}
