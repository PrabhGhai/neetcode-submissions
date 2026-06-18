class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> hs = new HashSet<>();

        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int partSum = nums[i]+nums[j];
                int rem = partSum * (-1);   
                if(hm.containsKey(rem))
                {
                  List<Integer> ls = new ArrayList<>(Arrays.asList(nums[i],nums[j],rem));
                  Collections.sort(ls);
                  hs.add(ls); 
                }
            }
            hm.put(nums[i],i);
        }

        for(List<Integer> l : hs) ans.add(l);

        return ans;
    }
}
