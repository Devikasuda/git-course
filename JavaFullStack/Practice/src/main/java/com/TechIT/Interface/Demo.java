package com.TechIT.Interface;


//  Interface is not a class
// By default all methods in interface is abstract. It's okay not to mentions methods as abstract
// Variables in interface are public, static, final. As final and static interface don't have constructors
// Interface don't have memory in Heap

interface A
{
    public abstract void show();
    public abstract void config();
}

class B implements A
{
      public void show()
      {
          System.out.println("In A show");
      }
      public void config()
      {
          System.out.println("In A config");
      }
}

public class Demo {
    public static void main(String[] args) {
        A obj = new B();
        obj.config();
        obj.show();
    }
}
