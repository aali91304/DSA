import java.util.Scanner;

public class Multiples
{
    static void printMultiples(int n,int k ) //n : 12 k : 5
    {
        //basecase
        if(k==0)
        {
            System.out.println(n);
            return;
        }
        //recursive work
         printMultiples(n,k-1); // 12,24,36,48

        //selfwork
        System.out.println(n*k); //12*5 : 60
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k = sc.nextInt();
        printMultiples(n,k); // methodcall
    }
}
