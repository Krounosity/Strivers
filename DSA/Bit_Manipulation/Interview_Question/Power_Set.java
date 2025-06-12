import java.util.ArrayList;

// This is an implementation using bit manipulation
// I am tracking the inclusion/exclusion of each number as the bit value in the number of that iteration.

/* Explanation
 * 
 * I see that the power sets are created by either including or excluding a particular number in a set.
 * Each number can either be included or excluded. Therefore, the number of iterations are 2^n.
 * 
 * We will traverse all numbers from 0 to 2^n, as each number between and including 0 and 2^n will act
 * as one of the power set's set.
 * 
 * Hence we will use a temporary variable to assume the value of the current iteration and then check
 * the set bits of that temporary variable. The value of the bit will determine the inclusion of the
 * corresponding number in the array. If the bit is 0, the corresponding number in the array will not
 * be included, and if the bit is 1 the number will be included.
 * 
 * Time Complexity: O(n2^n)
 * Space Complexity: O(1) (auxiliary)
 */

class Power_Set {
    public ArrayList<ArrayList<Integer>> subsets(int[] nums) {
        
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        int power = (int) (Math.pow(2,nums.length));

        for(int i=0; i<power; i++){
            int temp = i;
            ArrayList<Integer> tempList = new ArrayList<>();
            
            for(int j = 0; temp > 0; j++){
                if(temp % 2 == 1) tempList.add(nums[j]);
                temp >>= 1;
            }

            res.add(tempList);
        }

        return res;
    }
}