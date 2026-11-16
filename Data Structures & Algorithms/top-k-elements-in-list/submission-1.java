class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] buckets = new List[nums.length + 1];
        Map<Integer, Integer> frequency = new HashMap<>();
        
        //create empty buckets
        for(int bucket = 0; bucket < buckets.length; bucket++){
            buckets[bucket] = new ArrayList<>();
        }

        //counting de frequency for each value in array
        for(int num : nums){
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        
        //put the values (Frequency) in the bucket matching
        for(Map.Entry<Integer, Integer> entry : frequency.entrySet()){
            buckets[entry.getValue()].add(entry.getKey());
        }
        
        int[] topK = new int[k];
        //current position reading the top k values
        int current = 0;

        //Read the array from max to less (n...0) to get top k
        for(int bucket = buckets.length - 1; bucket > 0; bucket--){
            //read values saved in buckets
            for(int num : buckets[bucket]){
                topK[current++] = num;
                //if has more bucket than k elements, return only k elements
                if(current == k){
                    return topK;
                }
            }
        }
        return topK;
    }
}