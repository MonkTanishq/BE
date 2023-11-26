import java.util.*;
public class SortArray {
    public static void main(String[] args) 
    {
        int num=Integer.parseInt(args[0]);
        
        int[] arrayI;
        arrayI= new int[num];
        for(int i=0; i<num; i++)
        {
            int term=Integer.parseInt(args[i+1]);
            arrayI[i]=term;
        }
        Arrays.sort(arrayI);
        System.out.print("The sorted numeric array is: ");
        for(int i=0; i<num; i++)
        {
            System.out.print(arrayI[i] + " ");
        }
        System.out.println();
        
        String[] arrayS;
        arrayS= new String[num];
        for(int i=0; i<num; i++)
        {
            String term= args[num+i+1];
            arrayS[i]=term;
        }
        Arrays.sort(arrayS);
        System.out.print("The sorted string array is: ");
        for(int i=0; i<num; i++)
        {
            System.out.print(arrayS[i] + " ");
        }

    }
}
