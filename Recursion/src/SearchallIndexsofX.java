//Given an array arr of size N and an integer X.
//The task is to find the all indexes of integer X.
public class SearchallIndexsofX {
    static void findIndixes(int[]arr,int n,int X,int idx){
        //base case
        if(idx==n){
            return ;
        }
       //self work
        if(arr[idx]==X){
            System.out.print(idx+" ");

        }
        //Recursive work
        findIndixes(arr,n,X,idx+1);

    }
    public static void main(String[] args) {
        int[]arr={1,2,3,2,2,5};
        int X= 2;
        findIndixes(arr,arr.length,X,0);
    }
}
