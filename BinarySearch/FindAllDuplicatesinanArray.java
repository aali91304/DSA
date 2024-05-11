package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesinanArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            int index = Math.abs(num) - 1;

            if (nums[index] < 0) {
                result.add(index + 1);
            } else {
                nums[index] = -nums[index];
            }
        }

        return result;
    }
    public static void main(String[] args) {
        FindAllDuplicatesinanArray solution = new FindAllDuplicatesinanArray();
        int[] nums = {4,3,2,7,8,2,3,1};
        int[]nums1 = {1,1,2};
        System.out.println(solution.findDuplicates(nums));
        System.out.println(solution.findDuplicates(nums1));

    }


}
