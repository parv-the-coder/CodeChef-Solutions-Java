import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
public static void main (String[] args) throws java.lang.Exception
{
Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-- > 0) {
            int salary = sc.nextInt();
            double HRA = 0;
            double DA = 0;
            if (salary < 1500) {
                HRA = salary * 0.1;
                DA = salary * 0.9;
            } else {
                HRA = 500;
                DA = salary * 0.98;
            }
            System.out.println(salary + HRA + DA);

        }
        sc.close();
}
}