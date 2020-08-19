public class Dragon extends Enemy
{
    //instance variables
    boolean hasFire;
    //constructors
    public Dragon(String dragonName, int might, boolean isHostile, boolean hasFire)
    {
        super(dragonName, might, isHostile);
        this.hasFire = hasFire;
    }//end full constr
    public Dragon()
    {
        super();
        this.hasFire = true;
    }//default constr
    //getters

    //setters

    //toString
    public String toString()
    {
        String output = "---- Dragon ----";
        output += super.toString();
        output += "\nhasFire: " + hasFire;
        return output;
    }//end toString
}
