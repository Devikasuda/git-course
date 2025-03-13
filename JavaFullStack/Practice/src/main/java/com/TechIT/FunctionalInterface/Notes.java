package com.TechIT.FunctionalInterface;

/*
It is an interface which has only 1 method in it.
We can call this Interface as Single Abstract Interface. To specify this is a functional interface we use @
For interface we just directly create obj we have to create a class to implement or mention AnonymousInnerClass.
In Java 8, they made sure that Java is not anymore Verbose(Specifying Everything, Detailing).
We got a new feature in Java 8 - Lamda Expression.(Conversion of AnonymousInner to Simple Version)

 */
@FunctionalInterface
interface A
{
    public void show();
}
public class Notes {
    public static void main(String[] args) {


        A obj = () -> System.out.println("In A show");
        obj.show();
    }
}

/*
Types of Interfaces
1. Normal - An interface with 2/more abstract methods.
2. Functional - An interface with single abstract method
3. Marker - An interface which has no methods

 */