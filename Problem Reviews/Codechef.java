import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static String solve(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 4) {
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int size = sc.nextInt();
            int arr[] = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(solve(arr));
        }

    }
}
