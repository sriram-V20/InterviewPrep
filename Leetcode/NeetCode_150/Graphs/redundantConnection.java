class Solution {
    int parent[];
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length+1;
        parent = new int[n];
        for(int i=1;i<n;i++){
            parent[i] = i;
        }

        for(int edge[] : edges){
            int x = edge[0],y = edge[1];

            int xParent = findParent(x);
            int yParent = findParent(y);

            if(xParent == yParent){
                return edge;
            }else{
                parent[xParent] = yParent;
            }
        }
        return new int[0];
    }

    int findParent(int node){
        if(parent[node] == node) return node;
        parent[node] = findParent(parent[node]);

        return parent[node];
    }
}