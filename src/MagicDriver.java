public class MagicDriver
{
    public static void main(String[] args)
    {
        //create an object
        Dragon happy = new Dragon("Happy", "green", 20, 200, 5, 12.4, false, true);
        Dragon nobody = new Dragon();
        Slime george = new Slime("George", 10, 15, 6, 20.35, true, "blue", true);
        //nobody.setName("Sad");
        //print out the object via toString
        System.out.println(happy.toString());
        System.out.println(nobody.toString());
        System.out.println(george.toString());
        //System.out.println("Nobody has been given a name! It's " + nobody.getName());
        //nobody.setMight(10);
        //happy.setHealth(happy.getHealth() - nobody.fireBreath(2));
       // System.out.println(nobody.getName() + " is attacking " + happy.getName() + "! " + happy.getName() + " now has : " + happy.getHealth() + " health");

    }//end main method
}//end driver class
