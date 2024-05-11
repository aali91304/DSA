public class SumOfDigits {
    static int sod(int n){
        //base case
        if(n >= 0 && n<= 9){
            return n;
        }
        //recursive work --> smallans.
        //1st approach

//        int smallans = sod(n/10);
//        return smallans + n%10;

       // 2nd Approach
        return sod(n/10) + n%10;
    }
    public static void main(String[] args) {
        System.out.println(sod(7564));

    }
}
