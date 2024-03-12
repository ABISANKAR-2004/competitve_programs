
class Solution {
    public int reverse(int x) {
        int n=0;
        double rev=0;
        double a=Math.pow(2,31);
          double b=Math.pow(-2,31);
       
        
        while(x !=0){
          n=x%10;
          rev=rev*10+n;
          x=x/10;
        }
        if(rev>b && rev<a){
            return (int)rev;
        }
        return (int)0;
    }
}