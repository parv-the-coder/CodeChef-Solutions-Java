import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        int chef = 20;
        int chefina = 10;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int age = sc.nextInt();
            int difference = age - chef;
            int result = chefina + difference;
            System.out.println(result);
        }
    }
}
