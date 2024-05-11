package BinarySearch;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4,5,6,7};
        int target=5;
        int result= binarySearch(nums,target,0,nums.length-1);
        System.out.println("element present at index : "+result);
    }
    public static  int binarySearch(int[] nums,int target ,int start,int end){
        if(start <= end){
          int mid = (start+end)/2;
          if(nums[mid]==target)
              return mid;
          else if(nums[mid]<target)
              return binarySearch(nums,target,mid+1,end);
          else
              return binarySearch(nums,target,start,mid-1);
        }


        return-1;
    }
}
