class Solution {
    public int[] findErrorNums(int[] nums) {
        int [] cnt = new int[nums.length+1];
        for(int i=0;i<nums.length;i++) {cnt[nums[i]]++;}
        int [] ans = new int[2];
        for(int i=1;i<cnt.length;i++)
        {
            if(cnt[i]==0) ans[1] = i;
            if(cnt[i] == 2) ans[0] = i;
        }
        return ans;
    }
}