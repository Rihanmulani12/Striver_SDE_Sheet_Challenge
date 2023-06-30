public class Searcha2DMatrix {
    public static void main(String[] args) {
       int[][] matrix ={
               {1,3,5,7},
               {10,11,16,20},
               {23,30,34,60}};
       int target = 3;
        System.out.println(searchMatrix(matrix,target));
        System.out.println(serchptimal(matrix,target));
    }
    static boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[0].length ; j++) {
                if(matrix[i][j]==target){
                    return true;
                }

            }

        }
        return false;
    }
    static boolean serchptimal(int[][]matrix, int target){
        int i =0;
        int j =0;
       // int mid = matrix[i][j];

        while(i < matrix.length && j > matrix[0].length-1){
            int mid = matrix[i][matrix[0].length-1];
           if(mid==target){
               return true;
           }
           else if(mid >target){
               j--;
           } else if (target > mid) {
               i++;
           }


        }
        return false;
    }
}
