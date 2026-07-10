class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> num=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!num.contains(nums[i])){
                num.add(nums[i]);
            }
        }
        int i=0;
        for(int x:num){
            nums[i]=x;
            i++;
        }
        return num.size();
    }
}