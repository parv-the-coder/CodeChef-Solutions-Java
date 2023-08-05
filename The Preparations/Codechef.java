import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
public static void main (String[] args) throws java.lang.Exception
{
Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-- > 0) {
            int exam = sc.nextInt();
            int episode = sc.nextInt();
            int time = sc.nextInt();
            if (exam > episode * time) {
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