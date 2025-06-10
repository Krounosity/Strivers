import java.util.ArrayList;

class Alternate_Signs {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> negatives = new ArrayList<>();

        for(int n : nums){
            if(n > 0) positives.add(n);
            else negatives.add(n);
        }

        for(int i=0; i<positives.size(); i++){
            nums[2*i] = positives.get(i);
            nums[2*i+1] = negatives.get(i);
        }

        return nums;
    }
}