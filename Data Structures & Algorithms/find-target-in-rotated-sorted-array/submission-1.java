class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > nums[right]){
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        int pivot = left;
        int index = binarySearch(nums, 0, pivot - 1, target);
        if(index != -1){
            return index;
        }

        return binarySearch(nums, pivot, nums.length - 1, target);
    }

    public int binarySearch(int[] nums, int left, int right, int target){
        
        while(left <= right){
        int mid = left + (right - left) / 2;
        
        if(nums[mid] == target){
            return mid;
        }

        else if(nums[mid] < target){
            left = mid + 1;
        } 
        
        else {
            right = mid - 1;
        }
    }
    return -1;
  }
}
/*
Input: nums = [3,4,5,6,1,2], target = 1
Find first the lower boundance (pivot)
Search two times in binary search to find the value in rotate array

*/
