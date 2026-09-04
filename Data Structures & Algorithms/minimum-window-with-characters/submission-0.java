class Solution {
    public String minWindow(String s, String t) {
        if(t.isEmpty()) return "";

        int match = 0;
        int start = 0;
        int[] pairs = new int[2];
        int minLength = Integer.MAX_VALUE;
        Map<Character, Integer> tFreq = new HashMap<>();
        Map<Character, Integer> windowFreq = new HashMap<>();

        //compute the t frequency
        for(char c : t.toCharArray()){
            tFreq.put(c, tFreq.getOrDefault(c, 0) + 1);
        }

        //check substring t in s using sliding window
        for(int end = 0; end < s.length(); end++){
            char current = s.charAt(end);
            //compute current window frequency
            windowFreq.put(current, windowFreq.getOrDefault(current, 0) + 1);

            //counting equals character t in s
            if(tFreq.containsKey(current) && windowFreq.get(current).equals(tFreq.get(current))){
                match++;
            }

            //if window are valid, founded the minLength
            while(match == tFreq.size()){
                //get the minLength in current window
                if((end - start + 1) < minLength){
                    minLength = end - start + 1;
                    pairs[0] = start;
                    pairs[1] = end;
                }

                //shrink it from the left
                char left = s.charAt(start);
                //update the frequency of current window
                windowFreq.put(left, windowFreq.get(left) - 1);
                //check if current window still valid
                if(tFreq.containsKey(left) && windowFreq.get(left) < tFreq.get(left)){
                    match--;
                }
                start++;
            }
        }

        return minLength != Integer.MAX_VALUE ? s.substring(pairs[0], pairs[1] + 1) : "";
    }
}