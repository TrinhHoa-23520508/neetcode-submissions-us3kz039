class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] index = new int[2];
        for(int i = 0; i<nums.length; i++){

            int temp = nums[i];
            for(int j = i + 1; j< nums.length; j++){
                if((temp + nums[j])==target){
                    index[0] = i;
                    index[1] = j;
                    return index;
                }
            }
        }

        return index;
    }
}
