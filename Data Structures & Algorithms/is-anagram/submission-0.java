class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] first = new int[26];
        int[] second = new int[26];

        for(int letter = 0; letter < s.length(); letter++){
            //convert char to int
            int currentS = s.charAt(letter) - 'a';
            int currentT = t.charAt(letter) - 'a';

            first[currentS]++;
            second[currentT]++;
        }

        for(int letter = 0; letter < 26; letter++){
            if(first[letter] != second[letter]){
                return false;
            }
        }

        return true;
    }
}
