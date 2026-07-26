class Solution {
    public int firstMissingPositive(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            arr.add(nums[i]);
            System.out.println(arr.get(i));
        }
        for(int i=1;i<=arr.size()+1;i++){
            if(!arr.contains(i)){
                return i;
            }
        }
        return 0;
    }
}