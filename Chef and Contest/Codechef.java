/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int chef_t= sc.nextInt();
            int chefina_t= sc.nextInt();
            int chef_w= sc.nextInt();
            int chefina_w= sc.nextInt();

            int chef= chef_t + (chef_w*10);
            int chefina= chefina_t + (chefina_w*10);

            if(chef<chefina)
            {
                System.out.println("Chef");
            }
            else if(chef==chefina)
            {
                System.out.println("Draw");
            }
            else
            {
                System.out.println("Chefina");
            }

        }
        sc.close();
    }
}
