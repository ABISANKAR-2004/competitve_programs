//LEETCODE 1190: REVERSE SUBSTRINGS BETWEEN EACH PAIR OF PARENTHESES



class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> nu=new Stack<>();
        StringBuilder curr=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                nu.push(curr);
                curr=new StringBuilder();

            }
           else if(ch==')'){
                curr.reverse();
                StringBuilder temp=nu.pop();
                temp.append(curr);
                curr=temp;
            }
            else{
                curr.append(ch);
            }

        }
        return curr.toString();
    }
}
