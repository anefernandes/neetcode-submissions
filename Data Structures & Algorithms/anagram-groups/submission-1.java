class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> frequency = new HashMap<>();

        for(String word : strs){
            int[] current = new int[26];

            for(int letter = 0; letter < word.length(); letter++){
                current[word.charAt(letter) - 'a']++;
            }

            String key = Arrays.toString(current);
            
            if(frequency.containsKey(key)){
                frequency.get(key).add(word);
            }            
            else {
                frequency.put(key, new ArrayList<>(List.of(word)));
            }
        }

        List<List<String>> group = new ArrayList<>();

        for(String key : frequency.keySet()){
            List<String> values = frequency.get(key);
            group.add(values);
        }

        return group;
    }
}