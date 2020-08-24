import java.util.Scanner;
public class Dragon extends Enemy
{
    //instance variables
    boolean hasFire;
    String color;
    double wingspan;
    Scanner scan = new Scanner(System.in);
    //constructors
    public Dragon(String name, String color, int might, int health, int movement, double speed, boolean isHostile, boolean hasFire, double wingspan)
    {
        super(name, might, health, movement, speed, isHostile);
        this.hasFire = hasFire;
        this.color = color;
        this.wingspan = validateWingspan(wingspan);
    }//end full constr
    public Dragon()
    {
        super();
        this.hasFire = true;
        this.color = null;
        this.wingspan = 0.0;
    }//default constr
    //getters
    public boolean getHasFire() {
        return hasFire;
    }

    public String getColor() {
        return color;
    }

    public double getWingspan() {
        return wingspan;
    }
    //setters

    public void setHasFire(boolean hasFire) {
        this.hasFire = hasFire;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = validateWingspan(wingspan);
    }

    //brain methods
    public int fireBreath(int numTimes)
    {
        if(hasFire)
        {
            return attack(numTimes) + 10;
        }
        return 0;
    }
    //data validation
    public double validateWingspan(double wingspan)
    {
        while(wingspan < 0)
        {
            System.out.println("You can't have negative wings. Try again.");
            wingspan = scan.nextDouble();
        }
        return wingspan;
    }//end method to validate wingspan entry
    //toString
    public String toString()
    {
        String output = "---- Dragon ----";
        output += super.toString();
        output += "\nhasFire: " + hasFire;
        output += "\nWingspan: " + wingspan;
        return output;
    }//end toString
}
