class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxArea = -1;

        while(left < right){
            int minValue = Math.min(heights[left], heights[right]);
            int amount = minValue * (right - left);
            
            maxArea = Math.max(maxArea, amount);

            if(heights[left] < heights[right]){
                left++;
            }
            else {
                right--;
            }
        }

        return maxArea;
    }
}
/*
I'll always move forward the low value
Use two pointers: while l < r
Calculate current position (r - l) - 1
Global variable for maxArea, local variable for amount.
Move the low value between r and l position
Return maxArea
*/
