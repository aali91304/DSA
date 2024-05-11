package BinarySearch;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0};
        System.out.println(mountainArray(arr1)); // Output: 1

        int[] arr2 = {0, 2, 1, 0,2,0};
        System.out.println(mountainArray(arr2)); // Output: 1

        int[] arr3 = {0, 10, 5, 2,3,0};
        System.out.println(mountainArray(arr3)); // Output: 1

    }
    static  int mountainArray(int[]nums){
       int start = 0;
       int end = nums.length-1;
       while (start< end){
           int mid= start + (end - start)/2;
           if(nums[mid] < nums[mid+1]){
               start = mid +1;
           }
           else{
               end = mid;
           }
       }
       return start;

    }
}
