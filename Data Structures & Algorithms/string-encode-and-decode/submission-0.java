class Solution {

    public String encode(List<String> strs) {
      StringBuilder s = new StringBuilder();

      for(int i=0;i<strs.size();i++)
      {
        int len = strs.get(i).length();
        s.append(len).append('#').append(strs.get(i));
      }

      return s.toString();
    }

    public List<String> decode(String str) {
     
     int i=0;
     int n = str.length();
     List<String> ans = new ArrayList<>();
      
     while(i<n)
     {
        int num = 0;
        int j=i;
        while(str.charAt(j)!='#')
        {
            num = num*10 + str.charAt(j)-'0';
            j++;
        }
        
        j++;
        int start = j;
        int end = j+num;
        String s = str.substring(start,end);
        ans.add(s);
        i=end;
     }

     return ans;
    }
}
