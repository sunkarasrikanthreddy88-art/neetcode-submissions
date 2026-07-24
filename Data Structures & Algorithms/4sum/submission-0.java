class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> arr=new HashSet<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    for(int l=k+1;l<n;l++){
                        if(nums[i]+nums[j]+0L+nums[k]+nums[l]==target){
                            arr.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        }
                    }
                }
            }
        }
        return new ArrayList<>(arr);
    }
}