public class Dragon extends Enemy
{
    //instance variables
    boolean hasFire;
    String color;
    double wingspan;
    static int dragonCount = 0;
    //constructors
    public Dragon(String name, String color, int might, int health, int movement, double speed, boolean isHostile, boolean hasFire, double wingspan)
    {
        super(name, might, health, movement, speed, isHostile);
        this.hasFire = hasFire;
        this.color = checkColor(color);
        this.wingspan = validateWingspan(wingspan);
        dragonCount++;
    }//end full constr
    public Dragon()
    {
        super();
        this.hasFire = true;
        this.color = null;
        this.wingspan = 0.0;
        dragonCount++;
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

    public void resetDragonCount()
    {
        dragonCount = 0;
    }
    public void setHasFire(boolean hasFire) {
        this.hasFire = hasFire;
    }

    public void setColor(String color) {
        this.color = checkColor(color);
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

    private String checkColor(String color)
    {
        boolean valid = false;
        while(!valid)
        {
            if(color.equalsIgnoreCase("chromatic"))
            {
                valid = true;
            }
            else if(color.equalsIgnoreCase("metallic"))
            {
                valid = true;
            }
            else
            {
                System.out.println("Invalid color, please try again. (do not be specific, only state chromatic or metallic)");
                color = scan.next();
            }
        }
        return color;
    }//checks for metallic or chromatic dragon
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
