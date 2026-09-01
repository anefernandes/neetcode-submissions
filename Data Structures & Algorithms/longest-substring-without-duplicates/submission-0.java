class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        Set<Character> unique = new HashSet<>();
        int right = 0;
        int left = 0;

        while(right < s.length()){
            if(!unique.contains(s.charAt(right))){
                unique.add(s.charAt(right));
                maxLength = Math.max(maxLength, unique.size());
                right++;
            } else {
                unique.remove(s.charAt(left));
                left++;
            }
        }
        return maxLength;
    }
}
