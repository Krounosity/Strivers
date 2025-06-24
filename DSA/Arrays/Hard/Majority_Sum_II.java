package DSA.Arrays.Hard;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        // Using extended Boyer-Moore's algorithm
        int element1 = 0, count1 = 0;
        int element2 = 0, count2 = 0;

        int len = nums.length;

        for(int i=0; i<nums.length; i++){
            if(count1 == 0 && element2 != nums[i]){
                element1 = nums[i];
                count1 = 1;
            } else if(count2 == 0 && element1 != nums[i]){
                element2 = nums[i];
                count2 = 1;
            } else if(element1 == nums[i]){
                count1++;
            } else if(element2 == nums[i]){
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        int confirm1 = 0, confirm2 = 0;

        for(int i=0; i<len; i++){
            if(nums[i] == element1) confirm1++;
            if(nums[i] == element2) confirm2++;
        }

        ArrayList<Integer> res = new ArrayList<>();
        
        if(confirm1 >= len/3+1) res.add(element1);
        if(confirm2 >= len/3+1 && element1 != element2) res.add(element2);

        return res;
    }
}