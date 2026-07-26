class Solution {
    private HashMap<Character, Character> mapping;

    public Solution(){
        this.mapping = new HashMap<>();
        this.mapping.put(')', '(');
        this.mapping.put('}', '{');
        this.mapping.put(']', '[');
    }

    public boolean isValid(String s) {
        Stack<Character> bracketsStack = new Stack<>();

        for(int index = 0; index < s.length(); index++){
            if(this.mapping.containsKey(s.charAt(index))){
                char topElement = bracketsStack.empty() ? '#' : bracketsStack.pop();

                if(topElement != this.mapping.get(s.charAt(index))){
                    return false;
                }
            } else {
                bracketsStack.push(s.charAt(index));
            }
        }

        return bracketsStack.isEmpty();
    }
}