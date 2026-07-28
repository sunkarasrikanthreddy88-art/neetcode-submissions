class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            String str=operations[i];
            if(str.equals("+")&&!st.isEmpty()){
                int temp=st.pop();
                int sum=temp+st.peek();
                st.push(temp);
                st.push(sum);
            }
            else if(str.equals("C")&&!st.isEmpty()){
                st.pop();
            }
            else if(str.equals("D")&&!st.isEmpty()){
                int val=st.peek()*2;
                st.push(val);
            }
            else{
                 Integer val=Integer.valueOf(str);
                 st.push(val);
            }
        }
        int sum=0;
        for(int x:st){
            sum+=x;
        }
        return sum;
    }
}