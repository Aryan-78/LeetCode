class Solution {
    public boolean isPalindrome(String s) {
        char[] stringArray = s.trim().replaceAll(" ","").replaceAll("[^A-Za-z0-9]","").toLowerCase().toCharArray();
        return validpalindrome(stringArray);
    }

    public boolean validpalindrome(char[] s){
        int startPtr = 0;
        int lastPtr = s.length - 1;
        while(lastPtr > startPtr){
            if(s[lastPtr] == s[startPtr]){
                startPtr += 1;
                lastPtr -= 1;
            }else{
                return false;
            }
        }
        return true;
    }
}