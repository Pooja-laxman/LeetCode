class Solution {
    public boolean isPalindrome(String s) {

        if(s.isEmpty()){
            return true;
        }
        s =s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
      
        char[] ch = s.toCharArray();
     
        String revers="";
       
        for(int i=ch.length-1; i>=0; i--){
            revers = revers + ch[i];
            
        }
        if(s.equals(revers)){
            return true;
        }
        else{
            return false;
        }
       
    }
   
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna