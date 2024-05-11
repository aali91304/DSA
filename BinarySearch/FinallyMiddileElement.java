package BinarySearch;

public class FinallyMiddileElement {
    public static void main(String[] args) {
        int[]nums={2,3,5,9,14,16,18};
        int target = 15;
        int ans = Ceiling(nums,target);
        System.out.println(ans);

    }
    // 1.return the index greatest numberv>=target   //16 ans = 4

//    static int Ceiling(int[]arr, int target){
//        int start =0;
//        int end= arr.length-1;
//        while (start <= end){
//            int mid = start + (end - start)/2;
//            if(target< arr[mid]){
//                end = mid -1;
//            } else if (target > arr[mid]) {
//                start = mid +1;
//
//            }else{
//                //ans found
//                return mid;
//            }
//        }
//        return start;
//    }

    //2.return the index greatest number<=target    //14 ans = 5

    static int Ceiling(int[]arr, int target){
        int start =0;
        int end= arr.length-1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(target< arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid +1;

            }else{
                //ans found
                return mid;
            }
        }
        return end;
    }

}
