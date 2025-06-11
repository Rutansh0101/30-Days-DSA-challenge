class Solution {

    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }
        int left = 0;
        int right = s.length();
        int i = 0;
        int lettersToSatisfy = map.size();
        for(int j = 0; j < s.length(); j++){
            if(map.containsKey(s.charAt(j))){
                map.put(s.charAt(j), map.get(s.charAt(j)) - 1);
                if(map.get(s.charAt(j)) == 0){
                    lettersToSatisfy--;
                }
            }
            while(lettersToSatisfy == 0){
                if(j - i < right - left){
                    right = j;
                    left = i;
                }
                if(map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                    if(map.get(s.charAt(i)) > 0){
                        lettersToSatisfy++;
                    }
                }
                i++;
            }
        }
        if(right == s.length()){
            return "";
        }
        return s.substring(left, right+1);
    }
}