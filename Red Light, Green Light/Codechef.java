import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {

            int t = sc.nextInt();
            int max = sc.nextInt();
            int shot = 0;
            while (t-- > 0) {
                int temp = sc.nextInt();
                if (temp > max) {
                    shot++;
                }
            }
            System.out.println(shot);
        }
    }
}
