public class Circle {
    public static void circumCircle(double radius)
    {
        double circumference=2*3.14*radius;
        System.out.println("The circumference of circle with radius " + radius + " is " + circumference);
    }
    public static void arcLength(double radius, double angle)
    {
        double arc= (radius*angle*3.14)/180;
        System.out.println("The length of arc of circle with radius " +radius+ " and angle " + angle+ " is " + arc);
    }
    public static void main(String[] args) 
    {
        circumCircle(10);
        arcLength(10,45);
    }
}
