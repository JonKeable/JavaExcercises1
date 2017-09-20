
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
    }
    protected SmartCard getLastCardSeen()
    {
        return lastCard;
    }
    protected boolean isUnlocked()
    {
        if(studentaccess)
            {
                locked = false;
            }
        else
        {
            if(lastCard.isStaff())
            {
                locked = false;
            }
            else
            {
                locked = true;
            }
        }
        return !locked;
    }
    protected void toggleStudentAccess()
    {
        studentaccess = !studentaccess;
    }
}
