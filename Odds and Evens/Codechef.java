/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a+b;
            if(sum%2==0)
            {
                System.out.println("Bob");
            }
            else
            {
                System.out.println("Alice");

            }
        }
        sc.close();
	}
}
