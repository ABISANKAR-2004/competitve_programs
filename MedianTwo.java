import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int b=m+n;
        int arr[]=new int[n+m];
        int k=0,j=0;
        for(int i=0;i<arr.length;i++){
            if(k<n && (j>=m || nums1[k]<nums2[j])){
            arr[i]=nums1[k];
            k++;}
            else{ 
                arr[i]=nums2[j];
                j++;
            }
        }
        
        if(b%2!=0)
            return (double)arr[(b)/2];
        else
            
           return  (double) (arr[(b-1)/2]+arr[b/2])/2.0;
        
        
    }
}
