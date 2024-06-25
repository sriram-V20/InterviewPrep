class Solution {
    HashMap<Integer,List<Integer>> adjMap = new HashMap<>();
    HashSet<Integer> visited = new HashSet<>();
    List<Integer> res = new ArrayList<>();
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        for(int i=0;i<numCourses;i++){
            adjMap.put(i,new ArrayList<>());
        }

        for(int pre[] : prerequisites){
            adjMap.get(pre[0]).add(pre[1]);
        }

        for(int i=0;i<numCourses;i++){
            HashSet<Integer> path = new HashSet<>();
            if(dfs(i,path)){
                return new int[0];
            }
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }


    boolean dfs(int node,HashSet<Integer> pathSet){
        if(pathSet.contains(node)) return true;

        if(visited.contains(node)) return false;

        pathSet.add(node);

        for(int nextCourse : adjMap.get(node)){
            if(dfs(nextCourse,pathSet)) return true;
        }

        pathSet.remove(node);
        visited.add(node);
        res.add(node);

        return false;
    }
}
