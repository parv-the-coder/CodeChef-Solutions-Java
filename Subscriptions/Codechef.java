import java.util.Scanner;

public class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while (t-- > 0) {
            int n = sc.nextInt(); 
            int x = sc.nextInt(); 

            int totalCost = (n + 5) / 6 * x;
            System.out.println(totalCost);
        }
    }
}
