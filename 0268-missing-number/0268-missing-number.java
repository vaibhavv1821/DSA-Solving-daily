class Solution {
    public int missingNumber(int[] nums) {
        int missing = 0;
        // int indexsum =0;
        Arrays.sort(nums);
        for (int i=0; i<nums.length; i++){
            if(nums[i] == missing){
                missing++;
            }
        }
        return missing;
    }
}