
public class fibonacci {
    static int fibonacciSeries(int n){
        if(n==0 || n==1){
            return n;
        }
//        int prev=fibonacciSeries(n-1);
//        int prevprev= fibonacciSeries(n-2);
        return fibonacciSeries(n-1)+ fibonacciSeries(n-2);
    }
    public static void main(String[] args) {
        for(int i =0;i<= 10;i++) {
            System.out.println(fibonacciSeries(i));
        }

    }
}
