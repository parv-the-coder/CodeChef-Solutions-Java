import java.util.*;

class Codechef
{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
         sc.nextLine();
       while(T-->0) {
            String password = sc.nextLine();

            if (isValidPassword(password)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }

    public static boolean isValidPassword(String password) {
        boolean hasLowerCase = false;
        boolean hasUpperCaseInside = false;
        boolean hasDigitInside = false;
        boolean hasSpecialCharInside = false;

        if (password.length() < 10) {
            return false;
        }

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isUpperCase(c)) {
                if (i > 0 && i < password.length() - 1) {
                    hasUpperCaseInside = true;
                }
            } else if (Character.isDigit(c)) {
                if (i > 0 && i < password.length() - 1) {
                    hasDigitInside = true;
                }
            } else if (c == '@' || c == '#' || c == '%' || c == '&' || c == '?') {
                if (i > 0 && i < password.length() - 1) {
                    hasSpecialCharInside = true;
                }
            }
        }

        return hasLowerCase && hasUpperCaseInside && hasDigitInside && hasSpecialCharInside;
    }
}