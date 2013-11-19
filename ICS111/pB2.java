/**Part B2 (Thursday)
 *
 *
 * @author Barryn Chun
 * @version 1.0
 */

import java.util.Scanner;

public class pB2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
       
        pA2 stringList = new pA2();
        
        String inputString = "";
        int inputInt = 0;
        //2
        while(inputString.equals("quit") == false)
        {
            inputString = scan.nextLine();
            
            if (inputString.equals("quit") == false)
            stringList.addString(inputString);
        }
        
        //3
        System.out.println("Enter indexes (-1 to quit):");
        while(inputInt != -1)
        {
            inputInt = scan.nextInt();
            
            if (inputInt != -1)
            System.out.println("String at Index " + inputInt + ": " + stringList.getString(inputInt));
        }
        Scanner scan2 = new Scanner(System.in);
        
        System.out.print("Enter an index:");
        int index = scan.nextInt();
        System.out.print("Enter a string:");
        String input = scan2.nextLine();
        //System.out.println(input);
        
        System.out.println("\nOutputted Strings:");
        stringList.repString(index, input);
        stringList.print();
        
        System.out.println("\nOutputted Strings:");
        stringList.remLastString();
        stringList.print();
        
        System.out.println();
        
        System.out.print("Enter a string to check for:");
        input = scan2.nextLine();
        
        boolean has = stringList.arrayHas(input);
        if(has == true)
        {
            System.out.println("This array has the string " + input);
        }
        else
        {
            System.out.println("This array does not have the string " + input);
        }
    }
}