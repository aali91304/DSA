
public class SeriesSum {
    static int alternateSum(int n){
        //base case
        if(n==0)return 0;

        //recursive work
        if(n % 2 == 0){
            return alternateSum(n-1)-n;
        }
        else{
            return alternateSum(n-1)+n;
        }
    }
    static int seriesSum(int n){
        //base case
        if(n==0) return 0;
        //recursive work
       return seriesSum(n-1)+n;
    }

    public static void main(String[] args) {
        System.out.println(seriesSum(5));
        System.out.println(alternateSum(5));
    }
}
