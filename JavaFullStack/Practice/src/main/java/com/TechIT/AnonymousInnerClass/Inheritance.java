package com.TechIT.AnonymousInnerClass;

class A
{
    public void show()
    {
        System.out.println("In A show");
    }
}
class B extends A
{
    public void show()
   {
       System.out.println("In B show");
   }

}

public class Inheritance
{
    public static void main(String[] args)
    {
        A obj = new A();
        B obj1 = new B();
        obj1.show();

    }

}

