import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases-- > 0) {
            int digit = sc.nextInt();
            String num = sc.next();

            boolean flag = false;

            for (int i = 0; i < digit; i++) {

                if (num.charAt(i) == '0' || num.charAt(i) == '5') {
                    flag = true;
                }
            }

            if (flag) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
