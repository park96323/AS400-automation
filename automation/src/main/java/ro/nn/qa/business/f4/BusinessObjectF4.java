package ro.nn.qa.business.f4;

import ro.nn.qa.business.BusinessObjectX;

/**
 * Created by Alexandru Giurovici on 18.09.2015.
 */
public class BusinessObjectF4 extends BusinessObjectX
{
    protected BusinessObjectX owner;

    public BusinessObjectF4(BusinessObjectX own)
    {
        this.screen = own.getScreen();
        owner = own;
    }

    public <T extends BusinessObjectX> T submit() throws InterruptedException {
        enter();
        return (T) owner;
    }

    public void search(String s, int numTabs) throws InterruptedException
    {
        if (s.length() > 0)
        {
            send(s, 0);
            enter();
        }
        tab(numTabs);
        send("1", 0);
    }

}
