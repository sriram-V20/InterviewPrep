class Solution {
    HashMap<Integer,List<Integer>> adjMap = new HashMap<>();
    HashSet<Integer> visited = new HashSet<>();
    public int countComponents(int n, int[][] edges) {
        for(int i=0;i<n;i++){
            adjMap.put(i,new ArrayList<>());
        }

        for(int edge[] : edges){
            adjMap.get(edge[0]).add(edge[1]);
            adjMap.get(edge[1]).add(edge[0]);
        }

        int connectedComponents = 0;

        for(int i=0;i<n;i++){
            if(!visited.contains(i)){
                dfs(i);
                connectedComponents++;
            }
        }
        return connectedComponents;
    }

    void dfs(int node){
        if(visited.contains(node)) return;

        visited.add(node);

        for(int nextNode : adjMap.get(node)){
            dfs(nextNode);
        }
    }
}