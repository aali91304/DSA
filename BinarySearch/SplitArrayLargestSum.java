package BinarySearch;
//LEETCODE 410 https://leetcode.com/problems/split-array-largest-sum/description/

public class SplitArrayLargestSum {

    public int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;
        for(int i =0;i< nums.length; i++){
            start = Math.max(start,nums[i]);
            end+= nums[i];
        }

        //binarySearch
        while(start < end){
            //potential ans
            int mid  = start + (end -start)/2;

            //calculate how many pieces you can divide this in with this max aum
            int sum =0;
            int pieces =1;
            for(int num : nums){
                if(sum +num > mid){
                    //you cannot add this in this subarray make new one
                    sum = num;
                    pieces++;
                }else{
                    sum+= num;
                }
            }
            if(pieces > m){
                start = mid +1;
            }else{
                end = mid;
            }

        }
        return end; //here start == end;

    }
public static void main(String[] args) {
    SplitArrayLargestSum solution = new SplitArrayLargestSum();

    int[] nums = {7, 2, 5, 10, 8};
    int m = 2;
    System.out.println("Minimum largest sum: " + solution.splitArray(nums, m)); // Output: 18
}

}
