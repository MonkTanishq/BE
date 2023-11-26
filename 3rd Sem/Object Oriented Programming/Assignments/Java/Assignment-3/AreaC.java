import java.util.Scanner;
public class AreaC {
    public static void main(String[] args) {
        float r, R;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of Inner-Circle:");
        r = sc.nextFloat();
        System.out.print("Enter the Radius of Outer-Circle:");
        R = sc.nextFloat();
        
        Float areabig = (float)3.1415*R*R;
        Float areasmall = (float)3.1415*r*r;
        System.out.print("The Area of Circular Region is:" + (areabig-areasmall));
    }    
}
