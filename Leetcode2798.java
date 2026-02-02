// Number of Employees Who Met the Target

/*

There are n employees in a company, numbered from 0 to n - 1. Each employee i has worked for hours[i] hours in the company.

The company requires each employee to work for at least target hours.

You are given a 0-indexed array of non-negative integers hours of length n and a non-negative integer target.

Return the integer denoting the number of employees who worked at least target hours.

*/

// Optimal Approach - O(n)
public class Leetcode2798 {

    public static int Employees(int hours[], int target) {

        int n = hours.length;
        int count = 0;

        for (int i = 0; i < n; i++) {

            if(hours[i] >= target) {

                count ++;
            }
            
        }

        return count;
        
    }
    public static void main(String[] args) {
        
        int hours[] = {5, 1, 4, 2, 6};

        System.out.println(Employees(hours, 4));
    }
}
