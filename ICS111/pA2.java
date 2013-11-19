/**Part A2 (Thursday)
 *
 *
 * @author Barryn Chun
 * @version 1.0
 */

/**With an Array instead of an ArrayList*/

public class pA2
{
    //private ArrayList<String> array = new ArrayList<String>();
    private String[] array = new String[10];
    private int elements = 0;
    
    //2
    public void addString(String s)
    {
        //this.array.add(s);
        try
        {
            for(int x = 0; x < array.length; x++)
            {
                if(array[x] == null)
                {
                    this.array[x] = s;
                    this.elements = elements++;
                    break;
                }
            }
        }
        catch(Exception error)
        {
            
        }
    }
    //3
    public String getString(int n)
    {
        try
        {
            String s = array[n];
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
            this.array[n] = s;
        }
        catch (Exception error)
        {
        }
    }
    //5
    public void remLastString()
    {
        //this.array.remove(this.array.size()-1);
        
        for(int x = 0; x < this.array.length; x++)
        {
            if(this.array[x] == null)
            {
                this.array[x-1] = null;
                this.elements = elements--;
                break;
            }
        }
    }
    //6
    public boolean arrayHas(String s)
    {
        boolean contains = false;
        
        for(int x = 0; x < this.array.length; x++)
        {
            if (s.equals(this.array[x]) == true)
            {
                contains = true;
            }
        }
        return contains;
    }
    //EXTRA METHOD TO PRINT ARRAY
    public void print()
    {
        for(int x = 0; x < this.array.length; x++)
        {
            if(this.array[x] != null)
            {
                System.out.println(this.array[x]);
            }
        }
    }
}