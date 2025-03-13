package com.TechIT.Enum;

/*
ENUM (short for Enumeration) is a special data type in Java that represents a fixed set of constant values.
It is used when you have a collection of predefined values that do not change, such as days of the week,
status codes, or directions.

Why Use ENUM? -- Even though enum is a class we cannot extend can define methods, constructors and
create own variables. Enum in java extends Enum class

Improves Readability & Maintainability – Instead of using integer or string constants,
ENUM provides meaningful names.
Type Safety – Prevents assigning invalid values.
Better Code Organization – Groups related constants together.
Prevents Errors – Only allows predefined values, reducing mistakes.

Constants are all upper cases. It is public, static and final
 */
enum Level
{
    LOW,
    MEDIUM,
    HIGH;
}
public class Demo {
    public static void main(String[] args) {
        Level obj = Level.LOW;
        System.out.println(obj);
        Level [] x = Level.values();
        System.out.println(x[2]);
        System.out.println(obj.getClass().getSuperclass());
    }

}
