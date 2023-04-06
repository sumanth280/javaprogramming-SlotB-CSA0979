import java.io.*;
import java.util.*;
class Matrix
{
    public static void main(String[] args)
    {
        int r,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        r=sc.nextInt();
        System.out.println("Enter the number of Cols:");
        c=sc.nextInt();
        int ma1[][]=new int[r][c];
        int ma2[][]=new int[r][c];
        int res[][]=new int[r][c];
        System.out.println("Enter the elements of matrix 1:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                ma1[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Enter the elements of matrix 2:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                ma2[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                res[i][j]=ma1[i][j]+ma2[i][j];
            }
        }
        System.out.println("Sum of matrices is:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(res[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
