import java.util.Arrays;

public class KnapSackDP
{
    static int i= 0;

    private static int knapsack(int item[], int val[],int matrix[][], int wt, int n)
    {
        i++;
        if (n == 0 | wt == 0) {
            System.out.println("checking base condition n "+ n + " wt " + wt);
            return 0;
        }

        if (matrix[n][wt] != -1)
        {
            System.out.println("From mem: matrix[n][wt] "+ matrix[n][wt] +"   n "+ n + " wt " + wt);
            return matrix[n][wt];
        }
        System.out.println("checking for Item "+ item[n-1] + " val " + val[n-1] + " wt " + wt);
         if (val[n-1]<=wt)
        {
            System.out.println("checking less wt");
            matrix[n][wt] = Integer.max( val[n-1] + knapsack(item,val,matrix, (wt-val[n-1]), n-1 ),knapsack(item,val,matrix,wt,n-1) );
            return matrix[n][wt];
        }
        else {
            System.out.println("checking gt wt");
             matrix[n][wt] =  knapsack(item,val,matrix,wt,n-1);
             return matrix[n][wt];
         }

    }
    public static void main(String[] args) {
        int items[] ={1,2,3,4,5};
        int vals[]= {2,3,1,2,5}, wt = 13;
        int matrix[][] = new int[6][wt+1];
        for( int a[]: matrix)
        Arrays.fill(a, -1);
        System.out.println("### Result : " + knapsack(items,vals, matrix ,wt,5) + " i : " + i);

    }
}
