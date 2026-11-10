class Solution {
    public boolean isAnagram(String s, String t) {
        //check both size
        if(s.length() != t.length()){
            return false;
        }

        //O(1) space because the array size are 26
        int[] first = new int[26];
        int[] second = new int[26];

        //index for walk through array
        for(int letter = 0; letter < s.length(); letter++){
            //convert and insert +1 in letter position
            first[s.charAt(letter) - 'a']++;
            second[t.charAt(letter) - 'a']++;
        }

        return Arrays.equals(first, second);
    }
}
