class local
{  int x,y;
    static int result;
    void add(int a, int b)
    {
        x = a;
        y = b;
        int sum = x+y;
        System.out.println("Sum = " + sum);
    }
    public static void main(String[] args) {
        local obj = new local();
        obj.add(20c,20);
    }
}