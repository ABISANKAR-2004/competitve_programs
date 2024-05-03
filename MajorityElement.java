class Solution {
    public int majorityElement(int[] nums) {
        int count=0,comp=0;
        for(int num:nums){
            if(count==0)
                comp=num;
            if(comp==num)
                count++;
            else
                count--;
            
        }
        for(int num:nums){
            if(comp==num)
                count++;
        }
        if(count>nums.length/2)
            return comp;
        return -1;
    }
}