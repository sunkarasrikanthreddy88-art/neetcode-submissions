class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String str=tokens[i];
            if(!st.isEmpty()&&str.equals("+")){
                int val1=st.pop();
                int val2=st.pop();
                st.push(val1+val2);
            }
            else if(!st.isEmpty()&&str.equals("*")){
                int val1=st.pop();
                int val2=st.pop();
                st.push(val1*val2);
            }
            else if(!st.isEmpty()&&str.equals("-")){
                int val1=st.pop();
                int val2=st.pop();
                st.push(val2-val1);
            }
            else if(!st.isEmpty()&&str.equals("/")){
                int val1=st.pop();
                int val2=st.pop();
                st.push(val2/val1);
            }
            else{
                st.push(Integer.parseInt(str));
            }
        }
        if(!st.isEmpty()){
            return st.peek();
        }
        return 0;
    }
}
