import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases-- > 0) {
            int num_dolls = sc.nextInt();
            int type = 0;
            for (int i = 0; i < num_dolls; ++i)
                type ^= sc.nextInt();
            System.out.println(type);
        }

    }

}
