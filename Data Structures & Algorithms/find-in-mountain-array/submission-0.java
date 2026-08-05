/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
        public int findpeak(MountainArray arr){
        int start=0;
        int end=arr.length()-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr.get(mid)<arr.get(mid+1)){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start;
    }
    public int findInMountainArray(int target, MountainArray arr) {
        int peak=findpeak(arr);
        int start=0;
        int end=peak;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr.get(mid)==target){
                return mid;
            }
            else if(arr.get(mid)>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        start=peak+1;
        end=arr.length()-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr.get(mid)==target){
                return mid;
            }
            else if(arr.get(mid)<target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}