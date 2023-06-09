import java.util.Arrays;

public class SortZeroOneTwo {
    public static void main(String[] args) {
        int[]arr = {2,0,1,1,0,2,1};
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort012(int[]arr){
        int l =0;
        int m =0;
        int h = arr.length-1;

        while (m<=h) {
            if(arr[m]==0){
                swap(m,l,arr);
                m++;
                l++;
            }
            if(arr[m]==1){
                m++;
            }
            if(arr[m]==2){
                swap(m,h,arr);
                h--;
            }
        }
    }
    static void swap( int start, int end, int[]arr){
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

    }
}
