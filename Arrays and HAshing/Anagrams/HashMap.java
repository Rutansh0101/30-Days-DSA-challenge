class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())  return false;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i = 0; i < t.length(); i++){
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0) + 1);
        }
        
        for(Character key : map1.keySet()){
            if(!map2.containsKey(key))  return false;
            if(!map1.get(key).equals(map2.get(key)))    return false;
        }

        return true;
    }
}