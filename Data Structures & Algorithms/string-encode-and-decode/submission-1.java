class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String letter : strs){
            sb.append(letter.length()).append('#').append(letter);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
       List<String> response = new ArrayList<>();
       int externalIndex = 0;

       while(externalIndex < str.length()){
            int internalIndex = externalIndex;
            
            while(str.charAt(internalIndex) != '#'){
                internalIndex++;
            }

            int length = Integer.parseInt(str.substring(externalIndex, internalIndex));
            externalIndex = internalIndex + 1;
            internalIndex = externalIndex + length;
            response.add(str.substring(externalIndex, internalIndex));
            externalIndex = internalIndex;
       }
       return response;
    }
}
