package neetcode.Easy;

import java.util.Arrays;
import java.util.HashSet;

public class CheckDuplicate {

    //This is a Brute-Force Approach. Time Complexity = O(n^2).This method involves comparing each element with every other element, leading to a quadratic time complexity.
    //Space Complexity: O(1). No additional data structures are used, so the space complexity is constant.
    public boolean hasDuplicate(int[] nums) {
        for(int i = 0 ; i< nums.length ; i++){
            for(int j=i+1 ; j < nums.length ; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
 
    }

    //Time Complexity: O(nlogn). Sorting the array typically takes O(nlogn)
    //Space Complexity: O(1). Sorting can be done in-place if the array can be modified, so additional space usage is minimal.
    public boolean hasDuplicateSortArray(int[] nums){
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;

    }

    //This is Optimal Solution as 
    //Time Complexity = O(n). As we iterate through the array once, adding elements to the HashSet. Each insertion and lookup operation in a HashSet takes O(1) on average
    // Space Complexity: O(n). In the worst case, if there are no duplicates, you may need to store all n elements in the HashSet.
    public boolean hasDuplicateOptimalSolution(int[] nums){
       HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;

    }

    public static void main(String[] args) {
        CheckDuplicate checkDuplicate = new CheckDuplicate();
        int[] arr ={1,2,3,3};
        System.out.println("Array has Duplicates : "+checkDuplicate.hasDuplicateOptimalSolution(arr));

        
    }
    
}
