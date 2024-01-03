import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        sc.nextLine(); 

        while (cases-- > 0) {
            String s = sc.next();
            StringBuilder sb = new StringBuilder(s).reverse();

            if (s.equals(sb.toString())) {
                System.out.println("wins");
            } else {
                System.out.println("loses");
            }
        }
    }
}
