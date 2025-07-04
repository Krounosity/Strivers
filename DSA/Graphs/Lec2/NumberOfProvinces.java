class NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        
        int vertices = isConnected.length;
        boolean[] visited = new boolean[vertices];

        int provinces = 0;

        for(int i=0; i<vertices; i++){
            if(visited[i] == false){
                provinces += 1;
                visited = dfs(visited, isConnected, i);
            }
        }

        return provinces;
    }

    public boolean[] dfs(boolean[] visited, int[][] isConnected, int vertex){
        if(visited[vertex]) return visited; // Stopping case for recursion
        visited[vertex] = true;

        for(int i=0; i<isConnected[vertex].length; i++){
            if(isConnected[vertex][i] == 1) dfs(visited, isConnected, i);
        }

        return visited;

    }
}