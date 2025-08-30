class Solution {
    public int searchInsert(int[] nums, int target) {
        int s=0,e=nums.length-1;
        int cnt=0;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
            mid = s + (e-s)/2;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<target)
            {
                cnt++;
            }
        }
        return cnt;
    }
}