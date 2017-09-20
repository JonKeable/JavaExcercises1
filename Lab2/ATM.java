
public class ATM
{
    /**
     * bank balance variable declared and a Toolbox object created
     */
    int balance;
    Toolbox myTool = new Toolbox();
    /**
     * The main method is executed here
     */
    public static void main(String[] args)
    {
       ATM myATM = new ATM();
       myATM.go();
    }
    
    /**
     * The go method which handles the operation of the account
     */
    public void go()
    {
        boolean exit = false;
            //to control the exit while loop
        boolean correct = false;
            //to control loops with imputs to make sure the input is valid
        int amount = 0;
            //used to store the amount a user enters to check it is valid
        System.out.println("Welcome to online ATM banking");
        /**
         * Get the balance for the account from the user
         */
        while(correct == false)
        {
            System.out.println("How much money do you want in your account?");
            System.out.println("Please enter a number in whole pounds");
            amount = myTool.readIntegerFromCmd();
            /**
             * Checks the amount for the account is at least 1 pound
             */
            if(amount < 1)
            {
                System.out.println("Must be at least 1 pound in your account");
            }
            else
            {
                correct = true;
                balance = amount;
            }
        }
        System.out.println("Your balance is: " + balance + " pounds");
        /**
         * This loop allows the user to perform 3 differnt tasks until they wish to exit
         */
        while(exit == false)
        {
            int choice = 0;
            correct = false;
            while(correct == false)
            {
                System.out.println();
                System.out.println("What do you want to do? ");
                System.out.println("1 : Withdraw ");
                System.out.println("2 : Deposit ");
                System.out.println("3 : Inquire ");
                System.out.println("4 : Quit  ");
                System.out.println("Please enter the corresponding number ");
                choice = myTool.readIntegerFromCmd();
                if((choice > 0) && (choice < 5))
                {
                    correct = true;
                }
                else
                {
                    System.out.println("invalid input (please enter a number 1-4)");
                }
            }
            correct = false;
            /**
             * If the choice is 1 then Withdraw
             */
            if(choice == 1)
            {
                System.out.println("***************************************");
                System.out.println("               Withdrawl               ");
                System.out.println("***************************************");
                while(correct == false)
                {
                    System.out.println("How much do you wish to withdraw?");
                    System.out.println("Your balance is currently: " + balance + " pounds");
                    System.out.println("Please enter an amount in whole pounds");
                    amount = myTool.readIntegerFromCmd();
                    if(amount > balance)
                    {
                        System.out.println("Insufficient funds!");
                    }
                    else
                    {
                        if(amount < 0)
                        {
                            System.out.println("amount must be positive");
                        }
                        else
                        {
                            correct = true;
                        }
                    }
                }
                balance = balance - amount;
                System.out.println("your balance is now " + balance + " pounds");
            }
            /**
             * If choice is 2 then Deposit
             */
            if(choice == 2)
            {
                System.out.println("***************************************");
                System.out.println("                Deposit                ");
                System.out.println("***************************************");
                while(correct == false)
                {
                        System.out.println("How much do you wish to deposit into your account?");
                        System.out.println("Your balance is currently: " + balance + " pounds");
                        System.out.println("Please enter an amount in whole pounds");
                        amount = myTool.readIntegerFromCmd();
                        if(amount < 0)
                        {
                            System.out.println("amount must be positive");
                        }
                        else
                        {
                            correct = true;
                        }
                }
                balance = balance + amount;
                System.out.println("your balance is now " + balance + " pounds");
            }
            /**
             * If choice is 3 then Inquire
             */
            if(choice == 3)
            {
                System.out.println("***************************************");
                System.out.println("                Inquire                ");
                System.out.println("***************************************");
                System.out.println("your balance is currently " + balance + " pounds");
            }
            /**
             * If choice is 4 then Exit
             */
            if(choice == 4)
            {
                System.out.println("***************************************");
                System.out.println("                Exit                ");
                System.out.println("***************************************");
                System.out.println("Thank you for using the ATM");
                exit = true;
            }
        }
        System.exit(0);
    }
}
