import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class MissingAndRepeatingNumbers {
    public static void main(String[] args) {
//       ArrayList<Integer>arr =new ArrayList<>();
//       arr.add(2);
//       arr.add(3);
//       arr.add(4);
//       arr.add(2);
//        //System.out.println(find(arr));
//        //System.out.println(Arrays.toString(missingAndRepeating(arr, arr.size())));
        int[]arr ={2,3,4,4,5};
        System.out.println(Arrays.toString(find(arr)));
        System.out.println(Arrays.toString(missingrepated(arr)));
    }
    static ArrayList<Integer> find(ArrayList<Integer>arr){
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (!set.add(num)) {
                ans.add(num);
            }
        }

        for (int i = 1; i <= arr.size(); i++) {
            if (!set.contains(i)) {
                ans.add(i);
            }
        }
        return ans;
    }
    static int[]find(int []arr){
        int missing = -1;
        int repated = -1;


        for (int i = 1; i <= arr.length ; i++) {
            int count = 0;
            for (int k : arr) {
                if (k == i) {
                    count++;

                }
            }
              if(count==2){
                    repated = i;
                }
                else if(count==0){
                    missing = i;
                }

                if(repated != -1 && missing != -1){
                    break;
                }

            }

        return new int[]{repated,missing};


    }
    static int[]missingrepated(int[]arr){
        int missing = -1, repated = -1;
        for(int i=1; i<= arr.length; i++ ){
            int count = 0;
            for(int l : arr) {
                if (l == i) {
                    count++;
                }
            }
                if(count==2){
                    repated= i;
                }
                else if(count==0){
                    missing= i;
                }
            if(repated != -1 && missing != -1){
                break;
            }
        }
        int[] ans = {repated,missing};
        return ans;
    }


}
