class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> prevNum = new HashMap<>();

        for(int num = 0; num < nums.length; num++){
            int diff = target - nums[num];

            if(prevNum.containsKey(diff)){
                return new int[]{prevNum.get(diff), num};
            }

            prevNum.put(nums[num],num);
        }

        return new int[]{};
    }
}
