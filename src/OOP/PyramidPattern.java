package OOP;

public class PyramidPattern
{
    public static void main(String[] args)
    {
        int n = 6;  // Number of rows.

        //Outer Loop for number of Rows
        for(int i=0;i<n;i++)
        {
            for(int k=i;k<n;k++)
                System.out.print("  ");

            // We run loop till j = 2*i to print odd no. of stars.
            for(int j=0;j<=2*i;j++)
            {
                // We print '*' for each row.
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
