class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> hm = new HashMap<>();

        for(int i=0;i<strs.length;i++)
        {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String newStr = new String(chars);
            
            if(!hm.containsKey(newStr))
            {
               hm.put(newStr, new ArrayList<>());
            }
            
            hm.get(newStr).add(strs[i]);

        }

        List<List<String>> ls = new ArrayList<>();

        for(Map.Entry<String, List<String>> entry : hm.entrySet())
        {
            ls.add(entry.getValue());
        }

        return ls;
    }
}
