class Solution {

    public String encode(List<String> strs) {
        StringBuilder resp = new StringBuilder();
        for(String word : strs){
            resp.append(word.length()).append('#').append(word);
        }
        return resp.toString();
    }

    public List<String> decode(String str) {
        List<String> resp = new ArrayList<>();
        int start = 0;

        while(start < str.length()){
            int end = start;
            
            //find the length of string valid
            while(str.charAt(end) != '#'){
                end++; //8
            }

            //length of the string decode
            int length = Integer.parseInt(str.substring(start, end));
            //walk throw correct string and save the response.
            start = end + 1;
            end = start + length;
            resp.add(str.substring(start, end));
            start = end; //important update start with new end
        }

        return resp;
    }
}

/*
[Hello,World]
5 # H e l l o 5 # W o  r  l  d
0 1 2 3 4 5 6 7 8 9 10 11 12 13

start 6
end 6
length = 5
[Hello]
*/