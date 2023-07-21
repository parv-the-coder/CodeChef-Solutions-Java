import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int nitin = sc.nextInt();
            int sobhagya = sc.nextInt();
            int ritik = sc.nextInt();
            int satyarth = sc.nextInt();
            if (nitin < sobhagya) {
                nitin += ritik;
                if (nitin < sobhagya) {
                    nitin += satyarth;
                    if (nitin < sobhagya) {
                        System.out.println("S");
                    } else {
                        System.out.println("N");
                    }
                } else {
                    sobhagya += satyarth;
                    if (nitin < sobhagya) {
                        System.out.println("S");
                    } else {
                        System.out.println("N");
                    }

                }
            } else {
                sobhagya += ritik;
                if (nitin < sobhagya) {
                    nitin += satyarth;
                    if (nitin < sobhagya) {
                        System.out.println("S");
                    } else {
                        System.out.println("N");
                    }
                } else {
                    sobhagya += satyarth;
                    if (nitin < sobhagya) {
                        System.out.println("S");
                    } else {
                        System.out.println("N");
                    }

                }

            }
        }
        sc.close();
    }
}