class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i < strs.length; i++){
            char[] str = strs[i].toCharArray();
            Arrays.sort(str);
            arr.add(new String(str));
        }
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < arr.size(); i++){
            if(map.containsKey(arr.get(i))){
                map.get(arr.get(i)).add(strs[i]);
            }
            else{
                List<String> values = new ArrayList<>();
                values.add(strs[i]);
                map.put(arr.get(i), values);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(var value: map.values()){
            ans.add(value);
        }
        return ans;
    }
}