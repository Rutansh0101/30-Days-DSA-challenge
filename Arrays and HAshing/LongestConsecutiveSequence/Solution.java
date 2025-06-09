class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int longestStreak = 0;
        for(int i:set){
            if(!set.contains(i-1)){
                int currentStreak = 1;
                int currentNum = i;
                while(set.contains(currentNum+1)){
                    currentStreak++;
                    currentNum++;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }
}