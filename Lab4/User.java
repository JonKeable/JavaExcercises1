
public class User
{
    protected String username;
    protected String userType;
    protected String name;
    
    /**
     * contructor for the User class which takes inputs for the different properties of the class
     */
    protected User(String thisUser, String thisType, String thisName){
        username = thisUser;
        userType = thisType;
        name = thisName;
    }
    
    protected String getUsername(){
        return username;
    }
    
    protected String getUserType(){
        return userType;
    }
    
    protected String getName(){
        return name;
    }
    
    protected void setUserType(String newType){
        userType = newType;
    }
}
    
