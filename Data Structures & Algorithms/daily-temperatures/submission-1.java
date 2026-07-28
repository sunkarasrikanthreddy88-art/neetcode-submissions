class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] t=new int[temp.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=temp.length-1;i>=0;i--){
            while(!stack.isEmpty()&&temp[i]>=temp[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                t[i]=0;
            }
            else{
                t[i]=stack.peek()-i;
            }
            stack.push(i);
        }
        return t;
    }
}
