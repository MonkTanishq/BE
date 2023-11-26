public class Future_Investment {
    public static void main(String[] args) {
        int rate=Integer.parseInt(args[0]);
        int principle=Integer.parseInt(args[1]);
        int time=Integer.parseInt(args[2]);
        int si= (rate*principle*time)/100;
        System.out.println("The total value is " + si);
    }
}
