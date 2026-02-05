// Left and Right Sum Differences 


import java.util.*;

// Optimized Approach - O(n)
public class Leetcode2574 {

    public static int[] leftRight(int[] nums) {

        int n = nums.length;

        int ans[] = new int[n];
        int leftSum[] = new int[n];
        int rightSum[] = new int[n];

        int sum = 0;

        for(int i = 0; i < n; i++) {

            leftSum[i] = sum;

            sum = sum + nums[i];

        }

        sum = 0;

        for(int i = n - 1; i >= 0; i--) {

            rightSum[i] = sum;

            sum = sum + nums[i];

        }

        for(int i = 0; i < n; i++) {

            ans[i] = Math.abs(leftSum[i] - rightSum[i]);

        }

        return ans;
        
    }
    
    public static void main(String[] args) {

        int nums[] = {10, 4, 8, 3};

        System.out.println(Arrays.toString(leftRight(nums)));
    }
}
