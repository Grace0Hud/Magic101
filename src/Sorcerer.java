import java.util.ArrayList;
public class Sorcerer
{
    //instance variables
    int physMight;
    double magicPower;
    int health;
    int movement;
    boolean hasHeal;
    String name;
    ArrayList<String> inventory = new ArrayList<>();
    //constructors
    public Sorcerer(String name, int might, double magicMight, int health, int movement, boolean hasHeal, String startingWeapon)
    {
        this.name = name;
        this.physMight = might;
        this.magicPower = magicMight;
        this.health = health;
        this.movement = movement;
        this.hasHeal = hasHeal;
        inventory.add(startingWeapon);
    }//end of full constructor
    public Sorcerer()
    {
        name = "Sam Smorkle";
        physMight = 0;
        this.magicPower = 0;
        this.hasHeal = false;
        health = 0;
        movement = 0;
        inventory.add("shank");
    }//end default constructor
    public Sorcerer(String name)
    {
        this.name = name;
        physMight = 0;
        this.magicPower = 0;
        this.hasHeal = false;
        health = 0;
        movement = 0;
        inventory.add("shank");
    }//end constructor with only name different
    public Sorcerer(boolean hasHeal, String startingWeapon)
    {
        this. hasHeal = hasHeal;
        inventory.add(startingWeapon);
        this.name = "Sam Smorkle";
        physMight = 0;
        this.magicPower = 0;
        health = 0;
        movement = 0;

    }//constructor to create pure healer

    //getters
    public String getInventory()
    {
        String output = "";
        for(String e: inventory)
        {
            output += e + ", ";
        }//end for
        return output;
    }//prints out a list of the things in the player's inventory
    public ArrayList<String> getInventoryList()
    {
        return inventory;
    }//gives actual inventory array

    public String getName()
{
    return name;
}//returns name
    public int getPhysMight()
    {
        return physMight;
    }//returns might

    public double getMagicPower() {
        return magicPower;
    }

    public int getHealth() {
        return health;
    }

    public int getMovement() {
        return movement;
    }

    public boolean hasHeal() {
        return hasHeal;
    }

    //setters
    public void setName(String name)
    {
        this.name = name;
    }//sets name

    public void setPhysMight(int might)
    {
        this.physMight = might;
    }

    public void setMagicPower(double magicPower) {
        this.magicPower = magicPower;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setHeal(boolean hostile) {
        hasHeal = hostile;
    }

    public void setMovement(int movement) {
        this.movement = movement;
    }
    
    //to string
    public String toString()
    {
        String output = "-----Sorcerer-----";
        output += "\nName: " + name;
        output += "\nHealth: " + health;
        output += "\nMight: " + physMight;
        output += "\nMagic Power: " + magicPower;
        output += "\nHealer: " + hasHeal;
        output += "\nMovement: " + movement;
        output += "\nInventory: " + getInventory();
        return output;
    }//end toString

}//end class sorcerer