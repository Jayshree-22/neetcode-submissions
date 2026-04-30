class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder strs = new StringBuilder();

        for(char c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                strs.append(Character.toLowerCase(c));
            }
        }
        return strs.toString().equals(strs.reverse().toString());
    }
}
