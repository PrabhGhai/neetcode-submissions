class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> hs = new HashSet<>();
        int ans =0;

        for(int i=0;i<n;i++)
        {
            hs.add(nums[i]);
        }

        for(int a:hs)
        {
            //getting the entry point of sequence
          if(!hs.contains(a-1)){
            int currCnt = 1;
            int ele = a;

            while(hs.contains(ele+1))
            {
                currCnt++;
                ele = ele+1;
            }

            ans = Math.max(ans,currCnt);

          }
        }

        return ans;


    }
}
