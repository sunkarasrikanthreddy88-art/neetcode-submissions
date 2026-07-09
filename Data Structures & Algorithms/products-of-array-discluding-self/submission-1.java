class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res=new int[nums.length];
        int left=0;
        while(left<nums.length){
            int pro=1;
            for(int i=0;i<nums.length;i++){
                if(left!=i){
                    pro*=nums[i];
                }
            }
            res[left]=pro;
            left++;
        }
        return res;
    }
}  
