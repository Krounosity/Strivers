class LowerBound {
    public int lowerBound(int[] nums, int x) {
        
        boolean found = false;
        
        int left = 0, right = nums.length - 1;
        int middle;

        while(left < right){
            middle = left + (right-left)/2;

            if(nums[middle] >= x){
                found = true;
                right = middle;
            } else {
                left = middle + 1;
            }
        }

        return found ? right : nums.length;
    }
}
