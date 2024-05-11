public class MaxValueArray {
    static  int maxInArray(int[]arr,int idx){
        //basework
        if(idx==arr.length-1){
            return arr[idx];
        }
        //smallans
        int smallans = maxInArray(arr,idx+1);

        //finalans
        return Math.max(arr[idx],smallans);
    }
    public static void main(String[] args) {
        int[]arr={3,2,5,8,10,9};
        System.out.println(maxInArray(arr,0));

    }
}
