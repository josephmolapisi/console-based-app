/**
 * Write a description of class Cast here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cast{
    // instance variables - replace the example below with your own
    private String name;      //name of actor/actress

    // Constructor to create a cast member with a name 
    public Cast(String name)
    {
        this.name = name;
    }

    // setter for cast name
    public void setName(String name){
        this.name=name;
    }

    // getter for cast name
    public String getName()
    {
        return name;
    }
    
    
}
