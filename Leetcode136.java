// Single Number


// Brute Force Approach - O(n²), SC: O(1)
public class Leetcode136 {

    public static int singleNumber(int[] nums) {
    
            int n = nums.length;
    
            for(int i = 0; i < n; i++) {
    
                int count = 0;
    
                int num = nums[i];
    
                for(int j = 0; j < n; j++) {
    
                    if(num == nums[j]) {
    
                        count++;
                    }
                }
    
                if(count == 1) {
    
                    return num;
                }
            }
    
            return -1;
        }
        public static void main(String[] args) {
    
            int nums[] = {4, 1, 2, 1, 2};
    
            System.out.println(singleNumber(nums));
    }
}
