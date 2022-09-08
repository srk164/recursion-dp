public class KnapSackRecursive
{
    static int i= 0;
    private static int knapsack(int item[], int val[], int wt, int n)
    {
        i++;
        if (n == 0 | wt == 0) {
            System.out.println("checking base condition n "+ n + " wt " + wt);
            return 0;
        }
        System.out.println("checking for Item "+ item[n-1] + " val " + val[n-1] + " wt " + wt);
         if (val[n-1]<=wt)
        {
            System.out.println("checking less wt");
            return Integer.max( val[n-1] + knapsack(item,val, (wt-val[n-1]), n-1 ),knapsack(item,val,wt,n-1) );
        }
        else {
            System.out.println("checking gt wt");
            return knapsack(item,val,wt,n-1);
        }

    }
    public static void main(String[] args) {
        int items[] ={1,2,3,4,5};
        int vals[]= {2,3,1,2,5}, wt = 13;

        System.out.println("### Result : " + knapsack(items,vals,wt,5) + " i : " + i);

    }
}
