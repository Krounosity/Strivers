import java.util.Queue;
import java.util.LinkedList;

class RottingOranges {
    public int orangesRotting(int[][] grid) {
        
        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> rottenOranges = new LinkedList<>();

        int[][] rotten = grid;

        // We will use multi source BFS because there can be multiple rotten oranges initially and they     

        // We will first enter all the rotten oranges in the queue and also count the number of fresh oranges and the existence of atleast one rotten orange at first.

        boolean ekHaiRotten = false;
        int fresh = 0;
        
        for(int i=0; i<rows; i++){
            for(int j = 0; j < cols; j++){

                int[] orange = new int[]{i,j};

                if(grid[i][j] == 2){
                    // Rotten orange
                    ekHaiRotten = true;
                    rottenOranges.offer(orange);

                } else if(grid[i][j] == 1){
                    // Fresh orange    
                    fresh++;
                
                }

            }
        }

        // If we have no fresh oranges, no time taken
        if(fresh == 0) return 0;

        // Else if we have fresh oranges but no rotten ones: impossible to rot oranges
        if(ekHaiRotten == false) return -1;

        // Now we start running orthogonal multi source BFS

        int time = -1;

        // Directions to traverse in
        int[][] directions = {{0,1},{0,-1},{-1,0},{1,0}};

        while(!rottenOranges.isEmpty()){
            // Currently rotten oranges which are to be visited and BFS'd from
            int nodes = rottenOranges.size();

            // BFS from each rotten node
            for(int i=0; i<nodes; i++){

                // Rotten node
                int[] cell = rottenOranges.poll();

                // Directions to traverse in
                for(int[] direction : directions){

                    // New coordinates in the current direction shift
                    int rowShift = cell[0] + direction[0];
                    int colShift = cell[1] + direction[1];

                    // If within range and fresh orange is found
                    if(rowShift >= 0 && rowShift < rows && colShift >= 0 && colShift < cols && rotten[rowShift][colShift] == 1){
                        
                        rotten[rowShift][colShift] = 2;
                        fresh--;
                        
                        // Pushing newly rotten orange in queue
                        rottenOranges.offer(new int[] {rowShift, colShift});

                    }
                }
                
            }

            time++;
        }

        // If all fresh oranges are not covered, then one or more are unreachable, hence impossible to rot them
        if(fresh != 0) return -1;

        // Else all oranges were rotted and return the time taken
        return time;

    }

}