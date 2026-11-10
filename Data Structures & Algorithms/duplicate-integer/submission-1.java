class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniqueValues = new HashSet<>();
        //walk throw array nums
        for(int num : nums){
        //check if value are in set
            if(!uniqueValues.contains(num)){
                uniqueValues.add(num);
            } else {
                //current number is not unique
                return true;
            }
        }
        return false;
    }
}

/*
space: O(N) because of the set
runTime: O(n) because we need read the numbers inside of the array
*/