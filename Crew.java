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
    
    public String getName()
    {
        return name;
    }
    
    public String getRole()
    {
        return role;
    }    
}

