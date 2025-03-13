package com.TechIT.Interface;

//  Interface is not a class
// By default all methods in interface is abstract. It's okay not to mentions methods as abstract
/*

1. Purpose

-- Abstract Class:
An abstract class is used when you want to provide a common base for other classes.
It can have both abstract methods (methods without implementation) and concrete methods (methods with implementation). Abstract classes are used to represent an "is-a" relationship and allow you to share common functionality while leaving some methods for subclasses to implement.
-- Interface:
An interface is used to define a contract that classes must adhere to.
It specifies what a class should do, but not how to do it.
Interfaces contain only method declarations (no method bodies) and constants, and they enforce that the implementing class provides the actual implementation of those methods.

2. Method Implementation

-- Abstract Class:
Can have both abstract methods (no implementation) and concrete methods (with implementation). Subclasses can override the abstract methods, but they inherit concrete methods as-is or override them.
-- Interface:
Can only have abstract methods (no implementation) by default, although some languages (like Java 8 and later) allow default methods (methods with implementation). In earlier versions of Java, interfaces could only declare methods and could not have any method implementations.

3. Multiple Inheritance

-- Abstract Class:
A class can inherit only one abstract class because many OOP languages (like Java, C#) don't support multiple inheritance for classes. However, a class can implement multiple interfaces.
-- Interface:
A class can implement multiple interfaces. This allows for multiple inheritance of behavior, which is not possible with abstract classes (at least not directly in languages like Java and C#).

4. Fields (Variables)

-- Abstract Class:
Can have instance variables (fields) with any access modifier (private, protected, public). These fields can be initialized or have specific values set in constructors.
-- Interface:
Can only have static final variables (constants). These variables are implicitly public, static, and final, meaning they must be initialized when declared and cannot be changed.

5. Constructor

-- Abstract Class:
Can have constructors that can be used by its subclasses to initialize fields or perform setup tasks.
-- Interface:
Cannot have constructors. Interfaces are not meant to be instantiated directly.

6. Access Modifiers

-- Abstract Class:
Can have methods with different access modifiers (public, protected, private). This allows more control over the visibility of the class members.
-- Interface:
All methods in an interface are implicitly public (even if you don’t specify public). Therefore, you cannot restrict the access level of the methods in an interface.

7. When to Use:

-- Abstract Class:
Use when you want to provide a common base for related classes that share common functionality. Abstract classes are a good choice when the classes are closely related (e.g., a common base class with shared code).
-- Interface:
Use when you need to define a contract that multiple, unrelated classes should follow. Interfaces are ideal when you need to allow different classes to implement the same set of methods regardless of their class hierarchy.

8. Inheritance vs. Implementation:

-- Abstract Class:
A class inherits an abstract class. Inheritance implies a "is-a" relationship where the subclass is a specialized version of the abstract class.
-- Interface:
A class implements an interface. Implementation implies that the class provides the behavior defined by the interface but doesn't have to follow any specific implementation pattern from a parent class.


 */

public class Notes {
}
