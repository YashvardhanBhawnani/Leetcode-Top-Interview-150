class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();
        int currNum = 1;
        for(int i=0;i<target.length;i++)
        {
            while(currNum < target[i])
            {
                res.add("Push");
                res.add("Pop");
                currNum++;
            }
            res.add("Push");
            currNum++;
        }
        return res;
    }
}