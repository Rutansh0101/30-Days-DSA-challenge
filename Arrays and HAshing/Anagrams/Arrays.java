class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())    return false;
        int[] freq1 = new int[26];
        for(int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);
            freq1[currentChar - 'a']++;
            char currentChar2 = t.charAt(i);
            freq1[currentChar2 - 'a']--;
        }
        for(int i:freq1){
            if(i != 0)  return false;
        }
        return true;
    }
}