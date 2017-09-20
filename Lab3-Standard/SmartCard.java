
public class SmartCard
{
    protected boolean staff = false;
    protected String name;
    protected SmartCard(String str)
    {
        name = str;
    }
    protected String getOwner()
    {
        return name;
    }
    protected boolean isStaff()
    {
        return staff;
    }
    protected void setStaff(boolean bool)
    {
        staff = bool;
    }
}
