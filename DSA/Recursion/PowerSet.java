import java.util.List;
import java.util.ArrayList;

class PowerSet {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();

        int power = (int) (Math.pow(2,nums.length));

        for(int i=0; i<power; i++){
            int temp = i;
            List<Integer> tempList = new ArrayList<>();
            
            for(int j = 0; temp > 0; j++){
                if(temp % 2 == 1) tempList.add(nums[j]);
                temp >>= 1;
            }

            res.add(tempList);
        }

        return res;
    }
}