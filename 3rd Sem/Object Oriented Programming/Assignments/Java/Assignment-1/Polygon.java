public class Polygon {
    static void area(double n, double length)
    {
        double angle= Math.toRadians(180/n); 
        angle=Math.tan(angle);
        double Area=(length*length*n)/(4*angle);
        System.out.println("The area of polygon with "+ n + " sides is "+ Area);
    }
    static void Perimeter(double n, double length)
    {
        double perimeter=n*length;
        System.out.println("The perimeter of polygon with "+ n + " sides is "+ perimeter);
    }
    public static void main(String[] args) 
    {
        area(6, 10);
        Perimeter(6, 10);
    }
}
