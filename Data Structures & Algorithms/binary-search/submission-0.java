class Solution {
    public int search(int[] arr, int target) {
        int low=0;
        int end=arr.length-1;
        while(low<=end){
            int mid=low+((end-low)/2);
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
   }
}
