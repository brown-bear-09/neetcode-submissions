class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int n: nums){
            set.add(n);
        }
        int res =0;
        for(int i: nums){
            if(!set.contains(i-1)){
                int curStreak =0;
                while(set.contains(i)){
                    curStreak++;
                    i++;
                }
                res = Math.max(res,curStreak);
            }
        }
        return res;
        
    }
}
