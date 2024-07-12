//leetcode:1717.Maximum Score From Removing Score From Removing Substrings
/*Example 1:

Input: s = "cdbcbbaaabab", x = 4, y = 5
Output: 19
Explanation:
- Remove the "ba" underlined in "cdbcbbaaabab". Now, s = "cdbcbbaaab" and 5 points are added to the score.
- Remove the "ab" underlined in "cdbcbbaaab". Now, s = "cdbcbbaa" and 4 points are added to the score.
- Remove the "ba" underlined in "cdbcbbaa". Now, s = "cdbcba" and 5 points are added to the score.
- Remove the "ba" underlined in "cdbcba". Now, s = "cdbc" and 5 points are added to the score.
Total score = 5 + 4 + 5 + 5 = 19.*/




class Solution {
    public int maximumGain(String s, int x, int y) {
        if(x>y){
            return gainScore(s,"ab",x,"ba",y);

        }
        return gainScore(s,"ba",y,"ab",x);
    }
    private int gainScore(String s,String str1,int maxPt,String str2,int minPt){
        Stack<Character> stack1=new Stack<>();
        Stack<Character> stack2=new Stack<>();
        int result=0;
        for(char ch:s.toCharArray()){
            if(!stack1.isEmpty() && stack1.peek()==str1.charAt(0) && ch==str1.charAt(1)){
                stack1.pop();
                result+=maxPt;
            }
            else{
                stack1.push(ch);
            }
        }
    for(char ch:stack1){
         if(!stack2.isEmpty() && stack2.peek()==str2.charAt(0) && ch==str2.charAt(1)){
                stack2.pop();
                result+=minPt;
            }
            else{
                stack2.push(ch);
            }
    }
    return result;
    }
}