class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();

        for(int n : nums) numbers.add(n);
        int longsetConsecutiveSequence = 0;
        for(int n : nums){
            if(!numbers.contains(n-1)){
                int count = 1;
                while(numbers.contains(n+1)) {
                    count++;
                    n++;
                }
                longsetConsecutiveSequence = Math.max(longsetConsecutiveSequence,count);
            }
        }

        return longsetConsecutiveSequence;
    }
}
