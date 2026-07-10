class Solution {
    public int maxArea(int[] h) {
        int left=0;
        int right=h.length-1;
        int res=0;
        while(left<right){
            int area=Math.min(h[left],h[right])*(right-left);
            res=Math.max(res,area);
            if(h[left]<=h[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return res;
    }
}
