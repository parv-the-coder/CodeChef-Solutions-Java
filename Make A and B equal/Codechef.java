import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == b) {
                System.out.println("Yes");
            } else {
                if (b > a) {
                    while (a <= b) {
                        a = a * 2;
                        if (a == b) {
                            System.out.println("YES");
                            break;
                        }
                        // System.out.println(a);
                    }

                    if (a != b) {
                        System.out.println("NO");
                    }
                } else {
                    while (b <= a) {
                        b = b * 2;
                        if (a == b) {
                            System.out.println("YES");
                            break;
                        }
                    }

                    if (a != b) {
                        System.out.println("NO");
                    }

                }
            }
        }
        sc.close();
    }
}