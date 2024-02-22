import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while (t-- > 0) {
            long n = sc.nextLong();

            int count = 0;
            int pos = 0;
            for (int i = 31; i >= 0; i--) {
                if ((n & (1L << i)) != 0) {
                    if (pos == 0) {
                        pos = i;
                    }
                    if (count == 0 || count == 2) {
                        count++;
                    }
                } else {
                    if (count == 1) {
                        count = 2;
                    }
                }
            }

            if (count != 3) {
                System.out.println(0);
                continue;
            }

            long currentnum = 0;
            long ans = Long.MAX_VALUE;
            for (int i = pos; i >= 0; i--) {
                currentnum += Math.pow(2, i);
                if (currentnum < n) {
                    continue;
                }
                ans = Math.min(ans, currentnum - n);
            }
            System.out.println(ans);
        }
    }
}