class Solution {
    public int lengthOfLastWord(String s) {
       char[] ch=s.toCharArray();
       int count=0;
       int j=ch.length-1;
       for(int i=ch.length-1;i>=0;i--)
       {
        if(ch[i]==' ')
        {
            j--;
        }
        else
        {
            break;
        }
       }
       while(ch[j]!=' ')
       {
         count=count+1;
         j--;
         if(j<0)
          break;
       }
       return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna