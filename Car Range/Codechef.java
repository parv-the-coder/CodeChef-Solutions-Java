import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int person = sc.nextInt();
            int economy = sc.nextInt();
            int litres = sc.nextInt();
            int effective = economy - person + 1;
            int max = litres*effective;
            System.out.println(max);
        }
        sc.close();
    }
}