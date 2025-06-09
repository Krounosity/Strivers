import java.util.*;

class Leaders_in_an_Array {
    public ArrayList<Integer> leaders(int[] nums) {
        
        ArrayList<Integer> res = new ArrayList<>();
        
        res.add(0,nums[nums.length-1]);
        int greatestYet = nums[nums.length-1];

        for(int i=nums.length-2; i >= 0; i--){
            if(nums[i] > greatestYet){
                res.add(0, nums[i]);
                greatestYet = nums[i];
            }    
        }

        return res;
    }
}