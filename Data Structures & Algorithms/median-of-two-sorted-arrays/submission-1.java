class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr=new ArrayList<>();
       for(int i=0;i<nums1.length;i++){
        arr.add(nums1[i]);
       }
       for(int i=0;i<nums2.length;i++){
        arr.add(nums2[i]);
       }
       double sum=0;
       for(int x:arr){
        sum+=x;
       }
       Collections.sort(arr);
       int totalLen = arr.size();
        if (totalLen % 2 == 0) {
            return (arr.get((totalLen / 2 - 1)) + arr.get((totalLen / 2))) / 2.0;
        } else {
            return arr.get((totalLen / 2));
        }
    }
}
