class Solution {
    public boolean hasDuplicate(int[] nums) {
        for (int i = 0; i< nums.length; i++){
            int temp = nums[i];
            for(int j = i+1; j<nums.length; j++){
                if(nums[j]==temp) return true;
            }
        }

        return false;
    };
}