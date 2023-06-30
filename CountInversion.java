import java.util.ArrayList;
import java.util.Arrays;

public class CountInversion {
    public static void main(String[] args) {
        int[]arr = {5, 4, 3, 2, 1};
        System.out.println(countInversion(arr));
        System.out.println(mergesort(arr,0, arr.length-1));
    }
    static int countInversion(int[]arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]>arr[j]){
                    count++;
                }

            }

        }
        return count;

    }
    static int merge(int[]arr,int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;

        int count = 0;

        while (low<= mid && right<=high){
            if(arr[left]<arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                count+=(mid-left+1);
                right++;
            }
        }
        while (left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for (int i = low; i <=high; i++) {
            arr[i] = temp.get(i-low);

        }
        return  count;
    }
    static int mergesort(int[]arr,int low, int high){
        int count = 0;
        if(low>=high){
            return count;
        }
        int mid = (low+high)/2;
        count = count+ mergesort(arr,low,mid);
        count = count+mergesort(arr,mid+1,high);
        count = count+merge(arr,low,mid,high);
        return count;
    }

}
