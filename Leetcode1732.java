// Find the Highest Altitude


// Optimal Approach - O(n)
public class Leetcode1732 {

    public static int highestAltitude(int gain[]) {

        int n = gain.length;

        int currAltitude = 0;
        int maxAltitude = 0;

        for(int i = 0; i < n; i++) {

            currAltitude += gain[i];

            if(currAltitude > maxAltitude) {   // compare current and maximum Altitude

                maxAltitude = currAltitude;   // if curr Alt is maximum then store in max Alt
            }
        }

        return maxAltitude;
        
    }
    public static void main(String args[]) {

        int gain[] = {-5, 1, 5, 0, -1};

        System.out.println("Highest Altitude is: " + highestAltitude(gain));

    }
}
