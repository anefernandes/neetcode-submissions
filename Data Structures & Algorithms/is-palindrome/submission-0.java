class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        
        while(left < right){
            //cleaning the special characters on the left side
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            
            //cleaning the special characters on the left side
            while(right > left && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            char first = s.charAt(left);
            char second = s.charAt(right);

            if(Character.toLowerCase(first) != Character.toLowerCase(second)){
                return false;
            }
            
            left++;
            right--;
        }

        return true;
    }
}
