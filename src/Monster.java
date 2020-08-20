public class Monster extends Enemy
{
    //intstance variable
    int level;

    //constructors
    public Monster(String name, int might, int health, int movement, double speed, boolean isHostile, int level)
    {
        super(name, might, health, movement, speed, isHostile);
        this.level = level;
    }//end full constructor

    public Monster(int level)
    {
        super();
        this.level = level;
    }//creates default monster but scales up to level
    public Monster()
    {
        super();
        level = 0;
    }//end default constructor
    //toString
    public String toString()
    {
        String output = "---- MONSTER ----";
        output += "\n Level: " + level;
        output += super.toString();
        return output;
    }
}
