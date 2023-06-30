import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
       int[] nums1 = {1,2,3,0,0,0};
       int m = 3;
       int[]nums2 = {2,5,6};
       int n = 3;

       System.out.println(Arrays.toString(merge(nums1, m, nums2, n)));
        //optimalans(nums1,m,nums2,n);


    }
    static int[] merge(int[] nums1, int m, int[] nums2, int n){
        int[]ans = new int[m+n];
        int i=0;
        int j=0;
        int k=0;

        while (i<m && j<n){
            if(nums1[i]<nums2[j]){
                ans[k]=nums1[i];
                k++;
                i++;
            }
            else{
                ans[k]=nums2[j];
                k++;
                j++;
            }
        }
        while(i<m){
            ans[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n) {
            ans[k]=nums2[j];
            j++;
            k++;
        }

        for (int l = 0; l < n + m; l++) {
            if (l < n) nums1[l] = ans[l];
            else nums2[l - n] = ans[l];
        }
        return ans;
    }
    static void optimalans(int[] nums1, int m, int[] nums2, int n){
        int i = m-1;
        int j = 0;


        while(i>=0 && j<n){
            if(nums1[i]>nums2[j]){
                int temp = nums1[i];
                nums1[i]=nums2[j];
                nums2[j]=temp;
                i--;
                j++;
            }
            else{
                break;
            }
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);


    }
}
