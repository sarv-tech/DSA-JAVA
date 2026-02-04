// Missing Number


// Optimal Solution - O(n)
public class Leetcode268 {

    public static int missingNumber(int nums[]) {

        int n = nums.length;
        int count = 0;

        for(int i = 0; i < n; i++) {

            count += nums[i];

        }

        int expectedSum = n * (n + 1) / 2;

        return expectedSum - count;
        
    }
    public static void main(String[] args) {
        
        int nums[] = {3, 0, 1};

        System.out.println("Missing Number is: " + missingNumber(nums));
    }
}
