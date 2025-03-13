package com.TechIT.Enum;

enum Laptops
{


    MacBook(2000),
    XPS(200),
    Surface(100),
    ThinkPad(500);

    private int price;

    private Laptops(int price)
    {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Laptops x = Laptops.MacBook;
        System.out.println(x.getPrice());

    }
}
