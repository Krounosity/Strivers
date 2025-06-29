class FloorCeil {
    public int[] getFloorAndCeil(int[] nums, int x) {
       int left = 0, right = nums.length - 1;
       int middle;

       int res[] = new int[2];
       res[0] = Integer.MIN_VALUE;
       res[1] = Integer.MAX_VALUE;

       while(left <= right){
            middle = left + (right - left)/2;

            if(nums[middle] > x){
                if(res[1] > nums[middle]){
                    res[1] = nums[middle];
                }

                right = middle - 1;
            } else if (nums[middle] ==  x){
                res[0] = nums[middle];
                res[1] = nums[middle];
                return res;
            } else {
                if(res[0] < nums[middle]){
                    res[0] = nums[middle];
                }

                left = middle + 1;
            }
       }

       return res;
    }
}