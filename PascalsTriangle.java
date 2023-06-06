import java.util.ArrayList;

public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(printPascal(n));
    }
    static ArrayList<ArrayList<Long>> printPascal(int n) {
        ArrayList<ArrayList<Long>> ans = new ArrayList<>();
        for (int r = 1; r <=n; r++) {
            ArrayList<Long>temp = new ArrayList<>();
            for (int c = 1; c <=r; c++) {
                temp.add(ncr(r-1,c-1));

            }
            ans.add(temp);

            
        }
        return ans;


    }
    static long ncr(int n, int r){
        long ans = 1;
        for (int i = 0; i <r ; i++) {
            ans = ans * (n - i);
            ans = ans/(i+1);

        }
        return ans;

    }
}
