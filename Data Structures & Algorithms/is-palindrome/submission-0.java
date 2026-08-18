//brute force
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder newStr = new StringBuilder();
        for (int i=0; i<s.length();i++){
            char c= s.charAt(i);
            if (Character.isLetterOrDigit(c)){
                newStr.append(Character.toLowerCase(c));
            }
        }
        return newStr.toString().equals(newStr.reverse().toString());
    }
}
