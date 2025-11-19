class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean [] present = new boolean[nums.length+1];
        for(int num : nums)
        {
            present[num] = true;
        }
        List<Integer> res = new ArrayList<>();
        for(int i=1;i<=nums.length;i++)
        {
            if(!present[i])  res.add(i);
        }
        return res;
    }
}