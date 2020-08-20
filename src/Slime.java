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

    //getters

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
