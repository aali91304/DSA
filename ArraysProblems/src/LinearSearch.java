
public class LinearSearch {
    public static void main(String[] args) {
        int[]nums={12,15,7,43,25,50};
        int target=25;
        int result= Search(nums,target);
        boolean result2= Search2(nums,target);
        System.out.println(result);
        System.out.println(result2);
    }
    static  int Search(int[]arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i< arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }

        return -1;
    }

    static  boolean Search2(int[]arr,int target) {
        if (arr.length == 0) {
            return false;
        }
        for(int element:arr){
            if(element==target);
            return true;
        }
        return false;
    }
}
