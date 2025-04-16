/**
* 
 * 
 * @author 
 * @version (a version number or a date)
 */
public class Crew{
    // instance variables 
    private String name;        //name of Crew memeber.
    private String role;       //role of crew member

    /**
     * Constructor for objects of class Crew
     */
    public Crew(String name, String role)
    {
        this.name = name;
        this.role = role;
    }

    // getter for crew member name 
    public String getName()
    {
        return name;
    }

    // getter for crew member role 
    public String getRole()
    {
        return role;
    }    
}

