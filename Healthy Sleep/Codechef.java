import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        if (h < 8) {
            System.out.println("LESS");
        } else if (h == 8) {
            System.out.println("PERFECT");
        } else {
            System.out.println("MORE");
        }

    }
}
