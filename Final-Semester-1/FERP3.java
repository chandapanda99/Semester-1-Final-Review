/**
 * Write a description of class FERP3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class FERP3
{
    public static void main(String[] args)
    {
        promptEnterKey enter = new promptEnterKey();
        
        System.out.println("Number 1");
        for (int k = 1; k<= 4; ++k)
        {
            for ( int j = 1; j<=3 ; ++j)
            {
                System.out.print( k + j);
            }
            System.out.println();
        }
        enter.EnterKey();
        
        System.out.println("Number 3");
        int x = 1;
        while (x < 100)
		{
		    x*=2;
		}
		System.out.println(x);
		enter.EnterKey();
		
		System.out.println("Number 4");
		int j = 0, k = 0;

        for (k=0; k<5; k++)
        {
        	for ( j = k ; j<5; ++j) 
        	{
        	    System.out.print("*");
        	}
        }
        System.out.println();
        enter.EnterKey();
        
        System.out.println("Number 5");
        int count = 0; int stop = 3;
        while (count < stop)
        {
            for (int a = -1; a<=count; ++a)
            {
        	    System.out.print(a);
            }
            System.out.print("\n");
            
            count +=1;
        }
        enter.EnterKey();
        
        System.out.println("Number 6");
        Scanner Keyboard = new Scanner(System.in);
        
        System.out.print("Enter Integer: ");
        int max = Keyboard.nextInt();
        
        int keep = 1;
        while (keep != 10)
        {
            System.out.print("Enter Integer: ");
            int num = Keyboard.nextInt();
            if (num > max)
            {
                max = num;
            }
            keep++;
        }
        System.out.println("Maximum: " + max);
        enter.EnterKey();
        
        System.out.println("Number 7");
        System.out.println("Enter a positive number or -999 to stop");
        int b = Keyboard.nextInt();
        for (int p = 1; b!= -999; p += b)
        {
            System.out.println("Enter a positive number or -999 to stop");
            b = Keyboard.nextInt();
        }
    }
}