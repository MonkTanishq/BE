import java.util.*;
public class distanceconverter {
    
    Scanner s= new Scanner(System.in);
    Double km,m,hm,dm;
   
    int convert(Double value)
    {
        System.out.println("enter value in kilometre");
        System.out.println("enter value in metre");
        System.out.println("enter value in hectometre");
        System.out.println("enter value in decametre");
        return 0;
    }

    int kmToAll(Double km)
    {
        System.out.println("VAlue in Meter ="+km*1000);
        System.out.println("VAlue in HectoMeter ="+km*10);
        System.out.println("VAlue in DecaMeter ="+km*100);
        return 0;
    }

    int mToAll(Double m)
    {
        System.out.println("VAlue in kiloMeter ="+m/1000);
        System.out.println("VAlue in HectoMeter ="+m/100);
        System.out.println("VAlue in DecaMeter ="+m/10);
        return 0;
    }

    int hmToAll(Double hm)
    {
        System.out.println("VAlue in kiloMeter ="+hm/10);
        System.out.println("VAlue in Meter ="+hm*100);
        System.out.println("VAlue in DecaMeter ="+hm*10);
        return 0;
    }

    int dmToAll(Double dm)
    {
        System.out.println("VAlue in kiloMeter ="+dm/100);
        System.out.println("VAlue in Meter ="+dm*10);
        System.out.println("VAlue in hectoMeter ="+dm/10);
        return 0;
    }

    public static void main(String[] args) 
    {
        distanceconverter d= new distanceconverter();
        int choice ;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your choice");
        System.out.println("Press 1 to convert from KM to All");
        System.out.println("Press 2 to convert from M to All");
        System.out.println("Press 3 to convert from HM to All");
        System.out.println("Press 4 to convert from DM to All");
        choice = s.nextInt();
        switch (choice) 
        {
            case 1:
            System.out.println("Enter km value");
            Double km = s.nextDouble();
            d.kmToAll(km);
            break;

            case 2:
            System.out.println("Enter Metre value");
            Double m = s.nextDouble();
            d.mToAll(m);
            break;
                    
                    
            case 3:
            System.out.println("Enter HectoMe value");
            Double hm = s.nextDouble();
            d.hmToAll(hm);
            break;

            case 4:
            System.out.println("Enter decamtre value");
            double dm = s.nextDouble();
            d.dmToAll(dm);
            break;
      
            default:
            break;
        }

    }
    
}
