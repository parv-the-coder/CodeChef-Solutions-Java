import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
public static void main (String[] args) throws java.lang.Exception
{
Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int fact=1;
            for (int i = n; i >0; i--) {
                fact = fact*i;
            }
            System.out.println(fact);
        }
        sc.close();
}
}