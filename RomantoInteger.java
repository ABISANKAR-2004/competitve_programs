class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> nu=new HashMap<>();
        nu.put('I',1);
        nu.put('V',5);
        nu.put('X',10);
        nu.put('L',50);
        nu.put('C',100);
        nu.put('D',500);
        nu.put('M',1000);
        int res=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(i+1 <s.length() && nu.get(s.charAt(i+1)) > nu.get(c)){
                res+=nu.get(s.charAt(i+1))-nu.get(c);
                i+=1;
            }
            else
                res+=nu.get(c);
        }
        return res;
    }
}