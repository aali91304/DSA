public class selectionsort {
    public static void main(String[] args) {
        int nums[]={6,5,2,8,9,4};
        int temp=0;
        int minIndex=-1;
        System.out.println("Beofre sorting: ");
        for(int num:nums){
            System.out.print(num+" ");

        }

//PERFORMING SELECTION SORT
        for(int i=0;i<nums.length-1;i++){
            minIndex=i;

            for(int j=i+1;j< nums.length;j++){
                if(nums[minIndex] > nums[j])
                    minIndex=j;


            }
            temp=nums[minIndex];
            nums[minIndex]=nums[i];
            nums[i]=temp;

            //System.out.println("Beofre sorting: ");
            System.out.println();
            for(int num:nums){
                System.out.print(num+" ");

            }
            System.out.println();
        }




        System.out.println(" ");
        System.out.println("After sorting");
        for(int num:nums){

            System.out.print(num+" ");

        }

    }

}
