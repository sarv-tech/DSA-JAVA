// Neither Minimum nor Maximum

// TC: O(n)
public class Leetcode2733 {

    public static int findNonMinOrMax(int nums[]) {

        int n = nums.length;

        if (n < 3) {

            return -1;

        }

        int min = nums[0];
        int max = nums[0];

        for (int i = 0; i < n; i++) {

            if (nums[i] < min) {

                min = nums[i];
            }

            if (nums[i] > max) {

                max = nums[i];
            }
        }

        for (int i = 0; i < n; i++) {

            if (nums[i] != min && nums[i] != max) {

                return nums[i];
            }
        }

        return -1;
        
    }
    
    public static void main(String[] args) {

        int nums[] = {3, 2, 1, 4};

        System.out.println(findNonMinOrMax(nums));
        
    }
}
