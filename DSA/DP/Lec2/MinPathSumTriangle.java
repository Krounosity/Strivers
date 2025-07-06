import java.util.List;

class MinPathSumTriangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int rows = triangle.size();

        List<List<Integer>> dp = triangle;

        // Initializing left and right edge
        for(int i = 1; i < rows; i++){
            
            List<Integer> currRow = triangle.get(i);
            List<Integer> prevRow = dp.get(i-1);

            // Left edge initialization
            dp.get(i).set(0, currRow.get(0) + prevRow.get(0));

            // Right edge initialization
            dp.get(i).set(currRow.size() - 1, 
                            
                          currRow.get(currRow.size() - 1) + 
                          prevRow.get(prevRow.size() - 1));

        }

        // Starting DP
        for(int i = 2; i < rows; i++){

            List<Integer> prevRow = dp.get(i-1);
            List<Integer> currRow = triangle.get(i);
            
            int cols = currRow.size();

            for(int j = 1; j < cols - 1; j++){

                dp.get(i).set(j, currRow.get(j) + 
                                 Math.min(prevRow.get(j), prevRow.get(j-1)));

            }
        }

        int res = dp.get(rows-1).get(0);

        // Finding minimum element

        for(int i = 1; i < dp.get(rows-1).size(); i++) res = Math.min(res, dp.get(rows-1).get(i));

        return res;

    }
}