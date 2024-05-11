
//Find Lucky Integer in an Array


import java.util.Arrays;

public class LuckyInteger {
    static int findlucky(int[]arr){
        Arrays.sort(arr);
        int n= arr.length;
        int maxlucky= -1;
        int count = 1;
        for(int i= n-2;i>=0;i--){
            if(arr[i]==arr[i+1]){
                count++;
            }else{
                if(count==arr[i+1]){
                    maxlucky = Math.max(maxlucky,arr[i+1]);
                }
                count =1;
            }
        }

        //check the first element
        if(count==arr[0]){
            maxlucky=Math.max(maxlucky,arr[0]);
        }
        return maxlucky;

    }

    public static void main(String[] args) {
        LuckyInteger luckyInteger=new LuckyInteger();
        int[]arr1={2,2,1,3};
        int[]arr2={1,2,2,3,3,3};
        System.out.println(luckyInteger.findlucky(arr1));
        System.out.println(luckyInteger.findlucky(arr2));
    }
}
