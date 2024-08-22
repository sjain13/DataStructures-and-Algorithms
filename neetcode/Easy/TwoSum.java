package neetcode.Easy;

import java.util.HashMap;


//Input: 
// nums = [3,4,5,6], target = 7
// Output: [0,1]

public class TwoSum {

    public static void main(String[] args) {
        
    }
    public int[] twoSum(int[] nums, int target) {
       // Create a HashMap to store the value and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement of the current element
            int complement = target - nums[i];

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // If it exists, return the indices
                return new int[] {map.get(complement), i};
            }

            // If not, add the current element and its index to the map
            map.put(nums[i], i);
        }

        // If no solution is found, return an empty array (this shouldn't happen as per the problem statement)
        return new int[] {};
    }
    
}
