import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        // Input the two numbers and the operator
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        String operator = sc.next();

        // Perform the operation based on the operator
        double result = 0;
        switch (operator) {
            case "+":
                result = A + B;
                break;
            case "-":
                result = A - B;
                break;
            case "*":
                result = A * B;
                break;
            case "/":
                if (B != 0) {
                    result = A / B;
                } else {
                    System.out.println("Cannot divide by zero!");

                }
                break;
            default:
                System.out.println("Invalid operator!");

        }

        System.out.println(result);

        sc.close();
    }
}
