class Solution {
    public int countPalindromicSubsequence(String s) {
        int cnt = 0;
        for(char c='a';c<='z';c++)
        {
            HashSet<Character> set = new HashSet<>();
            int fIdx=0,lIdx=0,l=0,r=s.length()-1;
            while(l<=r)
            {
                if(s.charAt(l) == c)
                {
                    fIdx = l;
                    break;
                }
                l++;
            }
            while(r>=0)
            {
                if(s.charAt(r) == c)
                {
                    lIdx = r;
                    break;
                }
                r--;
            }
            for(int j=fIdx+1;j<lIdx;j++)
            {
                set.add(s.charAt(j));
            }
            cnt += set.size();
        }
        return cnt;
    }
}