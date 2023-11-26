import java.util.Scanner;
public class Matrix_asm {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int [][]mat1 =new int[3][3];
        int [][]mat2 =new int[3][3];
        int [][]add=new int[3][3];
        int [][]sub=new int[3][3];
        int [][]multi=new int[3][3];
        
        System.out.println("Enter elements of first matrix: ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                mat1[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Enter elements of second matrix: ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                mat2[i][j]=sc.nextInt();
            }
        }

        System.out.println("Both matrix are: ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }
         System.out.println();
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
               add[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        System.out.println("Addition of matrix is: ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(add[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                sub[i][j]=mat1[i][j]-mat2[i][j];
            }
        }
        System.out.println("Subtraction of matrix is: ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(sub[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Multiplication of matrix is: ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++)
                {
                    multi[i][j] += mat1[i][k]*mat2[k][j];
                }
                System.out.print(multi[i][j]+" ");
            }
            System.out.println();
        }
    }
}
