package BinarySearch;

import  java.util.*;
public class binarySearchExample
{
    static int binarySearch(int[]nums,int left,int right,int x)
    {
        boolean isAsc= nums[left] < nums[right];

        while(left <= right){

            int mid= right + (left-right)/2;

            if(nums[mid]==x)
                return mid;

            //ASSENDING ORDER
            if(isAsc==true)
            {

                if(nums[mid]< x )
                {
                    left = mid + 1;
                }

                else
                {
                    right = mid - 1;
                }


            }
            //DESCENDING ORDRER

            else
            {
                if(nums[mid]> x)
                {

                    left = mid + 1;
                }

                else
                {
                    right = mid - 1;
                }
            }


        }
        return -1;
    }
    public static void main(String[] args) {
       // binarySearchExample obj = new binarySearchExample();
        int nums[] = {10,7,6,5,3,2};
        int x=3;
        int n= nums.length;
        int result = binarySearch(nums,0,n-1,x);
        if(result == -1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("element found at index : "+result);
        }

    }
}
