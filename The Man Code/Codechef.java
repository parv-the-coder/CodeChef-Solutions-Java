import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int max, min;
            if (n % 2 == 0) {
                max = n / 2;
                min = n / 2;
            } else {
                max = (n / 2) + 1;
                min = n / 2;
            }
            System.out.println(max + " " + min);
        }
    }
}
