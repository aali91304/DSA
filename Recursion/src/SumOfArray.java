public class SumOfArray {
//    static  int sumofArray(int[]arr, int start, int end)
//    {
//
//        if (start > end) {
//            return 0;  // Base case: return 0 for empty subarray
//        }
//         //Recursive work
//        return arr[start] + sumofArray(arr, start + 1, end);
//    }
    static int sumofArray(int[]arr,int idx){
        //base case
       if(idx == arr.length){
           return 0;
       }
       //recursivework subproblem

        int smallans = sumofArray(arr,idx+1);

       //selfwork
        return smallans + arr[idx];
    }
    public static void main(String[] args) {
        int[]arr = {2,3,5,20,1};
//        int sum = sumofArray(arr, 0, arr.length - 1);
//        System.out.print(sum);
        System.out.println(sumofArray(arr,0));
    }
}
