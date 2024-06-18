class Solution {
    public boolean isPalindrome(String s) {
        int l= 0,r = s.length()-1;
        s = s.toLowerCase();
        while (l < r){
            while(!Character.isLetterOrDigit(s.charAt(l)) && l < r)l++;
            while(!Character.isLetterOrDigit(s.charAt(r)) && l < r ) r--;
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
