class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        if(nums1.length > nums2.length) 
        {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        int left = 0;
        int right = nums1.length;
        while(left<=right)
        {
            int mid1=(left+right)/2;
            int mid2=(nums1.length+nums2.length)/2 -mid1;
            int L1 =mid1==0? Integer.MIN_VALUE :nums1[mid1-1];
            int L2 = mid2==0? Integer.MIN_VALUE :nums2[mid2-1];
            int R1 =mid1==nums1.length? Integer.MAX_VALUE :nums1[mid1];
            int R2 = mid2==nums2.length? Integer.MAX_VALUE :nums2[mid2];            
            if(L1>R2)
            right=mid1-1;
            else if(L2>R1)
            left=mid1+1;
            else
            if((nums1.length+nums2.length)%2==0)
            return (Math.min(R1,R2)+Math.max(L1,L2))/2.0;
            else
            return Math.min(R1,R2);
        }
        return 0.0;
    }
}
