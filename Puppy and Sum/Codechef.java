import java.util.*;

class Codechef {

    public static int sum(int n) {
        return (n * (n + 1)) / 2;
    }

    public static int sumD(int D, int N) {
        for (int i = 0; i < D; i++) {
            N = sum(N);
        }
        return N;
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int D = sc.nextInt();
            int N = sc.nextInt();
            System.out.println(sumD(D, N));
        }
        sc.close();
    }
}