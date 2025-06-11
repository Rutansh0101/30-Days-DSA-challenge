class Solution {
    public int characterReplacement(String s, int k) {
        int i = 0, j = 0;
        int maxLength = 0;
        int maxFreq = 0;
        int currentLength = 0;
        HashMap<Character, Integer> freq = new HashMap<>();
        while(j < s.length()){
            freq.put(s.charAt(j), freq.getOrDefault(s.charAt(j), 0) + 1);
            maxFreq = Math.max(maxFreq, freq.get(s.charAt(j)));
            currentLength = j - i + 1;
            if((currentLength - maxFreq) > k){
                freq.put(s.charAt(i), freq.get(s.charAt(i)) - 1);
                i++;
                currentLength = j - i + 1;
            }
            maxLength = Math.max(maxLength, currentLength);
            j++;
        }
        return maxLength;
    }
}