// Maximum Count of Positive Integer and Negative Integer


public class Leetcode2529 {

    public static int maximumCount(int nums[]) {

        int n = nums.length;

        int pos = 0;
        int neg = 0;

        for(int i = 0; i < n; i++) {

            if(nums[i] > 0) {

                pos++;
            }

            else if(nums[i] < 0) {

                neg++;
            }
        }

        return Math.max(pos, neg);
    }

    public static void main(String[] args) {

        int nums[] = {-3, -2, -1, 0, 0, 1, 2};

        System.out.println(maximumCount(nums));
        
    }

}
