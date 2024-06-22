class Solution {
    HashMap<Integer,List<Integer>> adjMap = new HashMap<>();
    HashSet<Integer> visited = new HashSet<>();
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for(int i=0;i<numCourses;i++){
            adjMap.put(i,new ArrayList<>());
        }

        for(int pre[] : prerequisites){
            adjMap.get(pre[0]).add(pre[1]);
        }

        for(int i=0;i<numCourses;i++){
            if(dfs(i,new HashSet<>())) return false;
        }

        return true;
    }

    boolean dfs(int course,HashSet<Integer> path){
        if(path.contains(course)) return true;

        if(visited.contains(course)) return false;

        path.add(course);

        for(int next : adjMap.get(course)){
            if(dfs(next,path)) return true;
        }

        path.remove(course);
        visited.add(course);

        return false;
    }
}
