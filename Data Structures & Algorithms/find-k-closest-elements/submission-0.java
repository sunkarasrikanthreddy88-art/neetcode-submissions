class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<Integer> mini=new ArrayList<>();
        ArrayList<Integer> nums=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            nums.add(arr[i]);
        }
        while(k>0){
            int min=nums.get(0);
            for(int num:nums){
                if(Math.abs(num-x)<Math.abs(min-x)){
                    min=num;
                }
            }
            mini.add(min);
            nums.remove(Integer.valueOf(min));
            k--;
        }
        Collections.sort(mini);
        return mini;

    }
}