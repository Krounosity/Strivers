import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);

        /* We will do nothing else than run
            2sum for array nums[i+1, n-1] for
            each index i
            
            and the sum of the windows edges of the subarray and
            nums[i] should be equal to the desired sum
            to be included in the answer*/
        
        // Hashset so that we count only unique triplets
        Set<List<Integer>> res = new HashSet<>();
        
        int n = nums.length;

        for(int i=0; i<n-2; i++){
            int anchor = nums[i];

            int left = i+1;
            int right = n - 1;

            int sum;

            while(left < right){

                sum = anchor + nums[left] + nums[right];
                if(sum == 0){
                    res.add(new ArrayList<>(Arrays.asList(anchor, nums[left], nums[right])));
                    left ++;
                    right--;
                } else if(sum > 0) right--;
                else left++;

            }

        }

        List<List<Integer>> ans = new ArrayList<>();

        ans.addAll(res);

        return ans;

    }
}