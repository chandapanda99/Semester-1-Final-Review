
/**
 * Write a description of class FERP2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import java.text.*;
public class FERP2
{   
    public static void main(String[] args)
    {
        promptEnterKey enter = new promptEnterKey();
        
        System.out.println("Number 1");
        WhatHappens A = new WhatHappens();
        WhatHappens B = A;
        WhatHappens.One(A);
        A.x++;
        WhatHappens.Two(A.x);
        WhatHappens.One(B);
        B.x++;
        WhatHappens.Two(B.x);
        System.out.println(A.x + " " + B.x);
        enter.EnterKey();
        
        System.out.println("Number 2");
        DecimalFormat dmt = new DecimalFormat("##.##");
        System.out.printf("%.2f", 56.78398654357);
        System.out.println();
        enter.EnterKey();
        
        System.out.println("Number 3");
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Enter option (100, 200, 300, or 400): ");
        int choice = Keyboard.nextInt();
        String select = "";
        switch(choice)
        {
            case 100: select = "color tv";
            break;
            case 200: select = "color tv and 34\"";
            break;
            case 300: select = "color tv, 34\" and flat screen";
            break;
            case 400: select = "color tv, 34\", flat screen and HDTV";
            break;
            default: select = "Error. Learn to follow directions you imbecil";
            break;
        }
        System.out.println(select);
        enter.EnterKey();
    }
}
