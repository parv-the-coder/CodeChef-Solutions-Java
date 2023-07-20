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
            int person = sc.nextInt() + 1;
            int gold = sc.nextInt();
            int capacity = sc.nextInt();
            int max= person * capacity;
            // System.out.println(max);
            if(max>=gold)
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
