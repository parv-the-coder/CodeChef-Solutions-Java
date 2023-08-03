import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long mg = sc.nextLong();
            long my = sc.nextLong();
            long mr = sc.nextLong();
            long og = sc.nextLong();
            long oy = sc.nextLong();
            long or = sc.nextLong();
            long pg = sc.nextLong();
            long py = sc.nextLong();
            long pr = sc.nextLong();

            long ans = 0;

            long temp1 = pg + py + pr;
            long temp2 = mg + my + mr;
            long temp3 = og + oy + or;

            ans = (long) Math.max(Math.max(ans, temp1), Math.max(temp2, temp3));

            long temp4 = pg + mg + og;
            long temp5 = py + my + oy;
            long temp6 = pr + mr + or;

            ans = (long) Math.max(Math.max(ans, temp4), Math.max(temp5, temp6));

            if ((ans & 1) == 0 && ans != 0) {
                System.out.println(ans - 1);
            } else {
                System.out.println(ans);
            }
        }
        sc.close();
    }
}