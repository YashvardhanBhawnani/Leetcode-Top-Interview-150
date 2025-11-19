class Solution {
    public int findFinalValue(int[] nums, int org) {
        for (int i=0;i<nums.length;i++)
        {
            if(nums[i]==org)
            { 
                org = org*2;
                i=-1;
            }   
        }
        return org;
    }
}