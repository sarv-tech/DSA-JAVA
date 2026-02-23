// Matrix Diagonal Sum


// TC: O(n) - Optimized Approach
public class Leetcode1572 {

    public static int diagonalSum(int mat[][]) {

        int n = mat.length;
        int sum = 0;

        for(int i = 0; i < n; i++) {

            //pd
            sum += mat[i][i];

            // sd
            if(i != n - 1 - i) {

                sum += mat[i][n - i - 1];
            }
        }

        return sum;
        
    }
    
    public static void main(String[] args) {
        
        int mat[][] = {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                    };

                    System.out.println(diagonalSum(mat));
    }
}
