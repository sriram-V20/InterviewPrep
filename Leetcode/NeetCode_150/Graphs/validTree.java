class Solution {
    HashMap<Integer,List<Integer>> adjMap = new HashMap<>();
    HashSet<Integer> visited = new HashSet<>();
    public boolean validTree(int n, int[][] edges) {
        for(int i=0;i<n;i++){
            adjMap.put(i,new ArrayList<>());
        }

        for(int edge[] : edges){
            adjMap.get(edge[0]).add(edge[1]);
            adjMap.get(edge[1]).add(edge[0]);
        }

        if(!dfs(0,-1)) return false;

        return visited.size() == n;
    }

    boolean dfs(int node,int parent){
        if(visited.contains(node)) return false;

        visited.add(node);

        for(int nextNode : adjMap.get(node)){
            if(nextNode == parent) continue;

            if(!dfs(nextNode,node)) return false;
        }

        return true;
    }
}