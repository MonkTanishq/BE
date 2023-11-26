public class Prime_No {
    public static void main(String[] args) {
        System.out.println("Prime Number Between 1 to 200 is: ");
        for(int i=1; i<=200; i++)
        {
            int count=0;
            for(int j=i; j>=1; j--)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2){
                System.out.print(i+" ");
            }
        }
    }
    
}
