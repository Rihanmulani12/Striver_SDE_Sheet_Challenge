import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[]arr = {1, 9, 3, 10 ,4 ,20 ,2};
        System.out.println(bruthans(arr));
        System.out.println(bruthpr(arr));
        System.out.println(optimal(arr));
    }
    static int bruthans(int[]arr){

        Arrays.sort(arr);

        int ans = 1;
        int prev = arr[0];
        int count = 1;

        for(int i = 1;i < arr.length;i++){
            if(arr[i] == prev+1){
                count++;
            }
            else if(arr[i] != prev){
                count = 1;
            }
            prev = arr[i];
            ans = Math.max(ans, count);
        }
        return ans;
    }
    static int bruthpr(int[]arr){

        int curr = 1;
        int prev = arr[0];
        int ans = 1;

        //Arrays.sort(arr);

        for (int i = 1; i < arr.length ; i++) {
            if(arr[i]==prev+1){
                curr++;
            } else if (arr[i]!= prev) {
                curr = 1;

            }
            prev = arr[i];
            ans = Math.max(ans,curr);
        }
        return ans;
    }
    static int optimal(int[]arr){
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i: arr){
            set.add(i);
        }
        for (int j: arr){
            if(!set.contains(j-1)){
                int curr = j;
                int currcount = 1;

                while (set.contains(curr+1)){
                    curr+=1;
                    currcount+=1;

                }
                count = Math.max(count,currcount);
            }
        }
        return count;
    }
}
