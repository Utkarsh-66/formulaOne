import java.io.IOException;
import java.util.Scanner;

public class Driver extends Ferrari {

    public boolean eligible;         // to check for eligibility for driver to enter F1 world championship
    public double earnings;
    public int[] result = new int[100];
    String driverData;               // driver info is saved into file using this string variable

    public Driver()                  // Non-parameterized Constructor
    {
        this.d_id = countDriver;     // d_id is equal to countdrivers initially
        this.points = 0;             //initially 0 ha
        Ferrari.countDriver += 1;
        this.earnings += 5000000;    // earning of drivers
        Ferrari.budget -= 5000000;   // each driver costs 5000000
    }

    public Driver(String name, int age, String country, int exp) throws IOException {
        this.name = name;            // name ko pass kiya ha
        this.d_id = countDriver;     // d_id ko initialize kiya ha
        this.age = age;              // age ko pass kiya
        this.country = country;      // country ko pass kiya ha
        this.points = 0;             // initially 0 points ha
        this.exp = exp;              // experience ko pass kiya ha
        this.eligible = isEligible();//eligiblity check kar rhe ha on the basis of experiance
        Ferrari.countDriver += 1;
        this.earnings += 5000000;    // driver ki earning
        Ferrari.budget -= 5000000;   // each driver costs 5000000
    }

    public void setInfo()    // creates a new y6ydriver 
    { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        this.name = sc.nextLine();
        System.out.print("Age (yrs): ");
        this.age = sc.nextInt();
        System.out.print("Country: ");
        this.country = sc.next();
        System.out.print("Experience (yrs): ");
        this.exp = sc.nextInt();
        System.out.println("Checking driver eligibility...");
        this.eligible = isEligible();
        this.points = 0;
    }

    public void dispInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Driver ID: " + this.d_id);
        System.out.println("Age (min 18 yrs): " + this.age);
        System.out.println("Country: " + this.country);
        System.out.println("Experience (min 3 yrs): " + this.exp + " yrs");
        System.out.println("Season Points: " + this.points);
        System.out.println("Earnings: $" + this.earnings);
    }

    private boolean isEligible() {
        if (this.age < 18) // use of ArithmeticException
            throw new ArithmeticException("Driver must be at least 18 years old to be eligible.");

        try { // use of custom exception customExc
            if (this.exp < 3)
                throw new customExc("Driver must have at least 3 years of experience.");
        } 
        catch (customExc e) {
            System.out.println(e);
        }
       // if( this.age >18 && this.exp >3) System.out.println("Driver is eligible.");


        return true;
    }

    // public void logFile() {
    //     this.driverData = this.name + ", " + this.d_id + ", " + this.age + ", " + this.country + ", " + this.exp + ", "
    //             + this.points + ", $" + this.earnings + "\n";  //string ke andar value daali ha driver info ki
    //     try {
    //         Ferrari.setFile(this.driverData, "Drivers.txt");   //setfile function call kiya ha to store data into file
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }
    // }
}
