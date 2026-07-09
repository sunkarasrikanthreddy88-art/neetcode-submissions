class Solution {
    public boolean isPalindrome(String s) {
        String str=s.toLowerCase();
        str.trim();
        int left=0;
        int right=str.length()-1;
        while(left<=right){
            if(!Character.isLetterOrDigit(str.charAt(right))){
                right--;
            }
            else if(!Character.isLetterOrDigit(str.charAt(left))){
                left++;
            }
            else if(str.charAt(right)==str.charAt(left)){
                right--;
                left++;
            }
            else{
                return false;
            }
        }
        return true;

    }
}
