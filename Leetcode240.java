// Search in 2D Matrix - II

// TC: (m + n) - StairCase Approach
public class Leetcode240 {

    public static boolean searchMatrix_II(int mat[][], int target) {

        int m = 0, n = mat[0].length - 1;

        while(m < mat.length && n >= 0) {

            if(mat[m][n] == target) {

                return true;
            }

            else if(mat[m][n] < target) {

                m++;
            }
            else {

                n--;
            }
        }

        return false;

    }
    public static void main(String[] args) {
        
        int mat[][] = { {1, 4, 7, 11, 15},
                        {2, 5, 8, 12, 9},
                        {3, 6, 9, 16, 22},
                        {10, 13, 14, 17, 24},
                        {18, 21, 23, 26, 30} 
                    };

        System.out.println(searchMatrix_II(mat, 5));

    }
}
