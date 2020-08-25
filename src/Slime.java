public class Slime extends Enemy
{
    //instance vars
    String color;
    boolean isPoisonous;
    static int slimeCount = 0;

    //constructors
    public Slime(String name, int might, int health, int movement, double speed, boolean isHostile, String color, boolean isPoisonous)
    {
        super(name, might, health, movement, speed, isHostile);
        this.color = checkColor(color);
        this.isPoisonous = isPoisonous;
        slimeCount++;
    }//end full contr

    public Slime()
    {
        super();
        color = "green";
        isPoisonous = false;
        slimeCount++;
    }//end default

    //setters

    public void resetSlimeCount()
    {
        slimeCount = 0;
    }

    public void setColor(String color) {
        this.color = checkColor(color);
    }

    public void setPoisonous(boolean poisonous) {
        isPoisonous = poisonous;
    }
    //getters

    public String getColor() {
        return color;
    }

    public boolean isPoisonous() {
        return isPoisonous;
    }

    //brain methods
    public int poisonAttack(int numTimes)
    {
        if(isPoisonous)
        {
            return attack(numTimes) + 10;
        }
        return 0;
    }//end poison attack
    private String checkColor(String color)
    {
        boolean valid = false;
        while(!valid)
        {
            if(color.equalsIgnoreCase("green"))
            {
                valid = true;
            }
            else if(color.equalsIgnoreCase("blue"))
            {
                valid = true;
            }
            else if(color.equalsIgnoreCase("yellow"))
            {
                valid = true;
            }
            else
            {
                System.out.println("Invalid color, please try again.");
                color = scan.next();
            }
        }
        return color;
    }//end checkColor
    //toString
    public String toString()
    {
        String output = "---- SLIME ----";
        output += super.toString();
        output += "\nColor: " + color;
        output += "\nisPoisonous: " + isPoisonous;
        return output;
    }//end toString

}
