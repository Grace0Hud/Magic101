public class MagicDriver
{
    public static void main(String[] args)
    {
        //create an object
        Dragon happy = new Dragon("Happy", 20, false, true);
        Dragon nobody = new Dragon();
        //nobody.setName("Sad");
        //print out the object via toString
        System.out.println(happy.toString());
        System.out.println(nobody.toString());
        //System.out.println("Nobody has been given a name! It's " + nobody.getName());
    }//end main method
}//end driver class
