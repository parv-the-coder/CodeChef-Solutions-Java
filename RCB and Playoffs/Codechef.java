import java.util.*;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
public static void main (String[] args) throws java.lang.Exception
{
Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-- > 0) {
            int point = sc.nextInt();
            int required = sc.nextInt();
            int game = sc.nextInt();
            if(point+2*game >= required)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
        sc.close();
}
}

