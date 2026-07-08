class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for(int index = 0; index < freq.length; index++){
            freq[index] = new ArrayList<>(); //initialize the array inside.
        }

        //add the frequency for each number
        for(int num : nums){
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        //get index by total occurrency and add the value equals the occurrency
        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        //add the values inside of the response k
        int[] response = new int[k];
        int index = 0;
        for(int i = freq.length - 1; i > 0 && index < k; i--){
            for(int n : freq[i]){
                response[index++] = n;
                if(index == k) {
                    return response;
                }
            }
        }
        return response;
    }
}