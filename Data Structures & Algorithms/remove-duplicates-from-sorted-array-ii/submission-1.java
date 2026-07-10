class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        int left=0;
        int right=0;
        while(right<nums.length){
            int count=0;
            while(right<nums.length&&nums[right]==nums[left]){
                count++;
                if(count<=2){
                    arr.add(nums[left]);
                }
                right++;
            }
            left=right;
        }
        for(int i=0;i<arr.size();i++){
            nums[i]=arr.get(i);
        }
        return arr.size();
    }
}