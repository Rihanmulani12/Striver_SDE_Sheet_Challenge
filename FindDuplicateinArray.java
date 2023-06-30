import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class FindDuplicateinArray {
    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(2);
        System.out.println(findDuplicate(arr,arr.size()));

    }
    static int findDuplicate(ArrayList<Integer> arr, int n){
        Collections.sort(arr);
        for (int i = 0; i <arr.size()-1 ; i++) {
            if(Objects.equals(arr.get(i), arr.get(i + 1))){
                return arr.get(i);
            }

        }
        return -1;

    }
}
