class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for(int num : nums){
            numsSet.add(num);
        }
        
        int maxSequence = 0;

        for(int num : numsSet){
            if(!numsSet.contains(num - 1)){ //i need to start the counting by the first sequence found.
                int currentLength = 1;
                while(numsSet.contains(num + currentLength)){
                    currentLength++;
                }
                maxSequence = Math.max(maxSequence, currentLength);
            }
        }
        return maxSequence;
    }
}