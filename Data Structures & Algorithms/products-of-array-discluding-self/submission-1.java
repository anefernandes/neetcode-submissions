class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] preff = new int [nums.length];
        preff[0] = 1;

        //compute preffix of products
        for(int index = 1; index < nums.length; index++){
            preff[index] = nums[index - 1] * preff[index - 1];
        }

        int[] suff = new int [nums.length];
        suff[nums.length - 1] = 1;

        //compute suffix of products
        for(int index = nums.length - 2; index >= 0; index--){
            suff[index] = nums[index + 1] * suff[index + 1];
        }

        //compute preff * suffix and save the response
        int[] response = new int[nums.length];

        for(int index = 0; index < nums.length; index++){
            response[index] = preff[index] * suff[index];
        }

        return response;
    }
}
/*
nums [1,2,4,6] n = 3
preff [1,1,2,6] preff = 3 - n = 2 pref = 2
n = 1 até n = 0
suff [48,24,6,1] preff = 0 = n = 1 * suff = 1

result[48,24,12,8]
*/
