public class Dragon extends Enemy
{
    //instance variables
    boolean hasFire;
    String color;
    //constructors
    public Dragon(String name, String color, int might, int health, int movement, double speed, boolean isHostile, boolean hasFire)
    {
        super(name, might, health, movement, speed, isHostile);
        this.hasFire = hasFire;
        this.color = color;
    }//end full constr
    public Dragon()
    {
        super();
        this.hasFire = true;
        this.color = null;
    }//default constr
    //getters
    public boolean getHasFire() {
        return hasFire;
    }

    public String getColor() {
        return color;
    }
    //setters

    public void setHasFire(boolean hasFire) {
        this.hasFire = hasFire;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //toString
    public String toString()
    {
        String output = "---- Dragon ----";
        output += super.toString();
        output += "\nhasFire: " + hasFire;
        return output;
    }//end toString
}
