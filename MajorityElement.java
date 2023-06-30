import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr  = {2, 2, 1, 1, 1, 2, 2};
        int n = arr.length;
        System.out.println(findMajority(arr,n));
        System.out.println(optimalfindMajority(arr,n));
    }
    static int findMajority(int[] arr, int n) {
        for (int i = 0; i <n ; i++) {
            int count = 0;
            for (int j = 0; j <n ; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }

            }
            if(count > n/2){
                return arr[i];
            }

        }
        return -1;
    }

    static int optimalfindMajority(int[]arr, int n){
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i <n ; i++) {
           int val = map.getOrDefault(arr[i],0);
           map.put(arr[i],val+1);
        }

        for (Map.Entry<Integer,Integer> i : map.entrySet() ) {
            if(i.getValue() > (n/2)){
                return i.getKey();
            }

        }
        return -1;

    }
}
