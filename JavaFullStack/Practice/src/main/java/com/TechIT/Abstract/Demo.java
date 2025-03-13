package com.TechIT.Abstract;

abstract class Car
{
    public abstract void drive();
    public void playmusic()
    {
        System.out.println("Sound On");
    }
}

class Tesla extends Car
{

        public void drive()
        {
            System.out.println("Jst watch car will drive");
        }

    }
    public class Demo
    {
        public static void main(String[] args) {

            Tesla obj = new Tesla();
            obj.drive();
        }
    }


