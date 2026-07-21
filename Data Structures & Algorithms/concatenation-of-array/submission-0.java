class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int x:nums){
            arr.add(x);
        }
        int s=arr.size();
        int[] arr1=new int[n+s];
        for(int i=0;i<nums.length;i++){
            arr1[i]=nums[i];
        }
        for(int i=n;i<n+s;i++){
            arr1[i]=arr.get(i-n);
        }
        return arr1;

    }
}