class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int original = x;
        if(x<0){
            return false ;
        }
        while(x!=0){
            int digit = x%10;
            rev = rev*10 + digit;
            x = x/10;
        }
        if(original==rev){
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