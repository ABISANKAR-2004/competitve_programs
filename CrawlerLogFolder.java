leetcode:1598. Crawler Log Folder

class Solution {
    public int minOperations(String[] logs) {
        int count=0;
        for(String str:logs){
            if(str.equals("./")){
                continue;
            }
            if(str.equals("../")){
                count=Math.max(0,count-1);
            }
            else{
                count++;
            }
        }
        return count;
    }
}
