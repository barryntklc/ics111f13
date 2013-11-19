/**Part A (Tuesday)
 *
 *
 * @author Barryn Chun
 * @version 1.0
 */

import java.util.ArrayList;

public class pA
{
    private ArrayList<String> array = new ArrayList<String>();
    
    //2
    public void addString(String s)
    {
        this.array.add(s);
    }
    //3
    public String getString(int n)
    {
        try
        {
            String s = this.array.get(n);
            return s;
        }
        catch (Exception error)
        {
            return null;
        }
    }
    //4
    public void repString(int n, String s)
    {
        try
        {
            this.array.add(n, s);
        }
        catch (Exception error)
        {
        }
    }
    //5
    public void remLastString()
    {
        this.array.remove(this.array.size()-1);
    }
    //6
    public boolean arrayHas(String s)
    {
        for(int x = 0; x < this.array.size(); x++)
        {
            if (this.array.contains(s) == true)
            {
                return true;
            }
        }
        return false;
    }
    //EXTRA METHOD TO PRINT ARRAY
    public void print()
    {
        for(int x = 0; x < array.size(); x++)
        {
            System.out.println(this.array.get(x));
        }
    }
}