import java.util.Scanner;
class car
{
    private int Registration_No;
    private String Model;
    private String Owner;

    public car()
    {
        System.out.print("Enter the Registration No: ");
        Scanner sc = new Scanner(System.in);
        Registration_No = sc.nextInt();
        System.out.print("Enter Model No: ");
        Model = sc.next();
        System.out.print("Enter Owner's Name: ");
        Owner = sc.next();

    }

    public void show()
    {
        System.out.println("Registration No: " + Registration_No);
        System.out.println("Model: " + Model);
        System.out.println("Owner: " + Owner);
    }
}

class CarWithPrice extends car
{
    private float price;

    public CarWithPrice()
    {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Price of Car: ");
        price = sc.nextFloat();
        
    }

    public void show()
    {
        super.show();
        System.out.println("Price: " + price);
    }
}

class testCheck
{
    public static void main(String[] args) {
        
        CarWithPrice carA = new CarWithPrice();
        carA.show();

        CarWithPrice carB = new CarWithPrice();
        carB.show();
    }
}