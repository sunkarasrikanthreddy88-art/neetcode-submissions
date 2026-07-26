class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int i=1;
        for(int num:nums){
            set.add(num);
        }
        int n=nums.length+1;
        while(n-->0){
            if(!set.contains(i)){
                return i;
            }
            i++;
        }
        return 0;
    }
}