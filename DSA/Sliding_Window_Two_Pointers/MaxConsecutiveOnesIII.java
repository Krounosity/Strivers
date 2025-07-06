class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int res = 0;
        int len = nums.length;
        int left = 0, right;
        int countOfZeroes = 0;

        for(right = 0; right < len; right++){
            
            if(nums[right] == 0) countOfZeroes++;

            while(countOfZeroes > k){
                if(nums[left] == 0){
                    countOfZeroes--;
                }
                left++;
            }

            res = Math.max(res, right - left + 1);

        }
        return res;
    }
}