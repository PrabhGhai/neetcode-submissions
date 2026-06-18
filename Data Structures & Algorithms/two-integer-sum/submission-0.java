class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] ans = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int rem = target-nums[i];
            if(!hm.containsKey(rem))
            {
                hm.put(nums[i],i);
            }else{
                int ind = hm.get(rem);
                ans[0] = ind;
                ans[1] = i;
                break;
            }
        }
        return ans;


    }
}
