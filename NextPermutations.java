import java.util.ArrayList;
import java.util.Collections;

public class NextPermutations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0,2);
        list.add(1,3);
        list.add(2,1);
        list.add(3,4);
        list.add(4,5);
        System.out.println(list);


        System.out.println(permuation(list));
    }
    static ArrayList<Integer>permuation(ArrayList<Integer>permutation){
        int index = -1;
        int n = permutation.size();

        for (int i = n-2; i >=0 ; i--) {
            if(permutation.get(i)<permutation.get(i+1)){
                index = i;
                break;
            }

        }
        if(index==-1){
            Collections.reverse(permutation);
            return permutation;
        }

        for (int i = n-1; i >=0 ; i--) {
            if(permutation.get(i)>permutation.get(index)){
                int temp = permutation.get(i);
                permutation.set(i,permutation.get(index));
                permutation.set(index,temp);
                break;
            }

        }
        ArrayList<Integer>list = new ArrayList<>(permutation.subList(index+1,n));
        Collections.reverse(list);
        permutation.subList(index + 1, n).clear();

        permutation.addAll(list);


        return permutation;

    }

}


