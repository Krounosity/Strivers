import java.util.Arrays;

class Longest_Consecutive_Sequence {

    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);

        int res = 1;
        int start = 0;

        for(int i=1; i<nums.length; i++){
            if(Math.abs(nums[i] - nums[i-1]) == 1){
                res = Math.max(i - start + 1, res);
            } else {
                start = i;
            }
        }

        return res;
    }
}