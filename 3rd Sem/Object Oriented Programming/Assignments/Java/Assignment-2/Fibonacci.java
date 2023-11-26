public class Fibonacci {
    public static void main(String[] args) {
        int n1=0, n2=1, n3=0; 
	    int n=Integer.parseInt(args[0]);
	    System.out.print(n1 + " " + n2);
	    for(int i=1; i<n-1; i++)
        {
	        n3=n1+n2;
            System.out.print(" "+ n3);
	        n1=n2;
	        n2=n3;
	    }
    }
}
