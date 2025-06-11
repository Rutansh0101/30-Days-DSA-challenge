class Solution {

    public boolean checkAlphaNumeric(char c){
        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')){
            return true;
        }
        return false;
    }

    public boolean checkPalindrome(String s){
        for(int i = 0; i < s.length() / 2; i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < s.length(); i++){
            if(checkAlphaNumeric(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        for(int i = 0; i < sb.length(); i++){
            if(sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z'){
                sb.setCharAt(i, (char)(sb.charAt(i) + 32));
            }
        }
        return checkPalindrome(sb.toString());
    }
}