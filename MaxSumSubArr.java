public class MaxSumSubArr {
    public static void main(String[] args) {
        int[]arr ={1 ,2 ,7 ,-4 ,3 ,2, -10, 9, 1 };
        System.out.println(maxsumSub(arr));
    }
    static int maxsumSub(int[] arr){
        long max = arr[0];
        long maxAns = arr[0];

        for (int i = 1; i < arr.length; i++) {

            max = Math.max(arr[i], max + arr[i]);


            if (max < 0) {
                max = 0;
            }


            maxAns = Math.max(maxAns, max);
        }

        return (int) maxAns;
    }
}
