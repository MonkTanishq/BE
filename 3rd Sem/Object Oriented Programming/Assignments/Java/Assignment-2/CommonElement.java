public class CommonElement {
    public static void main(String[] args) 
    {
        int num1=Integer.parseInt(args[0]);
        int num2=Integer.parseInt(args[1]);
        int common, count=0;
        if(num1>num2)
        {
            common=num2;
        }
        else
        {
            common=num1;
        }
        String[] s1=new String[num1];
        String[] s2=new String[num2];
        String[] s3=new String[common];
        for(int i=0; i<num1; i++)
        {
            String term= args[i+2];
            s1[i]=term;
        }
        for(int i=0; i<num2; i++)
        {
            String term= args[num1+i+2];
            s2[i]=term;
        }
        for(int i=0; i<num1; i++)
        {
            for(int j=0; j<num2; j++)
            {
                if(s1[i].equals(s2[j])==true)
                {
                    s3[count]=s1[i];
                    count++;
                }
            }
        }
        System.out.println("Number of common elements are: " + count);
        System.out.println("The common elements are: ");
        for(int i=0; i<count; i++)
        {
            System.out.print(s3[i]+ " ");
        }

    }
}
