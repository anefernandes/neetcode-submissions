class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> unique = new HashSet<>(); //nums = [1, 2, 3, 3]

        for(int num : nums){
            if(!unique.contains(num)){
                unique.add(num);
            }
            else {
                return true;
            }
        }
        return false;
    }
}
/*
Time complexity: O(N) because i have a neested loop.
Space Complexity: O(N) because in a worst case I'll add nums.size

*/