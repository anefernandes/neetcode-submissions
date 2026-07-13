class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); //need sort to handle with the duplicates
        List<List<Integer>> response = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            //handle with duplicates an skip numbers bigger than 0
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1;
            int  k = nums.length - 1;

            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                
                if(sum > 0){
                    k--;
                }
                
                else if(sum < 0){
                    j++;
                }

                else{
                    response.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    //skip duplicate values.
                    while(j < k && nums[j] == nums[j - 1]){
                        j++;
                    }
                }
            }
        }
        return response;
    }
}
/*
triplets must be unique, so use contains or equals
i,j,k are all distinct
*/