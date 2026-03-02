// Richest Customer Wealth

// TC: O(m x n)
public class Leetcode1672 {

    public static int maximumWealth(int accounts[][]) {

        int m = accounts.length;
        int n = accounts[0].length;

        int maxWealth = 0;

        for(int i = 0; i < m; i++) {

            int currWealth = 0;

            for(int j = 0; j < n; j++) {

                currWealth += accounts[i][j];

            }
                if(currWealth > maxWealth) {

                    maxWealth = currWealth;
                }
        }

        return maxWealth;
        
    }

    public static void main(String[] args) {

        int accounts[][] = {{1, 5}, {7, 3}, {3, 5}};

        System.out.println(maximumWealth(accounts));
        
    }
}