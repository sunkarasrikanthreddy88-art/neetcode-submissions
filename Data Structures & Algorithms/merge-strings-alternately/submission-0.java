class Solution {
    public String mergeAlternately(String word1, String word2) {
        int left=0;
        int right=0;
        StringBuilder st=new StringBuilder();
        while(left<word1.length()&&right<word2.length()){
            st.append(word1.charAt(left));
            st.append(word2.charAt(right));
            left++;
            right++;
        }
        if(left<word1.length()){
            st.append(word1.substring(left));
        }
        if(right<word2.length()){
            st.append(word2.substring(left));
        }
        return st.toString();
    }
}