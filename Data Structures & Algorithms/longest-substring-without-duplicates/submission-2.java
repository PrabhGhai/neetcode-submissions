class Solution {
    private boolean containsDuplicate(String str)
    {
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<str.length();i++)
        {
            if(hs.contains(str.charAt(i))) return true;
            hs.add(str.charAt(i));
        }

        return false;
    }

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        for(int i=0;i<n;i++)
        {
            for(int j = i+1;j<=n;j++)
            {
              String str = s.substring(i,j);
              if(!containsDuplicate(str))
              {
                ans = Math.max(ans,str.length());
              }
            }
        }
        return ans == 0 && s.length()>0 ? 1 : ans ;
    }
}
