public class MaxSumSubArr {
    public static void main(String[] args) {
        int[]arr ={1 ,2 ,7 ,-4 ,3 ,2, -10, 9, 1 };
        System.out.println(maxsumSub(arr));
        System.out.println(maxsubarr(arr));
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
    static int maxsubarr(int[]arr){
        int sum = 0;
        int currsum = 0;
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for (int j = i+1; j <n-2 ; j++) {
                currsum = Math.max(arr[j],currsum+arr[j]);


                sum = Math.max(sum,currsum);



            }
        }
        return sum;

    }
}
