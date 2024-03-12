class Solution {
    public boolean isPalindrome(int x) {
         int n=0;
        int rev=0;
        int org=x;
                
       
        
        while(x>0){
          n=x%10;
          rev=rev*10+n;
          x=x/10;
        }
        
        if(org==rev)
            return true;
        else
            return false;
    }
}