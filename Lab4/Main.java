
public class Main
{
    public static void main(String[] args){
        
        Toolbox myTool = new Toolbox();
        /*
        int myInt;
        System.out.println();
        System.out.println("---------------------------------------------------");
        System.out.println("              Times Table Generator                ");
        System.out.println("---------------------------------------------------");
        System.out.println();
        System.out.println("Please enter a number to generate a times table for");
        myInt = myTool.readIntegerFromCmd();
        System.out.println();
        System.out.println("Times table for " + myInt);
        for(int i=1; i<21; i++){
            System.out.println(myInt*i);
        }        
        System.out.println();
        System.out.println("---------------------------------------------------");
        System.out.println("                    Ints to 500                    ");
        System.out.println("---------------------------------------------------");
        System.out.println();
        int i = 1;
        myInt = 1;
        while(myInt <500){
            myInt = myInt + i;
            i = i + 1;
        }
        System.out.println("total of " + myInt + " reached after " + (i-1) + " iterations");
        */
       UserGroup Ugroup = new UserGroup();
       Ugroup.addSampleData();
       Ugroup.printUsernames();
    }       
}
