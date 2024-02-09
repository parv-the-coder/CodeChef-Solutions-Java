import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int size = sc.nextInt();
            int speed = sc.nextInt();

            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            int maxImpressed = 0;

            for (int i = 0; i <= arr.length - speed; i++) {
                int impressed = 0;
                for (int j = i; j < i + speed; j++) {
                    impressed += arr[j];
                }
                maxImpressed = Math.max(maxImpressed, impressed);
            }
            System.out.println(maxImpressed);
        }

    }
}
