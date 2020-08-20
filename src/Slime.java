public class Slime extends Enemy
{
    //instance vars
    String color;
    boolean isPoisonous;

    //constructors
    public Slime(String name, int might, int health, int movement, double speed, boolean isHostile, String color, boolean isPoisonous)
    {
        super(name, might, health, movement, speed, isHostile);
        this.color = color;
        this.isPoisonous = isPoisonous;
    }//end full contr

    public Slime()
    {
        super();
        color = "green";
        isPoisonous = false;
    }//end default

    //setters

    public void setColor(String color) {
        this.color = color;
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
    }
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
