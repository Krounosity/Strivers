class HouseRobber {
    public int rob(int[] nums) {
        int len = nums.length;
        int[] table = new int[len];

        table[0] = nums[0];
        if(len == 1) return table[len-1];
        table[1] = nums[1];

        for(int i = 2; i < len; i++){
            table[i] = nums[i] + table[i - 2];
            if(i > 2){
                table[i] = Math.max(table[i], nums[i] + table[i-3]);
            }
        }

        return Math.max(table[len-1], table[len-2]);
    }
}