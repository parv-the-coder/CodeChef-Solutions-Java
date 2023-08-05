/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
public static void main (String[] args) throws java.lang.Exception
{
Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-- > 0) {
            int mass = sc.nextInt();
            int height = sc.nextInt();
            int BMI = mass / (height * height);
            if (BMI <= 18) {
                System.out.println(1);
            } else if (BMI <= 24) {
                System.out.println(2);
            } else if (BMI <= 29) {
                System.out.println(3);

            } else if (BMI >= 30) {
                System.out.println(4);
            }
        }
        sc.close();
}
}

