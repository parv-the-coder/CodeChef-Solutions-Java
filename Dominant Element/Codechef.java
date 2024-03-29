/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int arr2[] = new int[1001];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                arr2[arr[i]]++;
            }
            Arrays.sort(arr2);
            if (arr2[1000] != arr2[999]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
