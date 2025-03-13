package com.TechIT.Enum;

enum Status
{
    Running, failed, Pending, Success;
}
public class Main {
    public static void main(String[] args) {

        Status s = Status.failed;
        System.out.println(s.ordinal());
    }
}

