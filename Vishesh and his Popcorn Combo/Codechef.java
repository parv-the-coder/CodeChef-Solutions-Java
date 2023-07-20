/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int A1 = sc.nextInt();
            int A2 = sc.nextInt();
            int B1 = sc.nextInt();
            int B2 = sc.nextInt();
            int C1 = sc.nextInt();
            int C2 = sc.nextInt();
            int x = Math.max(A1+A2, B1+B2);
            int result = Math.max(x, C1 + C2);
            System.out.println(result);
        }
        sc.close();
	}
}
