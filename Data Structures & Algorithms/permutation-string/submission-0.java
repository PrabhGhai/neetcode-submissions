class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> hm1 = new HashMap<>();
        HashMap<Character,Integer> hm2 = new HashMap<>();


        for(int i=0;i<s1.length();i++)
        {
            hm1.put(s1.charAt(i),hm1.getOrDefault(s1.charAt(i),0)+1);
        }

        int j=0, k=0;
        while(k<s2.length())
        {
          hm2.put(s2.charAt(k),hm2.getOrDefault(s2.charAt(k),0)+1); 
          if(k-j+1>s1.length())
          {
            int cnt = hm2.get(s2.charAt(j));
            if(cnt == 1) hm2.remove(s2.charAt(j));
            else hm2.put(s2.charAt(j),cnt-1);
            j++;
          }

          if(k-j+1 == s1.length())
          {
            boolean flag = true;
             for(Map.Entry<Character,Integer> mp : hm1.entrySet())
             {
                if(hm2.containsKey(mp.getKey()))
                {
                  if(!(hm2.get(mp.getKey()) == mp.getValue()))
                  {
                    flag = false;
                    break;
                  }
                }else{
                    flag = false;
                    break;
                }
             }
             if(flag) return true;
          }

          k++; 
        }

        return false;
    }
}
