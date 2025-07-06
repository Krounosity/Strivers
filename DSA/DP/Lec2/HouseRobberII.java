class HouseRobberII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows = obstacleGrid.length;
        int cols = obstacleGrid[0].length;

        int[][] dp = new int[rows][cols];

        int toInitialize = 1;

        // Initializing top row
        for(int i=0; i<cols; i++){
            if(obstacleGrid[0][i] == 1){
                toInitialize = 0;
            }

            dp[0][i] = toInitialize;
        }

        toInitialize = 1;
        
        // Initializing leftmost column
        for(int i=0; i<rows; i++){
            if(obstacleGrid[i][0] == 1){
                toInitialize = 0;
            }

            dp[i][0] = toInitialize;
        }

        // Starting DP
        for(int i = 1; i<rows; i++){
            for(int j = 1; j<cols; j++){
                if(obstacleGrid[i][j] == 1) dp[i][j] = 0;
                else dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[rows-1][cols-1];
    }
}