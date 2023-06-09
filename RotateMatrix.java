import java.util.ArrayList;
import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        mat.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        mat.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        mat.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

        int n = mat.size();
        int m = mat.get(0).size();
        rotateMatrix(mat, n, m);

        System.out.println(mat);


    }

    static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = m - 1;

        while (colStart < colEnd && rowStart < rowEnd) {
            int prev = mat.get(rowStart + 1).get(colStart);
            System.out.println(prev);

            for (int i = colStart; i <= colEnd; i++) {
                int curr = mat.get(rowStart).get(i);
                System.out.println(curr);
                mat.get(rowStart).set(i, prev);
                prev = curr;
                System.out.println(prev);
            }

            rowStart++;
            System.out.println(rowStart);
            for (int i = rowStart; i <= rowEnd; i++) {
                int curr = mat.get(i).get(colEnd);
                System.out.println(curr);
                mat.get(i).set(colEnd, prev);
                prev = curr;
                System.out.println(prev);
            }

            colEnd--;
            System.out.println(colEnd);
            for (int i = colEnd; i >= colStart; i--) {
                int curr = mat.get(rowEnd).get(i);
                System.out.println(curr);
                mat.get(rowEnd).set(i, prev);
                prev = curr;
                System.out.println(prev);
            }

            rowEnd--;
            System.out.println(rowEnd);
            for (int i = rowEnd; i >= rowStart; i--) {
                int curr = mat.get(i).get(colStart);
                System.out.println(curr);
                mat.get(i).set(colStart, prev);
                prev = curr;
                System.out.println(prev);
            }
            colStart++;
            System.out.println(colStart);
        }
    }

}

