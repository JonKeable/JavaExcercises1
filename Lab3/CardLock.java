
public class CardLock
{
    protected SmartCard lastCard;
    protected boolean locked;
    protected boolean studentaccess;
    protected CardLock()
    {
        locked = true;
        studentaccess = false;
    }
    protected void swipeCard(SmartCard myCard)
    {
        lastCard = myCard;
        lockDoor(lastCard);
    }
    protected void lockDoor(SmartCard myCard)
    {
        if(studentaccess)
            {
                locked = false;
            }
        else
        {
            if(myCard.isStaff())
            {
                locked = false;
            }
            else
            {
                locked = true;
            }
        }
    }
    protected SmartCard getLastCardSeen()
    {
        return lastCard;
    }
    protected boolean isUnlocked()
    {
        return !locked;
    }
    protected void toggleStudentAccess()
    {
        studentaccess = !studentaccess;
    }
}
