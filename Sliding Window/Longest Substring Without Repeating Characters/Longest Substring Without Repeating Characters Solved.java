class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        for(int i = 0; i <= s.length() - maxLength; i++){
            HashSet<Character> set = new HashSet<>();
            int j = i;
            while(j < s.length() && !set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
            }
            maxLength = Math.max(maxLength, set.size());
        }
        return maxLength;
    }
}