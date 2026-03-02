// Diagonal Prime


public class Leetcode2614 {
    
    public static int diagonalPrime(int nums[][]) {

        int n = nums.length;
        int maxPrime = 0;

        for (int i = 0; i < n; i++) {

            int a = nums[i][i];             // Primary diagonal
            int b = nums[i][n - i - 1];     // Secondary diagonal

            if (isPrime(a)) {

                maxPrime = Math.max(maxPrime, a);
            }

            if (isPrime(b)) {

                maxPrime = Math.max(maxPrime, b);
            }
        }

        return maxPrime;
    }

    public static boolean isPrime(int n) {

        if (n <= 1) 
            
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) { 

            if (n % i == 0) {

                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {

        int[][] nums = {{1, 2, 3},{5, 6, 7},{9, 10, 11}};

        System.out.println(diagonalPrime(nums));

    }
}
