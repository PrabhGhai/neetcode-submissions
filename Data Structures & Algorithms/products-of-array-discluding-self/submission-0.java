class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefixMul = new int[n];
        int[] suffixMul = new int[n];

        prefixMul[0] = nums[0];
        suffixMul[n-1] = nums[n-1];

        //fill prefixMul
        for(int i=1;i<n;i++)
        {
            prefixMul[i] = prefixMul[i-1]*nums[i];
        }

        //fill suffixMul
        for(int j=n-2;j>=0;j--)
        {
            suffixMul[j] = suffixMul[j+1]*nums[j];
        }

        int[] ans  = new int[n];
        for(int i=0;i<n;i++)
        {
          if(i==0)
          {
            ans[i] = suffixMul[i+1];
          }
          else if(i==n-1)
          {
            ans[i] = prefixMul[i-1];
          }
          else{
            ans[i] = prefixMul[i-1]*suffixMul[i+1];
          }
        }

        return ans;
    }
}  
