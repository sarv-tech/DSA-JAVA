// Toeplitz Matrix


// TC : O(n x m)
public class Leetcode766 {

    public static boolean isToeplitzMatrix(int matrix[][]) {
        
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i = 0; i < n - 1; i++) {

            for(int j = 0; j < m - 1; j++) {

                if(matrix[i][j] != matrix[i + 1][j + 1]) {

                    return false;
                }
            }
        }

        return true;
    }
    
    public static void main(String[] args) {

        int matrix[][] = {{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}};

        System.out.println(isToeplitzMatrix(matrix));
        
    }
}
