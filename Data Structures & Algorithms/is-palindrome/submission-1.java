class Solution {
    public boolean isPalindrome(String s) {
        String lowercase = s.toLowerCase();
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if((lowercase.charAt(i)>='a' && lowercase.charAt(i)<='z') || (lowercase.charAt(i)>='0' && lowercase.charAt(i)<='9') )
            {
                str.append(lowercase.charAt(i));
            }
        }

        System.out.println(str);
        int i=0;
        int j = str.length()-1;
        while(i<j)
        {
          if(str.charAt(i) != str.charAt(j))
          {
            return false;
          }
          i++;
          j--;
        }

        return true;

    }
}
