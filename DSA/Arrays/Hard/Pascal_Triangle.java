import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>(Arrays.asList(1)));

        if(numRows == 1) return res;

        while(res.size() < numRows){
            res.add(genLayer(res.get(res.size()-1)));
        }

        return res;
    }

    public List<Integer> genLayer(List<Integer> latestLayer){

        List<Integer> ret = new ArrayList<>();

        for(int i=1; i<=latestLayer.size()+1; i++){
            if(i == 1 || i == latestLayer.size()+1) ret.add(1);
            else{
                ret.add(latestLayer.get(i-1) + latestLayer.get(i-2));
            }
        }

        return ret;
    }
}