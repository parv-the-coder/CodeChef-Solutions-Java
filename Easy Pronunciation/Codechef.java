import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            int consonant = 0;
            boolean check = true;
            for (char c : s.toCharArray()) {
                if (!isVowel(c)) {
                    consonant++;
                    if (consonant >= 4) {
                        check = false;
                        break;
                    }
                } else {
                    consonant = 0;
                }
            }

            System.out.println(check ? "YES" : "NO");
        }

        sc.close();
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
