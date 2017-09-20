import java.util.ArrayList;

public class UserGroup
{
    ArrayList<User> list;
    
    protected UserGroup(){
        list = new ArrayList<User>();
    }
    
    protected void addSampleData(){
        String myUsername;
        String myType;
        String myName;
        char myChar = 'A';
        for(int i = 0; i < 10; i++){
            myUsername = ("User" + myChar);
            
            if(i % 3 == 0){
                myType = "user";
            }
            else if((i+1) % 3 == 0){
                    myType = "editor";
                }
                else{
                    myType = "admin";
                }
            
            myName = ("Billy " + myChar);    
            list.add(new User(myUsername,myType,myName));
            myChar ++;
        }
    }
    
    protected User getUser(int index){
        return list.get(index);
    }
    
    protected void printUsernames(){
        for(User u : list){
            System.out.print(u.getUsername());
            System.out.print("  ");
            System.out.println(u.getUserType());
        }
    }
}
