public class WhatHappens
{
    int x;
    
    public WhatHappens()
    {
        x = 3;
    }
    
    public static void One(WhatHappens a)
    {
        a.x++;
    }
    
    public static void Two(int a)
    {
        a++;
    }
}