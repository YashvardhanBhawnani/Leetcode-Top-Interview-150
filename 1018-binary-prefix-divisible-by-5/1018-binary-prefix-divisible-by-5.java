class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        int rem = 0;

        for (int bit : nums) {
            rem = (rem * 2 + bit) % 5;   // keep only remainder
            ans.add(rem == 0);
        }

        return ans;
    }
}