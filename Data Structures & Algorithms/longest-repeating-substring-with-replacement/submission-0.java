class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> freq = new HashMap<>();
        int start = 0;
        int len = 0;
        int maxFreq = 0;
        for(int end = 0; end < s.length(); end++){
            char current = s.charAt(end);
            freq.put(current, freq.getOrDefault(current, 0) + 1);
            maxFreq = Math.max(maxFreq, freq.get(current));

            while((end - start + 1) - maxFreq > k){
                char currentL = s.charAt(start);
                freq.put(currentL, freq.get(currentL) - 1);
                start++;
            }
            len = Math.max(len, end - start + 1);
        }

        return len;
    }
}