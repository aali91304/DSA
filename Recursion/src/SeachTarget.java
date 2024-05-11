//searching value in array using Recursion
public class SeachTarget {
    static boolean searchtarget(int[]arr,int target,int idx){
       //basecase
        if(idx==arr.length){
            return false;
        }

       //selfwork
        if(arr[idx]==target) return true;

        //RcursiveWork
        return searchtarget(arr,target,idx+1);
    }
    public static void main(String[] args) {
        int[]arr={1,3,5,7,9,8};
        int target = 70;
        if(searchtarget(arr,target,0)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
