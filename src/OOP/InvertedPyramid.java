package OOP;

public class InvertedPyramid
{
    public static void main(String[] args)
    {
        int n = 5;  // Number of rows.

        //Outer Loop for number of Rows
        for(int i=n;i>0;i--)
        {
            for(int k=i;k<n;k++)
                System.out.print("  ");

            // We run loop from j = 2*i to 2 print odd no. of stars.
            for(int j=2*i;j>1;j--)
            {
                // We print '*' for each row.
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}