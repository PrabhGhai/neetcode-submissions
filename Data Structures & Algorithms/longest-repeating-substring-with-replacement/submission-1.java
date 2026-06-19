class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int i=0,j=0,ans=0,maxF=0;
        int[] chFreq = new int[26];
        while(j<n)
        {
           chFreq[s.charAt(j)-'A']++;
           maxF = Math.max(maxF, chFreq[s.charAt(j)-'A']);

           if((j-i+1)-maxF > k)
           {
             chFreq[s.charAt(i)-'A']--;
             for(int itr=0;itr<26;itr++)
             {
                maxF = Math.max(maxF,chFreq[itr]);
             }
             i++;
           }

           ans = Math.max(ans,j-i+1);
           j++;
        }

        return ans;
    }
}
