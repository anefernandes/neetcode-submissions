class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] result = new int[size];
        int[] prefix = new int[size];
        int[] suffix = new int[size];

        prefix[0] = 1;
        suffix[size - 1] = 1;

        for(int num = 1; num < size; num++){
            prefix[num] = prefix[num - 1] * nums[num - 1];
        }

        for(int num = size - 2; num >= 0; num--){
            suffix[num] = nums[num + 1] * suffix[num + 1];
        }

        for(int num = 0; num < size; num++){
            result[num] = prefix[num] * suffix[num];
        }

        return result;
    }
}  