class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder newStr = new StringBuilder();

        for(char check : s.toCharArray()){
            if(Character.isLetterOrDigit(check)){
                newStr.append(Character.toLowerCase(check));
            }
        }
        return newStr.toString().equals(newStr.reverse().toString());
    }
}
