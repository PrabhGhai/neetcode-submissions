class Solution {
    public boolean isAnagram(String s, String t) {

    if(s.length()!=t.length()) return false;

    int[] occur1 = new int[26];
    int[] occur2 = new int[26];

    for(int i=0;i<s.length();i++)
    {
       occur1[s.charAt(i) - 97] +=1; 
       occur2[t.charAt(i) - 97] +=1;
    }

    for(int i=0;i<26;i++)
    {
      if(occur1[i] != occur2[i]) return false; 
    }

    return true;
    
}
}
