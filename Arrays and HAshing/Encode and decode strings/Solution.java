class Solution {

    public String encode(String s[]) {
        // write your logic to encode the strings
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < s.length; i++){
            sb.append(" #" + s[i]);
        }
        return sb.toString();
    }

    public String[] decode(String s) {
        // write your logic to decode the string
        List<String> strs = new ArrayList<>();
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' ' && s.charAt(i+1) == '#'){
                i++;
                strs.add(sb.toString());
                sb.setLength(0);
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        
        strs.add(sb.toString());
        strs.remove(0);
        String[] ans = new String[strs.size()];
        int index = 0;
        for(String a:strs){
            ans[index++] = a;
        }
        return ans;
    }
}