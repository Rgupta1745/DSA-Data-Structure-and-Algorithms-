/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int end = mountainArr.length();

        int peak = peaking( mountainArr);
        int increase = increasing(peak, mountainArr , target);
        int decrease = decreasing(peak+1 , mountainArr , target);

        if(increase != -1){
            return increase;
        }

        return decrease;

    }
    private int peaking(MountainArray mountainArr){
        int start = 0 ;
        int end = mountainArr.length()-1;

        while( start < end ){
            int mid = start + (end - start)/2;

            if(mountainArr.get(mid) > mountainArr.get(mid+1)){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
    private int increasing( int end , MountainArray mountainArr , int target ){
        int start =0 ;

        while(start <= end ){
            int mid = start + (end -start)/2;

            if(mountainArr.get(mid) == target){
                return mid;
            }else if (mountainArr.get(mid) > target){
                end = mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
     private int decreasing( int peak , MountainArray mountainArr , int target ){
        int start = peak;
        int end = mountainArr.length()-1;

        while(start <= end ){
            int mid = start + (end -start)/2;

            if(mountainArr.get(mid) == target){
                return mid;
            }else if (mountainArr.get(mid) < target){
                end = mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }

}