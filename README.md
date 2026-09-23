# Builder Design Pattern in Java

##  Overview

This project demonstrates the **Builder Design Pattern** in Java using a `Computer` example.

The Builder Pattern is a **Creational Design Pattern** that helps us create complex objects step by step. It is especially useful when a class has many fields or optional parameters.

Instead of creating an object using a constructor with many parameters, we can use a Builder to set the required properties one by one and finally create the object using the `build()` method.

---

##  Why Use the Builder Pattern?

Consider a `Computer` class with several properties:

- Brand
- Operating System
- Cost
- WiFi
- Processor
- Color

Without the Builder Pattern, we may need to use a constructor like:

java
Computer computer = new Computer(
    "Dell",
    "Windows",
    60000,
    true,
    "Intel i5",
    "Black"
);
Using the Builder Pattern, the same object can be created in a more readable way:
Computer computer = Computer.builder()
        .setBrand("Dell")
        .setOsType("Windows")
        .setCost(75000)
        .setWifi(true)
        .setProcessor("Intel i7")
        .setColor("Black")
        .build();
