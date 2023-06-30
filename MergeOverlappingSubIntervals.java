import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeOverlappingSubIntervals {
    public static void main(String[] args) {
      int[][]  intervals={{1,3},{2,6},{8,10},{15,18}};

        System.out.println(mergeOverlappingIntervals(intervals));
        System.out.println(mergeintevl(intervals));
    }
    static List<List<Integer>> mergeOverlappingIntervals(int[][] arr) {
        int n = arr.length;
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        System.out.println(Arrays.deepToString(arr));

        List<List<Integer>>ans = new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            int s = arr[i][0];
            System.out.println(s);
            int e = arr[i][1];
            System.out.println(e);

            if(ans.size()!=0 && e<= ans.get(ans.size()-1).get(1)){
                System.out.println(ans.get(ans.size()-1).get(1));
                continue;
            }
            for (int j = i+1; j <n ; j++) {
                if(arr[j][0]<=e){
                    System.out.println(arr[j][0]);
                    e = Math.max(e,arr[j][1]);
                    System.out.println(arr[j][1]);
                }
                else{
                    break;
                }

            }
            ans.add(Arrays.asList(s,e));

        }
        return ans;
    }

    static List<List<Integer>>mergeintevl(int[][] arr){
        int n = arr.length;
        List<List<Integer>>ans= new ArrayList<>();
        Arrays.sort(arr,Comparator.comparingInt(a->a[0]));
        for(int i=0; i<n; i++){
            int s = arr[i][0];
            int e = arr[i][1];

            if(ans.size()!=0 && e<=ans.get(ans.size()-1).get(1)){
                continue;
            }

            for(int j=i+1; j<n; j++){
                if(arr[j][0]<=e){
                    e = Math.max(arr[j][1],e);
                }
                else{
                    break;
                }
            }


            ans.add(Arrays.asList(s,e));






        }

        return ans;

    }
}
