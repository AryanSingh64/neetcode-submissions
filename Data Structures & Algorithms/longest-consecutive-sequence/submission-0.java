class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set  = new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int longest = 0;
        for(int n:set){
            if(!set.contains(n-1)){
                int currentNum = n;
                int currentLen = 1;
                while(set.contains(currentNum+1)){
                    currentNum++;
                    currentLen++;
                }
                longest = Math.max(longest,currentLen);
            }
        }
        return longest;
    }
}
