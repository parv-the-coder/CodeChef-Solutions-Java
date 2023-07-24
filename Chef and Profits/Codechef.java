import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
public static void main (String[] args) throws java.lang.Exception
{
Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int stock = sc.nextInt();
            int buying = sc.nextInt();
            int selling = sc.nextInt();
            int profit = (stock*selling) - (stock*buying);
            System.out.println(profit);
        }
        sc.close();
}
}