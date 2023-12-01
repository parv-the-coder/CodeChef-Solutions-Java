/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void trappingrainwater(int height[]) {
        int n = height.length;
        // calculate left max boundary -- array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // calculate right max boundary -- array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedwater = 0;
        for (int i = 0; i < n; i++) {
            // waterlevel = min(leftMax boind, RightMaxbound)
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            trappedwater += waterlevel - height[i];
        }
        System.out.println(trappedwater);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while (testcases > 0) {

            int n = sc.nextInt();
            int building[] = new int[n];
            for (int i = 0; i < building.length; i++) {
                building[i] = sc.nextInt();
            }
            trappingrainwater(building);
            testcases--;
        }
    }
}
