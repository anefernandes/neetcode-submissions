class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> group = new HashMap<>();

        for(String letter : strs){
            char[] current = letter.toCharArray();
            Arrays.sort(current);
            String key = new String(current);

            if(group.containsKey(key)){
                group.get(key).add(letter);
            }

            else {
                List<String> list = new ArrayList<>();
                list.add(letter);
                group.put(key, list);
            }
        }
        
        //check the result
        List<List<String>> result = new ArrayList<>();

        for(List<String> values : group.values()){
            result.add(values);
        }
        return result;
    }
}

/*
Time Complexity: O(n * k log k)
Space: O(n * k)
*/