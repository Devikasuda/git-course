package com.TechIT.AnonymousInnerClass;

class An
{
    public void show()
    {
        System.out.println("In A show");
    }
}
public class Inheritance_to_AnonInnerClss
{
    public static void main(String[] args)
    {
        An obj = new An()
        {
            public void show()
            {
                System.out.println("In B show");
            }
        };
        obj.show();
    }
}
