// Find Numbers with Even Number of Digits.


// Optimized Approach - O(n)
public class Leetcode1295 {

    public static int findNumbers(int nums[]) {

        int n = nums.length;
        int count = 0;

        for(int i = 0; i < n; i++) {

            int num = nums[i];
            int digits = 0;

            while(num > 0) {

                num = num / 10;    // get digit of num
                digits++;         // count digit of num
            }

            if(digits % 2 == 0) {

                count++;  // count digit of num if it is even
            }
        }

        return count;
    }
    public static void main(String args[]) {

        int nums[] = {12, 345, 2, 6, 7896};

        System.out.println(findNumbers(nums));
    }
}
