public class MergeSort {
    public static void Divide(int[]arr,int start,int end){
        if(start >= end)
        {
            return;
        }
            int mid = start + (end - start) / 2;
            Divide(arr,start,mid);
            Divide(arr,mid+1,end);
            Conquer(arr,start,mid,end);

    }

    private  static void Conquer(int[] arr, int start, int mid, int end) {
        int[]merged = new int[end-start+1];
        int index1=start;
        int index2= mid+1;
        int x=0;
        while(index1 <= mid && index2 <= end){
            if(arr[index1]<= arr[index2]){
                merged[x++]=arr[index1++];
            }else{
                merged[x++]= arr[index2++];
            }
        }
        while (index1<=mid){
            merged[x++]=arr[index1++];

        }
        while (index2 <= end){
            merged[x++]=arr[index2++];
        }
        for(int i=0, j= start; i< merged.length;i++,j++){
            arr[j]=merged[i];
        }
    }

    public static void main(String[] args) {
        int[]arr={6,3,9,5,2,8};
        int n= arr.length;
        //Printing before sorted
        System.out.println("Before soring:");
        for(int num : arr){
            System.out.print(num+" ");
        }
        //Calling
        Divide(arr,0,n-1);
        System.out.println();
        System.out.println("After Sorting: ");
        for (int num: arr){
            System.out.print(num+" ");
        }

    }
}
